package codacy.pmdjava

import java.io
import java.io.File
import java.nio.file.Path

import codacy.dockerApi._

import codacy.Utils
import utils.FileHelper


import scala.util.{Properties, Failure, Success, Try}
import scala.xml.XML


object PmdJava extends Tool{

  private val ruleSetsDefault = "java-android,java-basic,java-braces,java-clone,java-codesize,java-comments,java-controversial,java-coupling,java-design,java-empty,java-finalizers,java-imports,java-junit,java-migrating,java-naming,java-optimizations,java-sunsecure,java-strictexception,java-strings,java-typeresolution,java-unnecessary,java-unusedcode"

  override def apply(path: Path, conf: Option[Seq[PatternDef]], files: Option[Set[Path]])(implicit spec: Spec): Try[Iterable[Result]] = {

    val resultFilePMD = FileHelper.randomFile("xml")

    val cmd : Seq[String] = getCommandFor(path, conf, files, spec, resultFilePMD.getAbsolutePath)

    // the cmd already has the path to the temporary file to store the results from pmd
    Utils.runCommand(cmd)

    FileHelper.readFile(resultFilePMD)
      .map(lines => Success(parseResult(lines.mkString).toIterable))
      .getOrElse(Failure(new Exception("Failed to read output")))

   }

  def getCommandFor(path: Path, conf: Option[Seq[PatternDef]], files: Option[Set[Path]], spec: Spec, outputFilePath: String): Seq[String] = {

    val configuration = conf.filter(_.nonEmpty).flatMap { patternDefs =>
     getConfigFile(patternDefs).map(_.getAbsolutePath)
    }.getOrElse(ruleSetsDefault)

    val configurationCmd = Seq("-rulesets", configuration)

    val filesCmd = files.filter(_.nonEmpty).map(_.mkString(",")).getOrElse(FileHelper.getStringFromPath(path))

    Seq("pmd", "pmd", "-d", filesCmd, "-f", "xml", "-r", outputFilePath) ++ configurationCmd

  }

  def parseResult(resultFromTool: String): Seq[Result] = {

    val result = XML.loadString(resultFromTool)

    val matches = (result \ "file").flatMap { file =>
      (file \ "violation").flatMap { violation =>
        val filename = (file \@ "name")
        val lineBegin = (violation \@ "beginline").toInt
        val message = violation.text

        createMatch(filename, lineBegin, message)
      }
    }
    matches
  }

  private def createMatch(filePath: String, line: Int, message: String): Option[Result] = {

    Some(Result(SourcePath(filePath), ResultMessage(message), getPatternIdByAbsoluteFileName(filePath) ,ResultLine(line)))
  }

  private def getConfigFile(conf: Seq[PatternDef]): Option[io.File] = {
    val rules = for {
      pattern <- conf
      patternConfiguration <- generateRule(pattern.patternId, pattern.parameters)//pattern.parameters)
    } yield patternConfiguration

    val xmlConfiguration =
      """
        <ruleset name="All Java Rules"
            xmlns="http://pmd.sourceforge.net/ruleset/2.0.0"
            xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
            xsi:schemaLocation="http://pmd.sourceforge.net/ruleset/2.0.0 http://pmd.sourceforge.net/ruleset_2_0_0.xsd">
      """ + rules.mkString(Properties.lineSeparator) + "</ruleset>"

    FileHelper.write(xmlConfiguration)
  }

  def getPatternIdByAbsoluteFileName(path: String): PatternId = {
    PatternId(FileHelper.getFileName(path))
  }


  def getPatternNameById(patternId: PatternId): String = {
    patternId.value.replace('_', '/')
  }

  private def generateRule(patternId: PatternId, parameters: Option[Set[ParameterDef]]): Option[String] = {

      val params = parameters.map(_.map(generateParameter).mkString(Properties.lineSeparator)).getOrElse("")

      Some("<rule ref=\"" + getPatternNameById(patternId) + "\"><properties>" + params + "</properties> </rule>")
  }

  private def generateParameter(parameter: ParameterDef): String = {
    val parameterValue = Utils.getStringValue(parameter.value)

    s"""<property name="${parameter.name}" value="$parameterValue" />"""

  }


}
