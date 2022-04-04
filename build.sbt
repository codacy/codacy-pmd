import com.typesafe.sbt.packager.docker.{Cmd, ExecCmd}
import sjsonnew.BasicJsonProtocol._

organization := "codacy"
name := "codacy-pmd"

scalaVersion := "2.13.8"

lazy val toolVersionKey = SettingKey[String]("version of the underlying tool")

toolVersionKey := "6.44.0"

libraryDependencies ++= {
  val toolVersion = toolVersionKey.value

  Seq(
    "com.typesafe.play" %% "play-json" % "2.7.4",
    "com.codacy" %% "codacy-engine-scala-seed" % "5.0.3",
    "org.scala-lang.modules" %% "scala-xml" % "1.2.0",
    "net.sourceforge.pmd" % "pmd-core" % toolVersion,
    "net.sourceforge.pmd" % "pmd-java" % toolVersion,
    "net.sourceforge.pmd" % "pmd-jsp" % toolVersion,
    "net.sourceforge.pmd" % "pmd-javascript" % toolVersion,
    "net.sourceforge.pmd" % "pmd-plsql" % toolVersion,
    "net.sourceforge.pmd" % "pmd-vm" % toolVersion,
    "net.sourceforge.pmd" % "pmd-xml" % toolVersion,
    "net.sourceforge.pmd" % "pmd-visualforce" % toolVersion,
    "net.sourceforge.pmd" % "pmd-apex" % toolVersion,
    // Workaround for https://github.com/pmd/pmd/issues/2081
    "org.mozilla" % "rhino" % "1.7.8" force ()
  )
}

enablePlugins(JavaAppPackaging)
enablePlugins(DockerPlugin)

val installAll =
  """apk update && apk add bash curl tini &&
    |rm -rf /tmp/* &&
    |rm -rf /var/cache/apk/*""".stripMargin.replaceAll(System.lineSeparator(), " ")

Universal / mappings ++= {
  (Compile / resourceDirectory) map { (resourceDir: File) =>
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

Docker / daemonUser := dockerUser
Docker / daemonGroup := dockerGroup
dockerBaseImage := "amazoncorretto:8-alpine3.14-jre"
Compile / mainClass := Some("com.codacy.Engine")
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

scalacOptions -= "-Xfatal-warnings"
