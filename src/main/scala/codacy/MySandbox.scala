package codacy

import java.io.File

import codacy.dockerApi._
import codacy.pmdjava.PmdJava

import play.api.libs.json._

import scala.util.Try

import utils.FileHelper


object MySandbox {

    def debug1 = {

      getJsonDescription("/home/maxadoj/src/patterns.json")

    }

    def debugRunCommand = {
      val cmd = Seq("ls", "/home/maxadoj")

      Utils.runCommand(cmd)
    }

    def run: Try[Iterable[Result]] = {
      println("Sandbox start!")

      implicit val specification: Spec = getJsonDescription("/home/maxadoj/src/patterns.json").get

      //val dummyParameters = Some(Set(ParameterDef(ParameterName("parameterNameDummy"), new JsString("valueDummy"))))
      val dummyParameters = Some(Set(ParameterDef(ParameterName("minimum"), JsNumber(17))))

      val dummyPath = FileHelper.getPathFromString("/home/maxadoj/src/")

      val dummyPatternDef = Some(Seq(PatternDef(PatternId("rulesets_java_naming.xml_LongVariable"), dummyParameters)))



      val dummyFiles = Some(Set(FileHelper.getPathFromString("/home/maxadoj/src/myFileToTest.java")))


      val resultDummy = PmdJava.apply(dummyPath, dummyPatternDef, None)

      //val resultDummy = PmdJava.apply(dummyPath, dummyPatternDef, dummyFiles)
      //val resultDummy = PmdJava.apply(dummyPath, None, None)

      resultDummy
    }

    def getJsonDescription(path: String): Option[Spec] = {
      val fileContent = FileHelper.readFileByName(path)

      val parsedJson = Json.parse(fileContent)
      if(parsedJson.validate[Spec].isError)
        throw new NullPointerException("[Migration]Json validation failed (ignore exception type)")

      parsedJson.asOpt[Spec]
    }


}
