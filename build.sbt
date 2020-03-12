import com.typesafe.sbt.packager.docker.{Cmd, ExecCmd}
import sjsonnew.BasicJsonProtocol._

organization := "codacy"

name := "codacy-pmd"

scalaVersion := "2.13.1"

lazy val toolVersionKey = SettingKey[String]("the version of the underlying tool retrieved from patterns.json")

toolVersionKey := "6.22.0"

libraryDependencies ++= {
  val toolVersion = toolVersionKey.value
  Seq(
    "com.typesafe.play" %% "play-json" % "2.7.4",
    "com.codacy" %% "codacy-engine-scala-seed" % "4.0.0" withSources (),
    "org.scala-lang.modules" %% "scala-xml" % "1.2.0",
    "net.sourceforge.pmd" % "pmd-core" % toolVersion withSources (),
    "net.sourceforge.pmd" % "pmd-java" % toolVersion withSources (),
    "net.sourceforge.pmd" % "pmd-jsp" % toolVersion withSources (),
    "net.sourceforge.pmd" % "pmd-javascript" % toolVersion withSources (),
    "net.sourceforge.pmd" % "pmd-plsql" % toolVersion withSources (),
    "net.sourceforge.pmd" % "pmd-vm" % toolVersion withSources (),
    "net.sourceforge.pmd" % "pmd-xml" % toolVersion withSources (),
    "net.sourceforge.pmd" % "pmd-visualforce" % toolVersion withSources (),
    "net.sourceforge.pmd" % "pmd-apex" % toolVersion withSources ()
  )
}

enablePlugins(JavaAppPackaging)

enablePlugins(DockerPlugin)

val installAll =
  """apk update && apk add bash curl tini &&
    |rm -rf /tmp/* &&
    |rm -rf /var/cache/apk/*""".stripMargin.replaceAll(System.lineSeparator(), " ")

mappings in Universal ++= {
  (resourceDirectory in Compile) map { (resourceDir: File) =>
    val src = resourceDir / "docs"
    val dest = "/docs"

    for {
      path <- src.allPaths.get
      if !path.isDirectory
    } yield path -> path.toString.replaceFirst(src.toString, dest)
  }
}.value

Universal / javaOptions ++= Seq(
  "-XX:+UseG1GC",
  "-XX:+UseStringDeduplication",
  "-XX:MinRAMPercentage=60.0",
  "-XX:MaxRAMPercentage=90.0"
)

val dockerUser = "docker"
val dockerGroup = "docker"

daemonUser in Docker := dockerUser

daemonGroup in Docker := dockerGroup

dockerBaseImage := "openjdk:8-jre-alpine"

mainClass in Compile := Some("com.codacy.Engine")

dockerEntrypoint := Seq("/sbin/tini", "-g", "--", s"/opt/docker/bin/${name.value}")

dockerCommands := dockerCommands.value.flatMap {
  case cmd @ Cmd("WORKDIR", _) => List(Cmd("WORKDIR", "/src"), Cmd("RUN", installAll))
  case cmd @ (Cmd("ADD", _)) =>
    List(
      Cmd("RUN", s"adduser -u 2004 -D $dockerUser"),
      cmd,
      Cmd("RUN", "mv /opt/docker/docs /docs"),
      ExecCmd("RUN", Seq("chown", "-R", s"$dockerUser:$dockerGroup", "/docs"): _*),
      ExecCmd("RUN", Seq("chown", "-R", s"$dockerUser:$dockerGroup", "/opt"): _*)
    )
  case other => List(other)
}
