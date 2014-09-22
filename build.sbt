name := """play-selma"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  "fr.xebia.extras" % "selma-processor" % "0.7" % "provided",
  "fr.xebia.extras" % "selma" % "0.7" ,
  javaJdbc,
  javaEbean,
  cache,
  javaWs
)
