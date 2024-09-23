package com.codacy.pmd

import java.util

import com.codacy.plugins.api.Implicits._
import com.codacy.helpers.ResourceHelper
import com.codacy.plugins.api.results.{Parameter, Pattern, Result, Tool}

import play.api.libs.json.{JsString, Json}

import scala.collection.immutable.ListSet
import scala.util.{Failure, Properties, Success, Try}
import scala.xml.{Elem, Node, Utility, XML}

object DocGenerator {
  val version: String = net.sourceforge.pmd.PMDVersion.VERSION

  case class Ruleset(
      name: String,
      fullName: String,
      patterns: List[(Pattern.Description, Pattern.Specification, PatternExtendedDescription)]
  )

  case class PatternExtendedDescription(patternId: Pattern.Id, extendedDescription: String)

  private val rulesetsRoots = List(("rulesets", "rulesets.properties"), ("category", "categories.properties"))

  def main(args: Array[String]): Unit = {

    Try(listPatterns) match {
      case Success(rulesets) => writePatterns(version, rulesets)
      case Failure(e) => e.printStackTrace()
    }
  }

  def listDeprecatedPatterns: Map[String, String] = {
    val res = for {
      language <- Languages.languages
      langAlias <- Languages.aliasByLang(language)
      (rulesetsRoot, _) <- rulesetsRoots
      languageRulesetsPath = s"$rulesetsRoot/$langAlias"
    } yield {
      ResourceHelper
        .listResourceDirectory(languageRulesetsPath)
        .map(_.filter(_.endsWith(".xml")))
        .map { rulesetPaths =>
          (for {
            rulesetFilePath <- rulesetPaths
            rulesetPath = s"$languageRulesetsPath/$rulesetFilePath"
            rulesetName <- rulesetPath.split("/").lastOption.map(_.stripSuffix(".xml"))
          } yield {
            (for {
              rulesetContents <- ResourceHelper.getResourceContent(rulesetPath)
              xml <- Try(XML.loadString(rulesetContents.mkString(Properties.lineSeparator)))
            } yield {
              parseDeprecated(rulesetsRoot, rulesetName, xml)
            }).getOrElse(Map.empty)
          }).flatten
        }
        .getOrElse(Map.empty)
    }
    res.flatten.toMap
  }

  def listPatterns: Set[DocGenerator.Ruleset] = {
    val patterns = for {
      language <- Languages.languages
      langAlias <- Languages.aliasByLang(language)
      (rulesetsRoot, propertiesFile) <- rulesetsRoots
      languageRulesetsPath = s"$rulesetsRoot/$langAlias"
      propertiesFilePath = s"$languageRulesetsPath/$propertiesFile"

    } yield {
      val markedRulesets = ResourceHelper
        .getResourceStream(propertiesFilePath)
        .map { propStream =>
          val prop = new util.Properties()
          prop.load(propStream)
          prop.getProperty("rulesets.filenames").split(",").map(_.trim).filter(_.nonEmpty).toSet
        }
        .getOrElse(Set.empty[String])

      ResourceHelper
        .listResourceDirectory(languageRulesetsPath)
        .map(_.filter(_.endsWith(".xml")))
        .map { rulesetPaths =>
          val patternsPerRuleset = for {
            rulesetFilePath <- rulesetPaths
            rulesetPath = s"$languageRulesetsPath/$rulesetFilePath"
            rulesetName <- rulesetPath.split("/").lastOption.map(_.stripSuffix(".xml"))
          } yield {
            if (!markedRulesets.contains(rulesetPath)) {
              Console.println(s"${Console.YELLOW} [$language] Ruleset $rulesetName is missing from rulesets.properties")
            }

            for {
              rulesetContents <- ResourceHelper.getResourceContent(rulesetPath)
              xml <- Try(XML.loadString(rulesetContents.mkString(Properties.lineSeparator)))
              rulesetLongName = xml \@ "name"
            } yield {
              val rulesetPatterns = parsePatterns(rulesetsRoot, language, langAlias, rulesetName, xml)
              Ruleset(rulesetName, rulesetLongName, rulesetPatterns)
            }
          }

          patternsPerRuleset.flatMap(_.toOption)
        }
    }
    patterns.flatMap(_.toOption).flatten
  }

