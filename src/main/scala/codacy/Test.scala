package codacy

import java.nio.file._

import play.api.libs.json._


object Test {

  def run() = {

    val patternsUrl = getClass.getResource("/docs/patterns.json")

    val patternsJson = Json.parse(Files.readAllBytes(Paths.get(patternsUrl.toURI)))

    val pattId = (patternsJson \ "patterns").as[JsArray].value.map{ case t => (t \ "patternId").as[String] }.toSet

    val descUrl = getClass.getResource("/docs/description/description.json")

    val descJson = Json.parse(Files.readAllBytes(Paths.get(descUrl.toURI)))

    val descIds = descJson.as[JsArray].value.map{ case t => (t \ "patternId").as[String] }.toSet


  }
}
