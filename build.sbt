import com.typesafe.sbt.packager.docker.{Cmd, ExecCmd}
import sjsonnew.BasicJsonProtocol._

organization := "codacy"
name := "codacy-pmd7"
scalaVersion := "2.13.14"

lazy val toolVersionKey = SettingKey[String]("version of the underlying tool")
toolVersionKey := "7.5.0"

libraryDependencies ++= {
  val toolVersion = toolVersionKey.value

  Seq(
    "com.typesafe.play" %% "play-json" % "2.7.4",
    "com.codacy" %% "codacy-engine-scala-seed" % "5.0.1",
    "org.scala-lang.modules" %% "scala-xml" % "1.2.0",
    "net.sourceforge.pmd" % "pmd-core" % toolVersion,
    "net.sourceforge.pmd" % "pmd-java" % toolVersion,
    "net.sourceforge.pmd" % "pmd-jsp" % toolVersion,
    "net.sourceforge.pmd" % "pmd-javascript" % toolVersion,
    "net.sourceforge.pmd" % "pmd-plsql" % toolVersion,
    "net.sourceforge.pmd" % "pmd-velocity" % toolVersion,
    "net.sourceforge.pmd" % "pmd-xml" % toolVersion,
    "net.sourceforge.pmd" % "pmd-visualforce" % toolVersion, 
    "net.sourceforge.pmd" % "pmd-apex" % toolVersion,
    "net.sourceforge.pmd" % "pmd" % toolVersion,
    "net.sourceforge.pmd" % "pmd-kotlin" % toolVersion,
    "net.sourceforge.pmd" % "pmd-swift" % toolVersion
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

Universal / javaOptions ++= Seq("-XX:MaxRAMPercentage=90.0")

val dockerUser = "docker"
val dockerGroup = "docker"

Docker / daemonUser := dockerUser
Docker / daemonGroup := dockerGroup
dockerBaseImage := "amazoncorretto:23-alpine3.20"
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
