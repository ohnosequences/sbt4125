libraryDependencies ++= mainDependencies ++ testDependencies

val mainDependencies = Seq()

val testDependencies = Seq(
  "org.scalatest" %% "scalatest" % "3.0.4" % Test
)
