import com.typesafe.sbt.packager.docker.{Cmd, ExecCmd}

organization := "codacy"

name := "codacy-pmd"

version := "1.0.0-SNAPSHOT"

val languageVersion = "2.11.8"

scalaVersion := languageVersion

resolvers ++= Seq(
  "Typesafe Repo" at "http://repo.typesafe.com/typesafe/releases/",
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/releases"
)

val pmdVersion = "5.5.3"

val jacksonVersion = "2.5.4"

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-json" % "2.4.8",
  "com.codacy" %% "codacy-engine-scala-seed" % "2.7.3" withSources(),
  "org.scala-lang.modules" %% "scala-xml" % "1.0.6",
  "net.sourceforge.pmd" % "pmd-core" % pmdVersion withSources(),
  "net.sourceforge.pmd" % "pmd-java" % pmdVersion withSources(),
  "net.sourceforge.pmd" % "pmd-jsp" % pmdVersion withSources(),
  "net.sourceforge.pmd" % "pmd-javascript" % pmdVersion withSources(),
  "net.sourceforge.pmd" % "pmd-perl" % pmdVersion withSources(),
  "net.sourceforge.pmd" % "pmd-plsql" % pmdVersion withSources(),
  "net.sourceforge.pmd" % "pmd-vm" % pmdVersion withSources(),
  "net.sourceforge.pmd" % "pmd-xml" % pmdVersion withSources()
  //  ,"net.sourceforge.pmd" % "pmd-apex" % pmdVersion withSources()
)

// FIXES: package database contains object and package with same name: DBType
// scalacOptions := scalacOptions.value.filterNot(_ == "-Xfatal-warnings") ++ Seq("-Yresolve-term-conflict:object")

enablePlugins(JavaAppPackaging)

enablePlugins(DockerPlugin)

version in Docker := "1.0"

val installAll =
  """apk update && apk add bash curl &&
    |rm -rf /tmp/* &&
    |rm -rf /var/cache/apk/*""".stripMargin.replaceAll(System.lineSeparator(), " ")

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

dockerBaseImage := "develar/java"

mainClass in Compile := Some("codacy.Engine")

dockerCommands := dockerCommands.value.flatMap {
  case cmd@Cmd("WORKDIR", _) => List(cmd,
    Cmd("RUN", installAll)
  )
  case cmd@(Cmd("ADD", "opt /opt")) => List(cmd,
    Cmd("RUN", "mv /opt/docker/docs /docs"),
    Cmd("RUN", s"adduser -u 2004 -D $dockerUser"),
    ExecCmd("RUN", Seq("chown", "-R", s"$dockerUser:$dockerGroup", "/docs"): _*)
  )
  case other => List(other)
}
