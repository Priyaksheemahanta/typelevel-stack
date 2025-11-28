ThisBuild / scalaVersion := "3.7.3"

lazy val root = (project in file("."))
  .settings(
    name := "type-level-stack",

    libraryDependencies ++= Seq(
      // Test
      "org.scalameta" %% "munit" % "1.0.0" % Test,

      // Cats + Cats-Effect
      "org.typelevel" %% "cats-core"   % "2.12.0",
      "org.typelevel" %% "cats-effect" % "3.6.1",

      // HTTP4s
      "org.http4s" %% "http4s-ember-server" % "0.23.30",
      "org.http4s" %% "http4s-ember-client" % "0.23.30",
      "org.http4s" %% "http4s-dsl"          % "0.23.30",

      // Tapir
      "com.softwaremill.sttp.tapir" %% "tapir-core"          % "1.11.35",
      "com.softwaremill.sttp.tapir" %% "tapir-http4s-server" % "1.11.35",
      "com.softwaremill.sttp.tapir" %% "tapir-json-circe"    % "1.11.35",

      // Circe
      "io.circe" %% "circe-core"    % "0.14.10",
      "io.circe" %% "circe-generic" % "0.14.10",
      "io.circe" %% "circe-parser"  % "0.14.10",

      // Mongo4Cats
      "io.github.kirill5k" %% "mongo4cats-core"  % "0.7.13",
      "io.github.kirill5k" %% "mongo4cats-circe" % "0.7.13",

      // Required for ipv4"0.0.0.0"
      "com.comcast" %% "ip4s-core" % "3.5.0"
    )
  )
