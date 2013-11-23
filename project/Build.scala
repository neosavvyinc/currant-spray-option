import sbt._
import Keys._
import sbtrelease.ReleasePlugin._
import spray.revolver.RevolverPlugin.Revolver


object Build extends sbt.Build {

  val jooqOptions = Seq("jdbc.driver" -> "org.postgresql.Driver",
                        "jdbc.url" -> "jdbc:postgresql://localhost:5432/currant",
                        "jdbc.user" -> "currant_user",
                        "jdbc.password" -> "currant_user",
                        "generator.database.name" -> "org.jooq.util.postgres.PostgresDatabase",
                        "generator.database.inputSchema" -> "public",
                        "generator.database.includes" -> ".*",
                        "generator.target.packageName" -> "com.currant.jooq")


  lazy val root =
      project(id = "currant-data-services",
              base = file(".")) aggregate(core, schema)

    lazy val schema =
      project(id = "currant-data-services-schema",
              base=file("currant-data-services-schema"),
              settings = Seq(
                libraryDependencies ++=
                  Shared.Jooq :+ Shared.PostgreSQL % "compile, jooq") ++
                JOOQPlugin.jooqSettings ++
                Seq(
                  JOOQPlugin.jooqOptions := jooqOptions,
                  JOOQPlugin.jooqVersion := "3.1.0",
                  JOOQPlugin.jooqLogLevel := "debug",
                  JOOQPlugin.jooqOutputDirectory <<= javaSource in Compile
              )

      )

    lazy val core =
      project(id = "currant-data-services-core",
              base = file("currant-data-services-core"),
              settings = Seq(libraryDependencies ++=
                Shared.Spray ++
                Shared.Akka ++
                Shared.Json4s ++
                Shared.BoneCP ++
                Shared.Other) ++ Revolver.settings
             ) dependsOn schema

    def project(id: String, base: File, settings: Seq[Def.Setting[_]] = Nil) =
      Project(id = id,
              base = base,
              settings =
                Project.defaultSettings ++
                Shared.settings ++
                releaseSettings ++
                settings ++
                Seq(
                  resolvers += "spray" at "http://repo.spray.io/",
                  libraryDependencies ++= Shared.testDeps ++ Seq(Shared.PostgreSQL)
                )).settings(Defaults.itSettings:_*).configs(IntegrationTest)



}

object Shared {

  val JooqVersion = "3.1.0"
  val AkkaVersion = "2.1.4"
  val SprayVersion = "1.1-RC3"
  val Json4sVersion = "3.2.2"

  val Jooq = Seq(
    "org.jooq" % "jooq" % JooqVersion,
    "org.jooq" % "jooq-meta" % JooqVersion,
    "org.jooq" % "jooq-scala" % JooqVersion
  )

  val Spray = Seq(
    "io.spray"            %   "spray-can"     % SprayVersion,
    "io.spray"            %   "spray-routing" % SprayVersion,
    "io.spray"            %   "spray-testkit" % SprayVersion,
    "io.spray"            %%  "spray-json"    % "1.2.5"
  )

  val Akka = Seq(
    "com.typesafe.akka"   %%  "akka-actor"    % AkkaVersion,
    "com.typesafe.akka"   %%  "akka-testkit"  % AkkaVersion
  )

  val Json4s = Seq (
    "org.json4s"          %%  "json4s-native" % Json4sVersion
  )

  val PostgreSQL = "postgresql" % "postgresql" % "9.1-901.jdbc4"

  val BoneCP = Seq("com.jolbox" % "bonecp" % "0.8.0.RELEASE")


  val testDeps = Seq(
    "org.specs2"          %%  "specs2"        % "2.2.3" % "test",
    "junit"               %   "junit-dep"     % "4.10"
  )

  val Other = Seq(
    "commons-codec" % "commons-codec" % "1.8"
  )



  val settings = Seq(
    organization := "com.currant",
    scalaVersion := "2.10.3",
    scalacOptions := Seq("-deprecation", "-unchecked", "-encoding", "utf8"),
    parallelExecution in Test := false,
    shellPrompt := ShellPrompt.buildShellPrompt
  ) ++ net.virtualvoid.sbt.graph.Plugin.graphSettings

}

// Shell prompt which show the current project, git branch and build version
object ShellPrompt {
  object devnull extends ProcessLogger {
    def info (s: => String) {}
    def error (s: => String) { }
    def buffer[T] (f: => T): T = f
  }
  def currBranch = (
    ("git status -sb" lines_! devnull headOption)
      getOrElse "-" stripPrefix "## "
    )

  val buildShellPrompt = {
    (state: State) => {
      val currProject = Project.extract (state).currentProject.id
      "[%s](%s)$ ".format (
        currProject, currBranch /*, BuildSettings.buildVersion*/
      )
    }
  }
}
