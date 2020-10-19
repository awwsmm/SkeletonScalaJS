name := "SkeletonScalaJS"
version := "0.1"
scalaVersion := "2.13.3"

enablePlugins(ScalaJSPlugin)

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

// DOM
libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "1.1.0"
jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()

// uTest
libraryDependencies += "com.lihaoyi" %%% "utest" % "0.7.4" % "test"
testFrameworks += new TestFramework("utest.runner.Framework")