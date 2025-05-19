ThisBuild / organization := "com.example"
ThisBuild / version := "0.1.0"
ThisBuild / scalaVersion := "2.12.20"

lazy val hello = (project in file("."))
  .settings(
    name := "Hello"
  )

