package codacy.pmdjava

import codacy.docker.api.Implicits._
import codacy.docker.api.{Parameter, Pattern, Result, Tool}
import codacy.helpers.ResourceHelper
import play.api.libs.json.{JsString, Json}

import scala.util.{Failure, Properties, Success, Try}
import scala.xml.{Elem, Node, XML}

object DocGenerator {

  private val languages = List("java", "jsp", "javascript", "perl", "plsql", "vm", "xml", "apex")

  private val rulesetsRoot = "rulesets"

  def main(args: Array[String]): Unit = {
    Try {
      val patterns = for {
        language <- languages
        languageRulesetsPath = s"$rulesetsRoot/$language"
      } yield {
        ResourceHelper.listResourceDirectory(languageRulesetsPath).map { rulesetNames =>
          val patternsInner = rulesetNames
            .filter(_.endsWith(".xml"))
            .map { rulesetName =>
              for {
                rulesetContents <- ResourceHelper.getResourceContent(s"$languageRulesetsPath/$rulesetName")
                xml <- Try(XML.loadString(rulesetContents.mkString(Properties.lineSeparator)))
              } yield parsePatterns(language, rulesetName, xml)
            }
          patternsInner.flatMap(_.toOption).flatten
        }
      }

      patterns.flatMap(_.toOption).flatten.unzip
    } match {
      case Success((patternDescriptions, patternSpecifications)) =>
        val spec = Tool.Specification(Tool.Name("pmd"), patternSpecifications.to[Set])
        val jsonSpecifications = Json.prettyPrint(Json.toJson(spec))
        val jsonDescriptions = Json.prettyPrint(Json.toJson(patternDescriptions.distinct.to[Set]))

        val docsRoot = new java.io.File(".", "src/main/resources/docs")
        val patternsFile = new java.io.File(docsRoot, "patterns.json")
        val descriptionsFile = new java.io.File(docsRoot, "description/description.json")

        ResourceHelper.writeFile(patternsFile.toPath, jsonSpecifications)
        ResourceHelper.writeFile(descriptionsFile.toPath, jsonDescriptions)

      case Failure(e) =>
        e.printStackTrace()
    }
  }

  private def parsePatterns(language: String, rulesetName: String, xml: Elem): List[(Pattern.Description, Pattern.Specification)] = {
    (for {
      rule <- xml \\ "rule"
      name = rule \@ "name"
      message = rule \@ "message"
    } yield {
      val (parameterDescriptions, parameterSpecifications) = parseParameters(rule).to[Set].unzip
      val rulesetNameClean = rulesetName.stripSuffix(".xml")
      val patternId = Pattern.Id(s"${language}_${rulesetNameClean}_$name")

      (
        Pattern.Description(patternId, Pattern.Title(message), None, None, Some(parameterDescriptions).filter(_.nonEmpty)),
        Pattern.Specification(patternId, Result.Level.Warn, Pattern.Category.CodeStyle,
          Some(parameterSpecifications).filter(_.nonEmpty))
      )
    }).to[List]
  }

  private def parseParameters(rule: Node): List[(Parameter.Description, Parameter.Specification)] = {
    (for {
      property <- rule \\ "property"
      name = property \@ "name"
      defaultValueField = Option(property \@ "value").filter(_.trim.nonEmpty)
      defaultValueBody = Option(property \ "value")
        .flatMap(_.theSeq.collectFirst { case v if v.text.trim.nonEmpty => v.text })
    } yield {
      val defaultValue = defaultValueField.orElse(defaultValueBody)
        .map { str =>
          Try(Json.parse(str)).getOrElse(JsString(str))
        }.getOrElse(JsString(""))

      (
        Parameter.Description(Parameter.Name(name), Parameter.DescriptionText(name)),
        Parameter.Specification(Parameter.Name(name), defaultValue)
      )
    }).to[List]
  }

}