  private def writePatterns(version: String, rulesets: Set[DocGenerator.Ruleset]): Unit = {
    val (patternDescriptions, patternSpecifications, extendedDescriptions) = rulesets.flatMap(_.patterns).unzip3

    // Filter rulesets_java_diagnostics_TypeResTest because it was created for testing purposes
    val filteredPatterns =
      patternSpecifications.filterNot(_.patternId.value.contains("rulesets_java_diagnostics_TypeResTest"))
    val filteredDescriptions =
      patternDescriptions.filterNot(_.patternId.value.contains("rulesets_java_diagnostics_TypeResTest"))
    val filteredExtendedDescriptions =
      extendedDescriptions.filterNot(_.patternId.value.contains("rulesets_java_diagnostics_TypeResTest"))

    val sortedPatternSpecifications =
      ListSet(filteredPatterns.toSeq.sortBy(_.patternId.value)(Ordering[String].reverse): _*)
        .map(p => p.copy(parameters = ListSet(p.parameters.toSeq.sortBy(_.name.value): _*)))

    val sortedPatternDescriptions =
      ListSet(filteredDescriptions.toSeq.sortBy(_.patternId.value)(Ordering[String].reverse): _*)
        .map(p => p.copy(parameters = ListSet(p.parameters.toSeq.sortBy(_.name.value): _*)))

    val spec = Tool.Specification(Tool.Name("pmd7"), Some(Tool.Version(version)), sortedPatternSpecifications)

    val jsonSpecifications = Json.prettyPrint(Json.toJson(spec))
    val jsonDescriptions = Json.prettyPrint(Json.toJson(sortedPatternDescriptions))

    val specialMappings = Map("clone" -> "cloneImplementation")

    val rulesetNamesStr = rulesets
      .map {
        case r if specialMappings.contains(r.name) =>
          s"""  val ${specialMappings.getOrElse(r.name, "")} = Value("${r.name}")"""
        case r =>
          val parts = r.name.split("-")
          val prefix = parts.headOption.getOrElse("")
          val remaining = parts.tail.map(_.capitalize).mkString
          s"""  val $prefix$remaining = Value("${r.name}")"""
      }
      .mkString(Properties.lineSeparator)

    val rulesetMap = rulesets
      .map {
        case r if specialMappings.contains(r.name) =>
          s"""      "${r.fullName}" -> ${specialMappings.getOrElse(r.name, "")}"""
        case r =>
          val parts = r.name.split("-")
          val prefix = parts.headOption.getOrElse("")
          val remaining = parts.tail.map(_.capitalize).mkString
          s"""      "${r.fullName}" -> $prefix$remaining"""
      }
      .mkString(s",${Properties.lineSeparator}")

    val rulesetsCodeStrFull =
      s"""/*
        | * AUTOGENERATED: DO NOT CHANGE HERE
        | * Changes should be done on DocGenerator.scala
        | */
        |package com.codacy.pmd
        |
        |import com.codacy.docker.api.{Pattern, Result}
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
        |      android -> ((Result.Level.Warn, Pattern.Category.ErrorProne)),
        |      braces -> ((Result.Level.Info, Pattern.Category.CodeStyle)),
        |      cloneImplementation -> ((Result.Level.Warn, Pattern.Category.Compatibility)),
        |      codesize -> ((Result.Level.Warn, Pattern.Category.ErrorProne)),
        |      comments -> ((Result.Level.Info, Pattern.Category.CodeStyle)),
        |      coupling -> ((Result.Level.Warn, Pattern.Category.ErrorProne)),
        |      finalizers -> ((Result.Level.Warn, Pattern.Category.ErrorProne)),
        |      imports -> ((Result.Level.Info, Pattern.Category.UnusedCode)),
        |      j2ee -> ((Result.Level.Warn, Pattern.Category.CodeStyle)),
        |      junit -> ((Result.Level.Warn, Pattern.Category.CodeStyle)),
        |      javabeans -> ((Result.Level.Warn, Pattern.Category.ErrorProne)),
        |      loggingJakartaCommons -> ((Result.Level.Info, Pattern.Category.CodeStyle)),
        |      loggingJava -> ((Result.Level.Info, Pattern.Category.CodeStyle)),
        |      strictexception -> ((Result.Level.Warn, Pattern.Category.ErrorProne)),
        |      strings -> ((Result.Level.Warn, Pattern.Category.Performance)),
        |      unnecessary -> ((Result.Level.Warn, Pattern.Category.Performance)),
        |      empty -> ((Result.Level.Info, Pattern.Category.CodeStyle)),
        |      design -> ((Result.Level.Warn, Pattern.Category.ErrorProne)),
        |      controversial -> ((Result.Level.Warn, Pattern.Category.ErrorProne)),
        |      optimizations -> ((Result.Level.Warn, Pattern.Category.Performance)),
        |      sunsecure -> ((Result.Level.Err, Pattern.Category.ErrorProne)),
        |      migrating -> ((Result.Level.Info, Pattern.Category.Compatibility)),
        |      naming -> ((Result.Level.Info, Pattern.Category.CodeStyle)),
        |      basic -> ((Result.Level.Warn, Pattern.Category.ErrorProne)),
        |      unusedcode -> ((Result.Level.Warn, Pattern.Category.UnusedCode)),
        |      strictsyntax -> ((Result.Level.Warn, Pattern.Category.CodeStyle)),
        |      dates -> ((Result.Level.Warn, Pattern.Category.ErrorProne)),
        |      TomKytesDespair -> ((Result.Level.Warn, Pattern.Category.ErrorProne)),
        |      basicJsf -> ((Result.Level.Warn, Pattern.Category.ErrorProne)),
        |      xpath -> ((Result.Level.Warn, Pattern.Category.ErrorProne)),
        |      performance -> ((Result.Level.Warn, Pattern.Category.Performance)),
        |      security -> ((Result.Level.Err, Pattern.Category.Security)),
        |      apexunit -> ((Result.Level.Warn, Pattern.Category.CodeStyle)),
        |      complexity -> ((Result.Level.Warn, Pattern.Category.ErrorProne)),
        |      multithreading -> ((Result.Level.Warn, Pattern.Category.ErrorProne)),
        |      bestpractices -> ((Result.Level.Warn, Pattern.Category.CodeStyle)),
        |      documentation -> ((Result.Level.Info, Pattern.Category.CodeStyle)),
        |      errorprone -> ((Result.Level.Warn, Pattern.Category.ErrorProne)),
        |      codestyle -> ((Result.Level.Info, Pattern.Category.CodeStyle))
        |    )
        |  }
        |
        |}
      """.stripMargin

    val repoRoot = new java.io.File(".")
    val docsRoot = new java.io.File(repoRoot, "src/main/resources/docs")
    val patternsFile = new java.io.File(docsRoot, "patterns.json")
    val descriptionsRoot = new java.io.File(docsRoot, "description")
    val descriptionsFile = new java.io.File(descriptionsRoot, "description.json")
    val rulesetsCodeFile = new java.io.File(repoRoot, "src/main/scala/com.codacy/pmd/RuleSets.scala")

    ResourceHelper.writeFile(patternsFile.toPath, jsonSpecifications)
    ResourceHelper.writeFile(descriptionsFile.toPath, jsonDescriptions)
    filteredExtendedDescriptions.collect {
      case extendedDescription if extendedDescription.extendedDescription.trim.nonEmpty =>
        val descriptionsFile = new java.io.File(descriptionsRoot, s"${extendedDescription.patternId}.md")
        ResourceHelper.writeFile(descriptionsFile.toPath, extendedDescription.extendedDescription)
    }

    ResourceHelper.writeFile(rulesetsCodeFile.toPath, rulesetsCodeStrFull)
  }

