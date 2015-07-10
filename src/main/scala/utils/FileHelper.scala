package utils

import java.io.{FileWriter, File}
import java.nio.charset.CodingErrorAction
import java.nio.file.Files

import scala.io.{Codec, Source}
import scala.util.Try
import scala.util.control.NonFatal

/**
 * Created by maxadoj on 09-07-2015.
 */
object FileHelper {

  implicit val codec = Codec("UTF-8")
  codec.onMalformedInput(CodingErrorAction.REPLACE)
  codec.onUnmappableCharacter(CodingErrorAction.REPLACE)

  def getPathFromString(path: String): java.nio.file.Path = {
    java.nio.file.Paths.get(path)
  }

  def getStringFromPath(path: java.nio.file.Path): String = {
    path.toString
  }

  def readFileByName(path: String): String = {
    readFile(new File(path)).get.mkString
  }

  def getFileNameWithoutExtension(path: String): String = {
    java.nio.file.Paths.get(path).getFileName().toString().split('.').head
  }

  def getFileName(path: String): String = {
    java.nio.file.Paths.get(path).getFileName().toString()
  }


  def readFile(file: File): Option[Seq[String]] = {
    val sourceOpt = Try(Source.fromFile(file)).toOption.orElse {
      println(s"Failed to open file: ${file.getAbsolutePath}")
      None
    }

    try {
      sourceOpt.map(_.getLines().toList)
    } catch {
      case NonFatal(e) =>
        println(s"Failed to read file: ${file.getAbsolutePath}")
        None
    } finally {
      sourceOpt.foreach(_.close())
    }
  }

  def write(content: String, extension: String = "conf"): Option[File] = {
    Try {
      val file = randomFile(extension)
      val writer = new FileWriter(file)
      writer.write(content)
      writer.flush()
      writer.close()

      file.setReadable(true, false)
      file.setWritable(true, false)

      file
    }.toOption
  }

  private def randomFile(extension: String = "conf"): File = {
    Files.createTempFile(getPathFromString("/home/maxadoj/src/tmp/"), "codacy-", s".$extension").toFile //TODO: remove first argument from createTempFile (will put on docker /tmp)
  }
}
