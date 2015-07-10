package codacy

import java.io.File

import codacy.dockerApi._
import codacy.pmdjava.PmdJava

import play.api.libs.json._

import scala.util.Try

import utils.FileHelper

/**
 * Created by maxadoj on 08-07-2015.
 */
object MySandbox {

    def debug1 = {

      getJsonDescription("/home/maxadoj/src/patterns.json")

    }

    def debugRunCommand = {
      val cmd = Seq("ls", "/home/maxadoj")

      Utils.runCommand(cmd)
    }

    def run: Try[Iterable[Result]] = {
      println("ALO!!!!!!")

      implicit val specification: Spec = getJsonDescription("/home/maxadoj/src/patterns.json").get

      //val dummyParameters = Some(Set(ParameterDef(ParameterName("parameterNameDummy"), new JsString("valueDummy"))))
      val dummyParameters = Some(Set(ParameterDef(ParameterName("minimum"), JsNumber(17))))

      val dummyPath = FileHelper.getPathFromString("/home/maxadoj/src/")

      val dummyPatternDef = Some(Seq(PatternDef(PatternId("rulesets_java_naming.xml_LongVariable"), dummyParameters)))



      val dummyFiles = Some(Set(FileHelper.getPathFromString("/home/maxadoj/src/myFileToTest.java")))


      val resultDummy = PmdJava.apply(dummyPath, dummyPatternDef, dummyFiles)


      //printDebug

      resultDummy
    }

    def getJsonDescription(path: String): Option[Spec] = {
      val fileContent = FileHelper.readFileByName(path)

      val parsedJson = Json.parse(fileContent)
      if(parsedJson.validate[Spec].isError)
        throw new NullPointerException("[Migration]Json validation failed (ignore exception type)")

      parsedJson.asOpt[Spec]
    }


/*
  def readPluginDefinition(packagePath: String): Option[Spec] = {
    val resourceDirectory = packagePath.replace(".", File.separator)


    ResourceHelper.listResourceDirectory(resourceDirectory).collectFirst {
      case resourceFile if resourceFile.endsWith(".json") =>
        val directory = resourceDirectory.stripSuffix(File.separator)
        val filename = resourceFile.stripPrefix(File.separator)
        val filePath = directory + File.separator + filename
        ResourceHelper.getResourceContent(filePath)
    }.flatten.flatMap(ls => Json.parse(ls.mkString).asOpt[PluginDetail])
  }
*/
}