  private def parseDeprecated(rulesetsRoot: String, rulesetName: String, xml: Elem): Map[String, String] = {
    val res = for {
      rule <- xml \\ "rule"
      deprecated = rule \@ "deprecated" if Try(deprecated.toBoolean).getOrElse(false)
      ref = rule \@ "ref" if ref.trim.nonEmpty
      mapping <- Option(ref.split('/'))
        .collect {
          case Array(category, langAlias, rulesetFileName, ruleName) =>
            (
              s"${rulesetsRoot}_${langAlias}_${rulesetName.stripSuffix(".xml")}_$ruleName",
              s"${category}_${langAlias}_${rulesetFileName.stripSuffix(".xml")}_$ruleName"
            )
        }
    } yield mapping
    res.toMap
  }

  private def parsePatterns(
      rulesetsRoot: String,
      language: String,
      langAlias: String,
      rulesetName: String,
      xml: Elem
  ): List[(Pattern.Description, Pattern.Specification, PatternExtendedDescription)] = {
    (for {
      rule <- xml \\ "rule"
      deprecated = rule \@ "deprecated" if !Try(deprecated.toBoolean).getOrElse(false)
      name = rule \@ "name" if name.trim.nonEmpty
      message = rule \@ "message"
      since = rule \@ "since"
      longDescription = (rule \ "description").text
      example = (rule \ "example").text
    } yield {
      val parameters = (name, langAlias) match {
        case ("ClassNamingConventions", "java") => parametersClassNamingConventions()
        case ("MethodNamingConventions", "java") => parametersMethodNamingConventions()
        case _ => parseParameters(rule)
      }

      val (parameterDescriptions, parameterSpecifications) = parameters.to(Set).unzip

      val rulesetNameClean = rulesetName.stripSuffix(".xml")
      val patternId = Pattern.Id(s"${rulesetsRoot}_${langAlias}_${rulesetNameClean}_$name")

      val (level, category) = RuleSets
        .getLevelAndCategory(rulesetNameClean)
        .getOrElse((Result.Level.Warn, Pattern.Category.CodeStyle))

      val timeToFix = Patterns.timeToFix.get(patternId.value).map(Pattern.TimeToFix.apply)

      val replacement =
        s"""Each regex can be configured on the PMD configuration file.
           |Check the [PMD documentation](https://pmd.github.io/pmd-${version}/pmd_rules_${langAlias}_${rulesetNameClean}.html#${name.toLowerCase}) for more information.""".stripMargin

      // Added in the context of this issue: https://codacy.atlassian.net/browse/CY-2948
      val longDescriptionWithoutUnsupportedInfo = longDescription.trim
        .replaceAll(
          "Each[\\s\\n]+regex[\\s\\n]+can[\\s\\n]+be[\\s\\n]+configured[\\s\\n]+through[\\s\\n]+properties.",
          replacement
        )

      (
        Pattern.Description(
          patternId,
          Pattern.Title(splitPatternId(name)),
          Some(Pattern.DescriptionText(cleanDescription(message))),
          timeToFix,
          parameterDescriptions
        ),
        Pattern.Specification(
          patternId,
          level,
          category,
          getSecurityCategory(name, category),
          parameterSpecifications,
          com.codacy.plugins.api.languages.Languages.fromName(language).toSet,
          enabled = DefaultPatterns.list.contains(patternId.value)
        ),
        PatternExtendedDescription(patternId, s"""Since: PMD $since
            |
            |${Utility.escape(longDescriptionWithoutUnsupportedInfo)}
            |
            |Example(s):
            |```
            |${example.trim}
            |```${Properties.lineSeparator}""".stripMargin)
      )
    }).to(List)
  }

