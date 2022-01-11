import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.2.10"
  lazy val parserComb = "org.scala-lang.modules" %% "scala-parser-combinators" % "2.1.0"
  lazy val picoCLI = "info.picocli" % "picocli" % "4.6.2"
  lazy val log = "com.typesafe.scala-logging" %% "scala-logging" % "3.9.4"
  lazy val logBack = "ch.qos.logback" % "logback-classic" % "1.2.10"
  lazy val csv = "com.github.tototoshi" %% "scala-csv" % "1.3.10"
  lazy val nuProcess = "com.zaxxer" % "nuprocess" % "1.2.6"
}
