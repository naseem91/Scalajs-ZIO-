enablePlugins(ScalaJSPlugin)

name := "ZIOwithJs"

version := "0.1"

scalaVersion := "2.12.8"

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.6"

// https://mvnrepository.com/artifact/org.scalaz/scalaz-zio
libraryDependencies += "org.scalaz" %% "scalaz-zio" % "0.6.0"