  private def cleanDescription(description: String) =
    description
      .replaceAll(" such as ''.+", ".")
      .replaceAll(""" \(.+ lines found\)""", "")

  private def splitPatternId(patternId: String) =
    patternId
      .split("(?<=[a-z])(?=[A-Z])|(?<=[A-Z])(?=[A-Z][a-z])")
      .mkString(" ")
      .replace("J Unit", "JUnit")
      .replace("Java Script", "JavaScript")
      .replace("N Path", "NPath")
      .replace("JUnit4Test", "JUnit4 Test")
      .replace("Vf", "VF")
      .replace("El", "EL")
      .replace("Csrf", "CSRF")
      .replace("Ncss", "NCSS")
      .replace("String Value Of", "StringValueOf")
      .replace("Jsp", "JSP")
      .replace("Jsf", "JSF")
      .replace("Array List", "ArrayList")
      .replace("Html", "HTML")

  private def getSecurityCategory(patternId: String, category: Pattern.Category) = {
    if (category == Pattern.Category.Security)
      patternId match {
        case id if id.contains("Crypto") => Some(Pattern.Subcategory.Cryptography)
        case id if id.toUpperCase.contains("CSRF") => Some(Pattern.Subcategory.CSRF)
        case id if id.contains("XSS") => Some(Pattern.Subcategory.XSS)
        case "VfUnescapeEl" => Some(Pattern.Subcategory.XSS)
        case "IframeMissingSrcAttribute" => Some(Pattern.Subcategory.UnexpectedBehaviour)
        case "NoUnsanitizedJSPExpression" => Some(Pattern.Subcategory.XSS)
        case "ApexCRUDViolation" => Some(Pattern.Subcategory.Auth)
        case "ApexDangerousMethods" => Some(Pattern.Subcategory.InsecureModulesLibraries)
        case "ApexInsecureEndpoint" => Some(Pattern.Subcategory.Routes)
        case "ApexOpenRedirect" => Some(Pattern.Subcategory.Routes)
        case "ApexSharingViolations" => Some(Pattern.Subcategory.InsecureModulesLibraries)
        case "ApexSOQLInjection" => Some(Pattern.Subcategory.SQLInjection)
        case "ApexSuggestUsingNamedCred" => Some(Pattern.Subcategory.Auth)
        case "VfHtmlStyleTagXss" => Some(Pattern.Subcategory.XSS)
        case _ => None
      } else {
      None
    }
  }

