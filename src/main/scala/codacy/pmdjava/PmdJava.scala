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

  override def apply(path: Path, conf: Option[Seq[PatternDef]], files: Option[Set[Path]])(implicit spec: Spec): Try[Iterable[Result]] = {

    val dummyResultsGood = Seq(Result(SourcePath("filenameDummy"), ResultMessage("messageDummy"), PatternId("patternIdDummy"), ResultLine(1)))

    val confFile = getConfigFile(spec)

    val dummyTestFileName = files.get.head.toString //dummyTest



    val cmd : Seq[String] = generatePMDCommand(confFile.get.getAbsolutePath , dummyTestFileName)

    //val result : Seq[String] = Utils.runCommand(cmd)
    val result : String = Utils.runCommand(cmd)

    println("Result Start")


    val parsedResults = parseResult(result)

    //for(it <- result)
    //  println(it)
    //result.map(println)

    println("Result End")

    Success(parsedResults.toIterable)
   }

  def generatePMDCommand(confFilePath: String, testFilePath: String): Seq[String] = {
    Seq("pmd", "pmd", "-d", testFilePath, "-f", "xml", "-rulesets", confFilePath)
  }


  def parseResult(resultFromTool: String): Seq[Result] = {

    val result = XML.loadString(resultFromTool)

    val matches = (result \ "file").flatMap { file =>
      (file \ "violation").flatMap { violation =>
        val filename = (file \ "@name").toString()
        //val relativeFilename = FileHelper.getFileName(filename) //not sure if we will need it
        val lineBegin = (violation \ "@beginline").toString().toInt
        //val rule = (violation \ "@rule").toString() //pasta
        //val ruleSet = (violation \ "@ruleset").toString() //pasta
        val message = violation.text

        createMatch(filename, lineBegin, message)
      }
    }
    matches
  }

  //case class Result(filename:SourcePath,message:ResultMessage,patternId:PatternId,line: ResultLine)

  private def createMatch(filePath: String, line: Int, message: String): Option[Result] = {

    Some(Result(SourcePath(filePath), ResultMessage(message), getPatternIdByAbsoluteFileName(filePath) ,ResultLine(line)))
  }

  private def getConfigFile(spec: Spec): Option[io.File] = {
    val rules = for {
      pattern <- spec.patterns
      patternConfiguration <- generateRule(pattern.patternId, pattern.parameters)
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

  private def generateRule(patternId: PatternId, parameters: Option[Set[ParameterSpec]]): Option[String] = {

      val params = parameters.map(_.map(generateParameter).mkString(Properties.lineSeparator)).getOrElse("")

      Some("<rule ref=\"" + getPatternNameById(patternId) + "\"><properties>" + params + "</properties> </rule>")
  }

  private def generateParameter(parameter: ParameterSpec): String = {
      "<property name=\"" + parameter.name + "\" value=" + parameter.default + " />"  //If the double quotes are here, it places too many
  }

}
