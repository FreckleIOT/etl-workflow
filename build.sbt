name := "etl-workflow"

organization := "com.ghostsequence.etl"

scalaVersion := "2.11.12"

crossScalaVersions := Seq("2.12.5", scalaVersion.value)

scalacOptions += "-Ypartial-unification"

libraryDependencies ++= Seq(
  "org.typelevel"  %% "cats-core"  % "1.1.0",
  "org.scalatest"  %% "scalatest"  % "3.0.5" % Test,
  "org.scalacheck" %% "scalacheck" % "1.13.4" % Test
)

// Ignore failures when downloading sources and documentation for SBT plugins (but not the main artifact)
updateConfiguration in updateSbtClassifiers := (updateConfiguration in updateSbtClassifiers).value
  .withMissingOk(true)

enablePlugins(TutPlugin)

tutNameFilter := """.*\.(md)""".r

scalafmtOnCompile := true

licenses += ("MIT", url("https://opensource.org/licenses/MIT"))

// release for all Scala versions
releaseCrossBuild := true