  private def parseParameters(rule: Node): List[(Parameter.Description, Parameter.Specification)] = {
    (for {
      property <- rule \\ "property"
      // HACK: Codacy converts the version parameter from 2.0 to 2 leading PMD to fail, excluding it for now
      name = (property \@ "name").trim
      if name.nonEmpty && name != "version" && name != "xpath"
      description = Option(property \@ "description").filter(_.trim.nonEmpty).getOrElse(name)
      defaultValueField = Option(property \@ "value").filter(_.trim.nonEmpty).map(_.trim)
      defaultValueBody = Option(property \ "value")
        .flatMap(_.theSeq.collectFirst { case v if v.text.trim.nonEmpty => v.text.trim })
    } yield {
      val defaultValue = defaultValueField
        .orElse(defaultValueBody)
        .map(JsString)
        .getOrElse(JsString(""))

      (
        Parameter.Description(Parameter.Name(name), Parameter.DescriptionText(description)),
        Parameter.Specification(Parameter.Name(name), defaultValue)
      )
    }).to(List)
  }

  private def parametersClassNamingConventions(): List[(Parameter.Description, Parameter.Specification)] = {

    val rawData: List[(String, String, String)] = List(
      ("classPattern", "classPattern: Regex which applies to concrete class names", "[A-Z][a-zA-Z0-9]*"),
      (
        "abstractClassPattern",
        "abstractClassPattern: Regex which applies to abstract class names",
        "[A-Z][a-zA-Z0-9]*"
      ),
      ("interfacePattern", "interfacePattern: Regex which applies to interface names", "[A-Z][a-zA-Z0-9]*"),
      ("enumPattern", "enumPattern: Regex which applies to enum names", "[A-Z][a-zA-Z0-9]*"),
      ("annotationPattern", "annotationPattern: Regex which applies to annotation names", "[A-Z][a-zA-Z0-9]*"),
      ("utilityClassPattern", "utilityClassPattern: Regex which applies to utility class names", "[A-Z][a-zA-Z0-9]*"),
      (
        "testClassPattern",
        "testClassPattern: Regex which applies to test class names",
        "^Test.*$|^[A-Z][a-zA-Z0-9]*Test(s|Case)?$"
      )
    )

    val parametersList: List[(Parameter.Description, Parameter.Specification)] = rawData.map {
      case (name, description, defaultValue) =>
        (
          Parameter.Description(Parameter.Name(name), Parameter.DescriptionText(description)),
          Parameter.Specification(Parameter.Name(name), Parameter.Value(defaultValue))
        )
    }
    parametersList
  }

  private def parametersMethodNamingConventions(): List[(Parameter.Description, Parameter.Specification)] = {

    val rawData: List[(String, String, String)] = List(
      ("methodPattern", "methodPattern: Regex which applies to instance method names", "[a-z][a-zA-Z0-9]*"),
      ("staticPattern", "staticPattern: Regex which applies to static method names", "[a-z][a-zA-Z0-9]*"),
      ("nativePattern", "nativePattern: Regex which applies to native method names", "[a-z][a-zA-Z0-9]*"),
      (
        "junit3TestPattern",
        "junit3TestPattern: Regex which applies to JUnit 3 test method names",
        "test[A-Z0-9][a-zA-Z0-9]*"
      ),
      ("junit4TestPattern", "junit4TestPattern: Regex which applies to JUnit 4 test method names", "[a-z][a-zA-Z0-9]*"),
      ("junit5TestPattern", "junit5TestPattern: Regex which applies to JUnit 5 test method names", "[a-z][a-zA-Z0-9]*")
    )

    val parametersList: List[(Parameter.Description, Parameter.Specification)] = rawData.map {
      case (name, description, defaultValue) =>
        (
          Parameter.Description(Parameter.Name(name), Parameter.DescriptionText(description)),
          Parameter.Specification(Parameter.Name(name), Parameter.Value(defaultValue))
        )
    }
    parametersList
  }

}
