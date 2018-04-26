scalaVersion := "2.12.4"

// compiler
////////////////////////////////////////////////////////////////////////////////
scalacOptions ++= Seq(
  // "-Xsource:2.13",
  // "-Xlint",
  // "-Xfatal-warnings",
  // "-Xlog-reflective-calls",
  // "-Ywarn-unused",
  // "-Ywarn-adapted-args",
  // "-Xstrict-inference",
  // "-Ywarn-unused-import",
  // "-Yno-adapted-args",
  // "-Ydelambdafy:method",
  "-unchecked",
  "-opt-warnings:_",
  "-opt:l:inline",
  "-opt-inline-from:**"
)

// Test configuration
////////////////////////////////////////////////////////////////////////////////
// shows time for each test:
testOptions in Test += Tests.Argument("-oD")
// disables parallel exec
parallelExecution in Test := false
////////////////////////////////////////////////////////////////////////////////
