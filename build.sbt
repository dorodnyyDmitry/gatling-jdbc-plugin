import Dependencies._

enablePlugins(GatlingPlugin, GitVersioning)

lazy val root = (project in file("."))
  .settings(
    name := "gatling-jdbc-plugin",
    libraryDependencies ++= gatling,
    libraryDependencies ++= Seq(hikari, h2jdbc),
    scalacOptions ++= Seq(
      "-encoding",
      "UTF-8", // Option and arguments on same line
      "-Xfatal-warnings", // New lines for each options
      "-deprecation",
      "-feature",
      "-unchecked",
      "-language:implicitConversions",
      "-language:higherKinds",
      "-language:existentials",
      "-language:postfixOps"
    )
  )