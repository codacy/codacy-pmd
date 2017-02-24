package codacy.pmd

import java.util

import codacy.docker.api.Implicits._
import codacy.docker.api.{Parameter, Pattern, Result, Tool}
import codacy.helpers.ResourceHelper
import play.api.libs.json.{JsString, Json}

import scala.util.{Failure, Properties, Success, Try}
import scala.xml.{Elem, Node, XML}

object DocGenerator {

  private case class Ruleset(name: String, fullName: String, patterns: List[(Pattern.Description, Pattern.Specification)])

  private val rulesetsRoot = "rulesets"

  def main(args: Array[String]): Unit = {
    Try {
      val patterns = for {
        language <- Languages.languages
        langAlias <- Languages.aliasByLang(language)
        languageRulesetsPath = s"$rulesetsRoot/$langAlias"
        propertiesFilePath = s"$languageRulesetsPath/rulesets.properties"
      } yield {
        ResourceHelper.getResourceStream(propertiesFilePath).map { propStream =>
          val prop = new util.Properties()
          prop.load(propStream)
          val rulesetPaths = prop.getProperty("rulesets.filenames").split(",").map(_.trim).filter(_.nonEmpty)
          val patternsPerRuleset = rulesetPaths.map { rulesetPath =>
            val rulesetName = rulesetPath.split("/").last.stripSuffix(".xml")
            for {
              rulesetContents <- ResourceHelper.getResourceContent(rulesetPath)
              xml <- Try(XML.loadString(rulesetContents.mkString(Properties.lineSeparator)))
              rulesetLongName = xml \@ "name"
            } yield {
              val rulesetPatterns = parsePatterns(language, langAlias, rulesetName, xml)
              Ruleset(rulesetName, rulesetLongName, rulesetPatterns)
            }
          }
          patternsPerRuleset.flatMap(_.toOption)
        }
      }
      patterns.flatMap(_.toOption).flatten
    } match {
      case Success(rulesets) =>
        val (patternDescriptions, patternSpecifications) = rulesets.flatMap(_.patterns).unzip
        val spec = Tool.Specification(Tool.Name("pmd"), patternSpecifications)
        val jsonSpecifications = Json.prettyPrint(Json.toJson(spec))
        val jsonDescriptions = Json.prettyPrint(Json.toJson(patternDescriptions))

        val specialMappings = Map("clone" -> "cloneImplementation")

        val rulesetNamesStr = rulesets.map {
          case r if specialMappings.contains(r.name) =>
            s"""  val ${specialMappings.getOrElse(r.name, "")} = Value("${r.name}")"""
          case r =>
            val parts = r.name.split("-")
            val prefix = parts.headOption.getOrElse("")
            val remaining = parts.tail.map(_.capitalize).mkString
            s"""  val $prefix$remaining = Value("${r.name}")"""
        }.mkString(Properties.lineSeparator)

        val rulesetMap = rulesets.map {
          case r if specialMappings.contains(r.name) =>
            s"""      "${r.fullName}" -> ${specialMappings.getOrElse(r.name, "")}"""
          case r =>
            val parts = r.name.split("-")
            val prefix = parts.headOption.getOrElse("")
            val remaining = parts.tail.map(_.capitalize).mkString
            s"""      "${r.fullName}" -> $prefix$remaining"""
        }.mkString(s",${Properties.lineSeparator}")

        val rulesetsCodeStrFull =
         s"""package codacy.pmd
            |
            |import codacy.docker.api.{Pattern, Result}
            |
            |object RuleSets extends Enumeration {
            |  type RuleSets = Value
            |
            |$rulesetNamesStr
            |
            |  def getRuleSet(name: String): Option[RuleSets.Value] = RuleNameToSet.get(name)
            |
            |  def getLevelAndCategory(simpleName: String): Option[(Result.Level.Value, Pattern.Category.Value)] = {
            |    RuleNameToSet.get(simpleName)
            |      .orElse {
            |        RuleSets.values.find { v =>
            |          v.toString.equalsIgnoreCase(simpleName)
            |        }
            |      }.flatMap(RuleSetToLevelAndCategory.get)
            |  }
            |
            |  private lazy val RuleNameToSet = {
            |    Map(
            |$rulesetMap
            |    )
            |  }
            |
            |  private lazy val RuleSetToLevelAndCategory = {
            |    Map(
            |      android -> (Result.Level.Warn, Pattern.Category.ErrorProne),
            |      braces -> (Result.Level.Info, Pattern.Category.CodeStyle),
            |      cloneImplementation -> (Result.Level.Warn, Pattern.Category.Compatibility),
            |      codesize -> (Result.Level.Warn, Pattern.Category.ErrorProne),
            |      comments -> (Result.Level.Info, Pattern.Category.CodeStyle),
            |      coupling -> (Result.Level.Warn, Pattern.Category.ErrorProne),
            |      finalizers -> (Result.Level.Warn, Pattern.Category.ErrorProne),
            |      imports -> (Result.Level.Info, Pattern.Category.UnusedCode),
            |      j2ee -> (Result.Level.Warn, Pattern.Category.CodeStyle),
            |      junit -> (Result.Level.Warn, Pattern.Category.CodeStyle),
            |      javabeans -> (Result.Level.Warn, Pattern.Category.ErrorProne),
            |      loggingJakartaCommons -> (Result.Level.Info, Pattern.Category.CodeStyle),
            |      loggingJava -> (Result.Level.Info, Pattern.Category.CodeStyle),
            |      strictexception -> (Result.Level.Warn, Pattern.Category.ErrorProne),
            |      strings -> (Result.Level.Warn, Pattern.Category.Performance),
            |      unnecessary -> (Result.Level.Warn, Pattern.Category.Performance),
            |      empty -> (Result.Level.Info, Pattern.Category.CodeStyle),
            |      design -> (Result.Level.Warn, Pattern.Category.ErrorProne),
            |      controversial -> (Result.Level.Warn, Pattern.Category.ErrorProne),
            |      optimizations -> (Result.Level.Warn, Pattern.Category.Performance),
            |      sunsecure -> (Result.Level.Err, Pattern.Category.ErrorProne),
            |      migrating -> (Result.Level.Info, Pattern.Category.Compatibility),
            |      naming -> (Result.Level.Info, Pattern.Category.CodeStyle),
            |      basic -> (Result.Level.Warn, Pattern.Category.ErrorProne),
            |      unusedcode -> (Result.Level.Warn, Pattern.Category.UnusedCode),
            |      strictsyntax -> (Result.Level.Warn, Pattern.Category.CodeStyle),
            |      dates -> (Result.Level.Warn, Pattern.Category.ErrorProne),
            |      TomKytesDespair -> (Result.Level.Warn, Pattern.Category.ErrorProne),
            |      basicJsf -> (Result.Level.Warn, Pattern.Category.ErrorProne),
            |      xpath -> (Result.Level.Warn, Pattern.Category.ErrorProne),
            |      performance -> (Result.Level.Warn, Pattern.Category.Performance),
            |      security -> (Result.Level.Err, Pattern.Category.Security),
            |      apexunit -> (Result.Level.Warn, Pattern.Category.CodeStyle),
            |      complexity -> (Result.Level.Warn, Pattern.Category.ErrorProne)
            |    )
            |  }
            |
            |}
          """.stripMargin

        val repoRoot = new java.io.File(".")
        val docsRoot = new java.io.File(repoRoot, "src/main/resources/docs")
        val patternsFile = new java.io.File(docsRoot, "patterns.json")
        val descriptionsFile = new java.io.File(docsRoot, "description/description.json")
        val rulesetsCodeFile = new java.io.File(repoRoot, "src/main/scala/codacy/pmd/RuleSets.scala")

        ResourceHelper.writeFile(patternsFile.toPath, jsonSpecifications)
        ResourceHelper.writeFile(descriptionsFile.toPath, jsonDescriptions)
        if (args.exists(_.equalsIgnoreCase("rulesets"))) ResourceHelper.writeFile(rulesetsCodeFile.toPath, rulesetsCodeStrFull)

      case Failure(e) =>
        e.printStackTrace()
    }
  }

  private def parsePatterns(language: String, langAlias: String, rulesetName: String, xml: Elem): List[(Pattern.Description, Pattern.Specification)] = {
    (for {
      rule <- xml \\ "rule"
      name = rule \@ "name"
      message = rule \@ "message"
    } yield {
      val (parameterDescriptions, parameterSpecifications) = parseParameters(rule).to[Set].unzip
      val rulesetNameClean = rulesetName.stripSuffix(".xml")
      val patternId = Pattern.Id(s"${langAlias}_${rulesetNameClean}_$name")

      val (level, category) = RuleSets.getLevelAndCategory(rulesetNameClean)
        .getOrElse((Result.Level.Warn, Pattern.Category.CodeStyle))

      (
        Pattern.Description(patternId, Pattern.Title(message), None, None, Some(parameterDescriptions).filter(_.nonEmpty)),
        Pattern.Specification(patternId, level, category, Some(parameterSpecifications).filter(_.nonEmpty), Some(Set(Pattern.Language(language))))
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
        }
        .getOrElse(JsString(" "))

      (
        Parameter.Description(Parameter.Name(name), Parameter.DescriptionText(name)),
        Parameter.Specification(Parameter.Name(name), defaultValue)
      )
    }).to[List]
  }

}
