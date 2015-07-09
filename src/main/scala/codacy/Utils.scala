package codacy

import java.io.File


import scala.io.Source
import scala.sys.process._
import scala.util.Try
import scala.util.control.NonFatal

/**
 * Created by maxadoj on 09-07-2015.
 */
object Utils {

  def runCommand(cmdCommand: Seq[String]): Seq[String] = {
    cmdCommand.lineStream_!.force
  }

  def runCommandLazy(cmdCommand: Seq[String]): Stream[String] = {
    cmdCommand.lineStream_!
  }


}
