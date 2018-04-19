name := "swagger-ui-akka-http"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++=
  Seq("com.github.swagger-akka-http" % "swagger-akka-http_2.11" % "0.14.0",
    "com.typesafe.akka" % "akka-http-testkit_2.11" % "10.0.9" % "test",
    "org.scalatest" %% "scalatest" % "3.0.4")
    