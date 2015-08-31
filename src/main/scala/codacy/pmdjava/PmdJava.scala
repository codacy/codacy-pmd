package codacy.pmdjava

import java.nio.charset.StandardCharsets
import java.nio.file.{Files, Path, Paths, StandardOpenOption}

import codacy.dockerApi._
import play.api.libs.json.{JsString, Json}

import scala.sys.process._
import scala.util.{Properties, Success, Try}
import scala.xml.{Elem, XML}

object PmdJava extends Tool {

  override def apply(path: Path, conf: Option[Seq[PatternDef]], files: Option[Set[Path]])(implicit spec: Spec): Try[Iterable[Result]] = {
    commandFor(path, conf, files, spec, resultFilePath).flatMap { cmd =>
      cmd.!(discardingLogger)
      Try(XML.loadFile(resultFilePath.toFile)).map { res =>
        outputParsed(res)
      }
    }
  }

  private[this] lazy val ruleSetsDefault = {
    import RuleSets._
    Seq(
      android, basic, braces, clone_, codesize, comments, controversial,
      coupling, design, empty, finalizers, imports, junit, migrating,
      naming, optimizations, sunsecure, strictexception, strings,
      typeresolution, unnecessary, unusedcode).map { group => s"java-$group" }.mkString(",")
  }

  // we are using an output file we don't care for stdout or err...
  private[this] lazy val discardingLogger = ProcessLogger((_: String) => ())

  private[this] lazy val resultFilePath = Paths.get(Properties.tmpDir, "pmd-result.xml")

  private[this] def commandFor(path: Path, conf: Option[Seq[PatternDef]], files: Option[Set[Path]], spec: Spec, outputFilePath: Path): Try[Seq[String]] = {
    val configPath = conf.map(configFile(_).map(_.toAbsolutePath.toString)).getOrElse(Success(ruleSetsDefault))

    configPath.map { case configuration =>
      val configurationCmd = Seq("-rulesets", configuration)

      val filesCmd = files.map(_.mkString(",")).getOrElse(path.toAbsolutePath.toString)
      //maybe someone want's to create a symlink for this in build.sbt
      Seq(
        "/usr/local/pmd-bin-5.3.2/bin/run.sh", "pmd",
        "-d", filesCmd, "-f", "xml",
        "-r", outputFilePath.toAbsolutePath.toString) ++ configurationCmd
    }
  }

  //"Java Logging" -> "logging-java" -> logging-java_GuardLogStatementJavaUtil
  private[this] def patternIdByRuleNameAndRuleSet(ruleName: String, ruleSet: String)(implicit spec: Spec): Option[PatternId] = {
    RuleSets.byRuleSetName(ruleSet).flatMap { ruleSet =>
      val patternId = PatternId(s"${ruleSet}_$ruleName")
      spec.patterns.collectFirst { case patternDef if patternDef.patternId == patternId => patternDef.patternId }
    }
  }

  private[this] def relativizeToolOutputPath(path: String): SourcePath = {
    SourcePath(DockerEnvironment.sourcePath.relativize(Paths.get(path)).toString)
  }

  private[this] def outputParsed(outputXml: Elem)(implicit spec: Spec): Iterable[Result] = {
    val issues = (outputXml \ "file").flatMap { case file =>
      lazy val fileName = {
        val path = Paths.get(file \@ "name")
        val relativePath = DockerEnvironment.sourcePath.relativize(path)
        SourcePath(relativePath.toString)
      }

      (file \ "violation").flatMap { case violation =>
        patternIdByRuleNameAndRuleSet(
          ruleName = violation \@ "rule",
          ruleSet = violation \@ "ruleset"
        ).flatMap { case patternId =>
          Try(
            Issue(
              filename = fileName,
              message = ResultMessage(violation.text.trim),
              patternId = patternId,
              line = ResultLine((violation \@ "beginline").toInt)
            )
          ).toOption
        }
      }
    }

    val errors = (outputXml \ "error").map { case error =>
      val path = relativizeToolOutputPath(error \@ "filename")
      val message = Option(error \@ "msg").collect { case msg if msg.nonEmpty => ErrorMessage(msg) }
      FileError(path, message)
    }
    issues.toSet ++ errors
  }

  private[this] def configFile(conf: Seq[PatternDef]): Try[Path] = {
    val rules = conf.map(generateRule)

    val xmlConfiguration =

      <ruleset name="All Java Rules"
               xmlns="http://pmd.sourceforge.net/ruleset/2.0.0"
               xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
               xsi:schemaLocation="http://pmd.sourceforge.net/ruleset/2.0.0 http://pmd.sourceforge.net/ruleset_2_0_0.xsd">
        {rules}
      </ruleset>

    fileForConfig(xmlConfiguration)
  }

  private[this] def fileForConfig(config: Elem) = tmpfile(config.toString())

  private[this] def tmpfile(content: String, prefix: String = "ruleset", suffix: String = ".xml"): Try[Path] = {
    println(
      s"""config:
         |$content
       """.stripMargin)

    Try(Files.write(
      Files.createTempFile(prefix, suffix),
      content.getBytes(StandardCharsets.UTF_8),
      StandardOpenOption.CREATE
    ))
  }

  private[this] def patternNameById(patternId: PatternId): String = patternId.value.split("_") match {
    case Array(patternCategory, patternName) => s"""rulesets/java/$patternCategory.xml/$patternName"""
    case _ => ""
  }

  private[this] def generateRule(patternDef: PatternDef): Elem = {
    val xmlProperties = patternDef.parameters.map(_.map(generateParameter)).getOrElse(Set.empty)

    <rule ref={patternNameById(patternDef.patternId)}>
      <properties>
        {xmlProperties}
      </properties>
    </rule>
  }

  private[this] def generateParameter(parameter: ParameterDef): Elem = {
    val parameterValue = parameter.value match {
      case JsString(value) => value
      case other => Json.stringify(other)
    }

      <property name={parameter.name} value={parameterValue}/>
  }
}
