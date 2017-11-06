package codacy.pmd

import java.io.{File => JavaFile}
import java.nio.file.{Files, Path, Paths}
import java.util.Collections

import codacy.docker.api._
import codacy.dockerApi.utils.FileHelper
import net.sourceforge.pmd
import net.sourceforge.pmd.lang.Language
import net.sourceforge.pmd.renderers.Renderer
import net.sourceforge.pmd.util.ResourceLoader
import net.sourceforge.pmd.{PMDConfiguration, RuleContext, RuleSet, RuleSets, RulesetsFactoryUtils}
import play.api.libs.json.{JsString, JsValue, Json}

import scala.collection.JavaConversions._
import scala.util.{Failure, Properties, Success, Try}
import scala.xml.{Source => _, _}

object PMD extends Tool {

  private lazy val configFileNames = Set("ruleset.xml", "apex-ruleset.xml")

  private lazy val deprecatedReferences: Map[String, String] = DocGenerator.listDeprecatedPatterns

  override def apply(source: Source.Directory, configuration: Option[List[Pattern.Definition]], filesOpt: Option[Set[Source.File]], options: Map[Configuration.Key, Configuration.Value])
                    (implicit specification: Tool.Specification): Try[List[Result]] = {
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
        FileHelper.findConfigurationFile(configFileNames, new JavaFile(source.path).toPath).foreach { ruleset =>
          pmdConfig.setRuleSets(ruleset.toString)
        }
    }

    // Load the RuleSets
    val ruleSetFactory = RulesetsFactoryUtils.getRulesetFactory(pmdConfig, new ResourceLoader())

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

        val errors = codacyRenderer.getErrors.to[List].map { error =>
          Result.FileError(Source.File(error.getFile), Some(ErrorMessage(error.getMsg)))
        }

        ruleViolations ++ errors
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

  private def configFile(conf: List[Pattern.Definition])(implicit specification: Tool.Specification): Try[Path] = {
    val updatedRules = conf.flatMap { pattern =>
      val newPatternId = pattern.patternId.value.split("_") match {
        case Array(patternCategory, patternName) => Some(s"""rulesets_java_${patternCategory}_$patternName""")
        case Array(langAlias, patternCategory, patternName) => Some(s"""rulesets_${langAlias}_${patternCategory}_$patternName""")
        case Array(root, langAlias, patternCategory, patternName) => Some(s"""${root}_${langAlias}_${patternCategory}_$patternName""")
        case _ => None
      }

      newPatternId.map { npid =>
        pattern.copy(patternId = Pattern.Id(deprecatedReferences.getOrElse(npid, npid)))
      }
    }

    // Filter rules that are not listed in patterns.json
    val existingPatternIds = specification.patterns.map(_.patternId)
    val rules = updatedRules.flatMap {
      case pattern if existingPatternIds.contains(pattern.patternId) => generateRule(pattern)
      case _ => None
    }

    val xmlConfiguration =
      <ruleset name="Codacy Ruleset"
               xmlns="http://pmd.sourceforge.net/ruleset/2.0.0"
               xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
               xsi:schemaLocation="http://pmd.sourceforge.net/ruleset/2.0.0 http://pmd.sourceforge.net/ruleset_2_0_0.xsd">
        <description>Codacy UI Ruleset</description>{rules}
      </ruleset>

    fileForConfig(xmlConfiguration)
  }

  private def fileForConfig(config: Elem) = tmpfile(config)

  private[this] def tmpfile(content: Elem, prefix: String = "ruleset", suffix: String = ".xml"): Try[Path] = {
    Try {
      val tmpFile = Files.createTempFile(prefix, suffix)
      XML.save(tmpFile.toAbsolutePath.toString, content, "UTF-8", xmlDecl = true, null)
      tmpFile
    }
  }

  private[this] def referenceFromPatternId(patternId: Pattern.Id): Option[String] = {
    patternId.value.split("_") match {
      case Array(root, langAlias, patternCategory, patternName) =>
        Some(s"""$root/$langAlias/$patternCategory.xml/$patternName""")

      case _ =>
        None
    }
  }

  private[this] def generateRule(patternDef: Pattern.Definition): Option[Elem] = {
    referenceFromPatternId(patternDef.patternId).map {
      case ruleId if patternDef.parameters.exists(_.nonEmpty) =>
        val xmlProperties = patternDef.parameters
          // HACK: Codacy converts the version parameter from 2.0 to 2 leading PMD to fail, excluding it for now
          .map(_.filter(_.name.value != "version"))
          .map(_.map(generateParameter)).getOrElse(Set.empty)

        <rule ref={ruleId}>
          <properties>
            {xmlProperties}
          </properties>
        </rule>

      case ruleId =>
          <rule ref={ruleId}/>
    }
  }

  private[this] def generateParameter(parameter: Parameter.Definition): Elem = {
    val parameterValue: JsValue = parameter.value
    val paramValue = parameterValue match {
      case JsString(value) => value
      case other => Json.stringify(other)
    }

    if (paramValue.contains(Properties.lineSeparator)) {
      <property name={parameter.name.value}>
        <value>
          {PCData(paramValue)}
        </value>
      </property>
    } else {
        <property name={parameter.name.value} value={paramValue}/>
    }
  }

}
