import com.typesafe.sbt.packager.docker.{Cmd, ExecCmd}
import scala.util.parsing.json.JSON
import scala.io.Source

organization := "codacy"

name := "codacy-pmd"

version := "1.0.0-SNAPSHOT"

val languageVersion = "2.12.7"

scalaVersion := languageVersion

resolvers ++= Seq(
  "Maven Central 2" at "http://central.maven.org/maven2/",
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/releases",
  "Typesafe Repo" at "http://repo.typesafe.com/typesafe/releases/"
)

lazy val toolVersionKey = SettingKey[String]("The version of the underlying tool retrieved from patterns.json")

toolVersionKey := {
  val jsonFile = (resourceDirectory in Compile).value / "docs" / "patterns.json"
  val toolMap = JSON.parseFull(Source.fromFile(jsonFile).getLines().mkString)
    .getOrElse(throw new Exception("patterns.json is not a valid json"))
    .asInstanceOf[Map[String, String]]
  toolMap.getOrElse[String]("version", throw new Exception("Failed to retrieve 'version' from patterns.json"))
}

libraryDependencies ++= {
  val toolVersion = toolVersionKey.value
  Seq(
    "com.typesafe.play" %% "play-json" % "2.7.3",
    "com.codacy" %% "codacy-engine-scala-seed" % "3.0.9" withSources(),
    "org.scala-lang.modules" %% "scala-xml" % "1.0.6",
    "net.sourceforge.pmd" % "pmd-core" % toolVersion withSources(),
    "net.sourceforge.pmd" % "pmd-java" % toolVersion withSources(),
    "net.sourceforge.pmd" % "pmd-jsp" % toolVersion withSources(),
    "net.sourceforge.pmd" % "pmd-javascript" % toolVersion withSources(),
    "net.sourceforge.pmd" % "pmd-plsql" % toolVersion withSources(),
    "net.sourceforge.pmd" % "pmd-vm" % toolVersion withSources(),
    "net.sourceforge.pmd" % "pmd-xml" % toolVersion withSources(),
    "net.sourceforge.pmd" % "pmd-visualforce" % toolVersion withSources(),
    "net.sourceforge.pmd" % "pmd-apex" % toolVersion withSources() exclude("apex", "*"),
    "net.sourceforge.pmd" % "pmd-apex" % toolVersion classifier "apex-jorje-shaded"
  )
}
enablePlugins(JavaAppPackaging)

enablePlugins(DockerPlugin)

version in Docker := "1.0"

mappings in Universal <++= (resourceDirectory in Compile) map { (resourceDir: File) =>
  val src = resourceDir / "docs"
  val dest = "/docs"

  for {
    path <- (src ***).get
    if !path.isDirectory
  } yield path -> path.toString.replaceFirst(src.toString, dest)
}

val dockerUser = "docker"
val dockerGroup = "docker"

daemonUser in Docker := dockerUser

daemonGroup in Docker := dockerGroup

dockerBaseImage := "eclipse-temurin:8u312-b07-jre"

mainClass in Compile := Some("com.codacy.Engine")

dockerEntrypoint := Seq("/tini", "-g", "--", s"/opt/docker/bin/${name.value}")

dockerCommands := dockerCommands.value.flatMap {
    case cmd@Cmd("WORKDIR", _) => List(
      Cmd("WORKDIR", "/src")
    )
    case cmd@(Cmd("USER", _)) => List(
      Cmd("ENV", "TINI_VERSION v0.16.1"),
      Cmd("ADD", "https://github.com/krallin/tini/releases/download/${TINI_VERSION}/tini /tini"),
      Cmd("RUN", "chmod +x /tini"),
      cmd
    )
    case cmd@(Cmd("ADD", _)) => List(
      Cmd("RUN", s"useradd -u 2004 $dockerUser"),
      cmd,
      Cmd("RUN", "mv /opt/docker/docs /docs"),
      ExecCmd("RUN", Seq("chown", "-R", s"$dockerUser:$dockerGroup", "/docs"): _*),
      ExecCmd("RUN", Seq("chown", "-R", s"$dockerUser:$dockerGroup", "/opt"): _*)
    )
    case other => List(other)
}
