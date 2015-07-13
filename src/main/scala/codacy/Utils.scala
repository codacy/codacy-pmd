package codacy

import java.io.File


import play.api.libs.json.{JsString, JsBoolean, JsNumber, JsValue}

import scala.collection.immutable
import scala.io.Source
import scala.sys.process._
import scala.util.{Properties, Try}
import scala.util.control.NonFatal

object Utils {

  def runCommand(cmdCommand: Seq[String]): String = {
//    cmdCommand.lineStream_!.mkString(Properties.lineSeparator)

    cmdCommand.lineStream_!.mkString(Properties.lineSeparator)
  }

  def getStringValue(jsValue: JsValue): String = {
    jsValue match {
      case JsString(value) => value
      case JsNumber(value) => value.toString
      case JsBoolean(value) => value.toString
      case _ => jsValue.toString
    }
  }


}
