package codacy.pmdjava

import java.nio.charset.StandardCharsets
import java.nio.file.{StandardOpenOption, Files, Path}
import codacy.dockerApi._
import play.api.libs.json.{JsString, Json}
import scala.io.Source
import scala.sys.process._
import scala.util.{Success, Try}
import scala.xml.{Unparsed, Elem, XML}

object PmdJava extends Tool{

  override def apply(path: Path, conf: Option[Seq[PatternDef]], files: Option[Set[Path]])(implicit spec: Spec): Try[Iterable[Result]] = {
    resultFile().flatMap{ case resultFilePMD =>
      println(resultFilePMD)
      getCommandFor(path, conf, files, spec, resultFilePMD).flatMap{ case cmd =>
        println(cmd)

        val tt = cmd.!(discardingLogger)
        println(
          Source.fromFile(resultFilePMD.toFile).getLines().mkString(System.lineSeparator())
        )
        Try(XML.loadFile(resultFilePMD.toFile)).map(outputParsed)
      }
    }
  }

  private[this] lazy val ruleSetsDefault = Seq(
    "android","basic","braces","clone","codesize","comments","controversial",
    "coupling","design","empty","finalizers","imports","junit","migrating",
    "naming","optimizations","sunsecure","strictexception","strings",
    "typeresolution","unnecessary","unusedcode").map{ case base => s"java-$base"}.mkString(",")

  //we are using an output file we don't care for stdout or err...
  private[this] val discardingLogger = ProcessLogger((l:String) => println(s"ERR $l"))


  private[this] def resultFile(): Try[Path] = Try(
    Files.createTempFile("pmd-result",".xml")
  )

  private[this] def getCommandFor(path: Path, conf: Option[Seq[PatternDef]], files: Option[Set[Path]], spec: Spec, outputFilePath: Path): Try[Seq[String]] = {

    val configPath = conf.map{ case config =>
      getConfigFile(config).map(_.toAbsolutePath.toString)
    }.getOrElse( Success(ruleSetsDefault) )

    configPath.map{ case configuration =>
      val configurationCmd = Seq("-rulesets", configuration)

      val filesCmd = files.filter(_.nonEmpty).map(_.mkString(",")).getOrElse(path.toAbsolutePath.toString)
      //maybe someone want's to create a symlink for this in build.sbt
      Seq("/usr/local/pmd-bin-5.3.2/bin/run.sh", "pmd", "-d", filesCmd, "-f", "xml", "-r", outputFilePath.toAbsolutePath.toString) ++ configurationCmd
    }
  }

  private[this] def xmlLocation(ruleName:String,ruleSet:String) = {
    s"rulesets_java_${ ruleSet.toLowerCase() }.xml_$ruleName"
  }

  private[this] def patternIdByRuleNameAndRuleSet(ruleName: String, ruleSet:String)(implicit spec: Spec):Option[PatternId] = {
    spec.patterns.collectFirst{ case pattern if pattern.patternId.value == xmlLocation(ruleName,ruleSet) =>
      pattern.patternId
    }
  }

  private[this] def outputParsed(outputXml:Elem)(implicit spec: Spec) = {
    (outputXml \ "file").flatMap{ case file =>
      lazy val fileName = SourcePath((file \@ "name"))

      (file \ "violation").flatMap{ case violation =>
        Try(
          patternIdByRuleNameAndRuleSet(
            ruleName = violation \@ "rule",
            ruleSet = violation \@ "ruleset"
          ).map{ case patternId =>
            Result(
              filename = fileName,
              message = ResultMessage(violation.text.trim),
              patternId = patternId,
              line = ResultLine((violation \@ "beginline").toInt)
            )
          }
        ).toOption.flatten[Result]
      }
    }
  }

  private[this] def getConfigFile(conf: Seq[PatternDef]): Try[Path] = {
    val rules = for {
      pattern <- conf
      patternConfiguration <- generateRule(pattern.patternId, pattern.parameters)//pattern.parameters)
    } yield patternConfiguration

    val xmlConfiguration =

        <ruleset name="All Java Rules"
            xmlns="http://pmd.sourceforge.net/ruleset/2.0.0"
            xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
            xsi:schemaLocation="http://pmd.sourceforge.net/ruleset/2.0.0 http://pmd.sourceforge.net/ruleset_2_0_0.xsd">
          { rules }
        </ruleset>

    fileForConfig(xmlConfiguration)
  }

  private[this] def fileForConfig(config:Elem) = tmpfile(config.toString())

  private[this] def tmpfile(content:String,prefix:String="ruleset",suffix:String=".xml"): Try[Path] = {
    println(".---------.")

    println(content)

    println(".---------.")

    Try(Files.write(
      Files.createTempFile(prefix,suffix),
      content.getBytes(StandardCharsets.UTF_8),
      StandardOpenOption.CREATE
    ))
  }

  private[this] def getPatternNameById(patternId: PatternId): String = {
    patternId.value.replace('_', '/')
  }

  private[this] def generateRule(patternId: PatternId, parameters: Option[Set[ParameterDef]]): Elem = {

    val xmlPorperties = parameters.map(_.map(generateParameter)).getOrElse(Set.empty)

    <rule ref={ getPatternNameById(patternId) }>
      <properties>{ xmlPorperties }</properties>
    </rule>
  }

  private[this] def generateParameter(parameter: ParameterDef): Elem = {
    val parameterValue = parameter.value match{
      case JsString(value) => value
      case other => Json.stringify(other)
    }
    <property name={parameter.name} value={parameterValue} />
  }


}
