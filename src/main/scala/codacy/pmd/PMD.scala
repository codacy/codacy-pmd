package codacy.pmd

import java.io.{File, OutputStream, PrintStream}
import java.nio.file.{Files, Path, Paths}
import java.util.Collections

import codacy.docker.api._
import codacy.helpers.ResourceHelper
import net.sourceforge.pmd
import net.sourceforge.pmd.lang.Language
import net.sourceforge.pmd.renderers.Renderer
import net.sourceforge.pmd.{PMDConfiguration, RuleContext, RuleSet, RuleSets, RulesetsFactoryUtils}
import play.api.libs.json.{JsString, JsValue, Json}

import scala.collection.JavaConversions._
import scala.util.{Failure, Success, Try}
import scala.xml.Elem

object PMD extends Tool {

  private lazy val configFileNames = Set("ruleset.xml")

  override def apply(source: Source.Directory, configuration: Option[List[Pattern.Definition]], filesOpt: Option[Set[Source.File]])
                    (implicit specification: Tool.Specification): Try[List[Result]] = {
    swallowStderr()

    val pmdConfig = new PMDConfiguration()

    filesOpt.fold[Unit] {
      pmdConfig.setInputFilePath(source.path)
    } { files =>
      val filesStr = files.map(_.path).mkString(",")
      pmdConfig.setInputPaths(filesStr)
    }

    configuration match {
      case Some(config) =>
        configFile(config) match {
          case Success(ruleset) =>
            pmdConfig.setRuleSets(ruleset.toString)

          case Failure(_) =>
        }

      case None =>
        val root = new File(source.path)
        configFileNames
          .map(new File(root, _))
          .collectFirst {
            case ruleset if ruleset.exists && ruleset.isFile =>
              pmdConfig.setRuleSets(ruleset.toString)
          }
    }

    // Load the RuleSets
    val ruleSetFactory = RulesetsFactoryUtils.getRulesetFactory(pmdConfig)

    val ruleSetsOpt = Option(RulesetsFactoryUtils.getRuleSets(pmdConfig.getRuleSets, ruleSetFactory))

    ruleSetsOpt.fold[Try[List[Result]]] {
      Failure(new Exception("No rulesets found"))
    } { ruleSets =>
      val languages = getApplicableLanguages(pmdConfig, ruleSets)

      val files = pmd.PMD.getApplicableFiles(pmdConfig, languages)

      Try {
        val codacyRenderer = new CodacyInMemoryRenderer()
        val renderer: Renderer = codacyRenderer
        val renderers = Collections.singletonList(renderer)

        pmd.PMD.processFiles(pmdConfig, ruleSetFactory, files, new RuleContext, renderers)

        val ruleViolations = codacyRenderer.getRulesViolations.to[List].flatMap { violation =>
          patternIdByRuleNameAndRuleSet(violation.getRule.getLanguage.getTerseName, violation.getRule.getName,
            violation.getRule.getRuleSetName).map {
            patternId =>
              Result.Issue(relativizeToolOutputPath(source, violation.getFilename),
                Result.Message(violation.getDescription),
                patternId,
                Source.Line(violation.getBeginLine))
          }
        }

        val suppressedViolations = codacyRenderer.getSuppressedViolations.to[List].flatMap { supressed =>
          val violation = supressed.getRuleViolation
          patternIdByRuleNameAndRuleSet(violation.getRule.getLanguage.getTerseName, violation.getRule.getName,
            violation.getRule.getRuleSetName).map {
            patternId =>
              Result.Issue(relativizeToolOutputPath(source, violation.getFilename),
                Result.Message(violation.getDescription),
                patternId,
                Source.Line(violation.getBeginLine))
          }
        }

        val errors = codacyRenderer.getErrors.to[List].map { error =>
          Result.FileError(Source.File(error.getFile), Some(ErrorMessage(error.getMsg)))
        }

        ruleViolations ++ suppressedViolations ++ errors
      }
    }
  }

  private def getApplicableLanguages(configuration: PMDConfiguration, ruleSets: RuleSets) = {
    val languages = new java.util.HashSet[Language]
    val discoverer = configuration.getLanguageVersionDiscoverer
    import scala.collection.JavaConversions._
    for (rule <- ruleSets.getAllRules) {
      val language = rule.getLanguage
      if (!languages.contains(language)) {
        val version = discoverer.getDefaultLanguageVersion(language)
        if (RuleSet.applies(rule, version)) {
          languages.add(language)
        }
      }
    }
    languages
  }

  private def swallowStderr(): Unit = {
    // Hide PMD errors from STDERR
    //    val err = System.err
    System.setErr(new PrintStream(new OutputStream() {
      def write(b: Int) {
      }
    }))
    //    System.setOut(err)
  }

  private def patternIdByRuleNameAndRuleSet(langAlias: String, ruleName: String, ruleSet: String)
                                           (implicit specification: Tool.Specification): Option[Pattern.Id] = {
    RuleSets.getRuleSet(ruleSet).flatMap { ruleSet =>
      val patternId = Pattern.Id(s"${langAlias}_${ruleSet}_$ruleName")
      specification.patterns.collectFirst { case patternDef if patternDef.patternId == patternId => patternDef.patternId }
    }
  }

  private def relativizeToolOutputPath(root: Source.Directory, file: String): Source.File = {
    val rootPath = Paths.get(root.path)
    val filePath = Paths.get(file)
    Source.File(rootPath.relativize(filePath).toString)
  }

  private def configFile(conf: List[Pattern.Definition]): Try[Path] = {
    val rules = conf.flatMap(generateRule)

    val xmlConfiguration =
      <ruleset name="All Java Rules"
               xmlns="http://pmd.sourceforge.net/ruleset/2.0.0"
               xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
               xsi:schemaLocation="http://pmd.sourceforge.net/ruleset/2.0.0 http://pmd.sourceforge.net/ruleset_2_0_0.xsd">
        {rules}
      </ruleset>

    fileForConfig(xmlConfiguration)
  }

  private def fileForConfig(config: Elem) = tmpfile(config.toString)

  private[this] def tmpfile(content: String, prefix: String = "ruleset", suffix: String = ".xml"): Try[Path] = {
    ResourceHelper.writeFile(Files.createTempFile(prefix, suffix), content)
  }

  private[this] def patternNameById(patternId: Pattern.Id): Option[String] = {
    patternId.value.split("_") match {
      case Array(patternCategory, patternName) => Some(s"""rulesets/java/$patternCategory.xml/$patternName""")
      case Array(langAlias, patternCategory, patternName) => Some(s"""rulesets/$langAlias/$patternCategory.xml/$patternName""")
      case _ => None
    }
  }

  private[this] def generateRule(patternDef: Pattern.Definition): Option[Elem] = {
    val xmlProperties = patternDef.parameters.map(_.map(generateParameter)).getOrElse(Set.empty)
    patternNameById(patternDef.patternId).map { ruleId =>
      <rule ref={ruleId}>
        <properties>
          {xmlProperties}
        </properties>
      </rule>
    }
  }

  private[this] def generateParameter(parameter: Parameter.Definition): Elem = {
    val parameterValue: JsValue = parameter.value
    val paramValue = parameterValue match {
      case JsString(value) => value
      case other => Json.stringify(other)
    }

      <property name={parameter.name.value} value={paramValue}/>
  }

}
