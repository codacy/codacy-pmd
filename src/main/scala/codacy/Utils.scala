package codacy

import java.io.File


import scala.collection.immutable
import scala.io.Source
import scala.sys.process._
import scala.util.{Properties, Try}
import scala.util.control.NonFatal

/**
 * Created by maxadoj on 09-07-2015.
 */
object Utils {

  def runCommand(cmdCommand: Seq[String]): String = {
//    cmdCommand.lineStream_!.mkString(Properties.lineSeparator)

    cmdCommand.lineStream_!.mkString(Properties.lineSeparator)
  }



}
