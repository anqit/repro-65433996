name := "repro-65433996"

version := "0.1"

scalaVersion := "2.13.4"


ThisBuild / organization := "com.anqit"
ThisBuild / version := "0.1"
ThisBuild / scalaVersion := "2.13.3"

lazy val hello = (project in file("."))
    .settings(
        name := "repro-65433996",
        libraryDependencies += "com.typesafe" % "config" % "1.4.1",
        libraryDependencies += "org.postgresql" % "postgresql" % "42.2.13",
        // slick
        libraryDependencies ++= Seq(
            "com.typesafe.slick" %% "slick" % "3.3.3",
            "org.slf4j" % "slf4j-nop" % "1.6.4",
            "com.typesafe.slick" %% "slick-hikaricp" % "3.3.3"
        )
    )