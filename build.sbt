name := "FP with cats"

scalaVersion := "2.10.6" // sad story :(

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "1.6.1" % "provided",
  "org.typelevel" %% "cats-core" % "0.6.0"
)
