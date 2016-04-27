name := "SimpleProject"

version := "1.0"

scalaVersion := "2.10.6"

val sparkVersion = "1.6.1"

libraryDependencies += "org.apache.spark" %% "spark-core" % sparkVersion % "provided"

test in assembly := {}

