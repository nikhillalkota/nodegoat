ThisBuild / scalaVersion     := "2.13.2"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "scala-steward-test",
    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-effect" % "2.5.1",
      "org.typelevel" %% "cats-core" % "2.2.0",
      "com.github.daddykotex" %% "courier" % "2.0.0",
      "com.amazonaws" % "aws-java-sdk-s3" % "1.11.870"
    )
  )
