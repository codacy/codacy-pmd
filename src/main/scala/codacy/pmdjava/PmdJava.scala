package codacy.pmdjava

import java.nio.file.Path

import codacy.dockerApi.{Result, Spec, PatternDef, Tool}

import scala.util.Try

object PmdJava extends Tool{
  override def apply(path: Path, conf: Seq[PatternDef], files: Option[Set[Path]])(implicit spec: Spec): Try[Iterable[Result]] = {


    ???
  }
}
