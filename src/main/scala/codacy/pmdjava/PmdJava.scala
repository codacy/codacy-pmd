package codacy.pmdjava

import java.io
import java.nio.file.Path

import codacy.dockerApi._

import codacy.Utils
import utils.FileHelper


import scala.util.{Properties, Failure, Success, Try}




object PmdJava extends Tool{
  override def apply(path: Path, conf: Option[Seq[PatternDef]], files: Option[Set[Path]])(implicit spec: Spec): Try[Iterable[Result]] = {

    val dummyResultsGood = Seq(Result(SourcePath("filenameDummy"), ResultMessage("messageDummy"), PatternId("patternIdDummy"), ResultLine(1)))


    val confFile = getConfigFile(spec) //vai gerar o config file que tem de trocar os _ por / e tal
    /* path.toString match {
      case "pathDummy" => Success(dummyResultsGood)
    } */ //dummy test

    println(confFile)

    Success(dummyResultsGood)
   }

/*
  def getCommandFor(rootDirectory: String, files: Seq[String], configuration: PluginConfiguration): Seq[String] = {
    val configurationFile = getConfigFile(configuration)
      .map(f => Seq("-rulesets", f.getAbsolutePath))
      .getOrElse(Seq.empty)

    val filesParameter = files.mkString(",")

    Seq("pmd", "pmd", "-d", filesParameter, "-f", "xml") ++ configurationFile
  }
*/


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
