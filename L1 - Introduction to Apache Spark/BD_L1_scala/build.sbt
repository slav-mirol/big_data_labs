ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.13"

lazy val root = (project in file("."))
  .settings(
    name := "Scala version"
  )

val sparkVersion = "3.5.0"
libraryDependencies ++= Seq (
  "org.apache.spark" %% "spark-core" % sparkVersion
)