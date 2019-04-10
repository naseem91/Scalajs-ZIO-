enablePlugins(ScalaJSPlugin)

name := "ZIOwithJs"

version := "0.1"

scalaVersion := "2.12.8"

scalaJSUseMainModuleInitializer := true

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.6"

libraryDependencies +="org.scalaz" %%% "scalaz-zio" % "1.0-RC1"


