val appName = "mtd-itsa-vendors-roadmap"

lazy val microservice = Project(appName, file("."))
  .enablePlugins(play.sbt.PlayScala, SbtDistributablesPlugin)
  .settings(
    libraryDependencies ++= AppDependencies.compile ++ AppDependencies.test,
    update / evictionWarningOptions := EvictionWarningOptions.default.withWarnScalaVersionEviction(false),
    majorVersion := 0,
    scalaVersion := "2.13.16",
    scalacOptions ++= Seq(
      "-Xfatal-warnings",
      "-Wconf:src=routes/.*:silent",
      "-feature",
      "-language:postfixOps"
    )
  )
  .settings(
    resolvers += Resolver.jcenterRepo
  )

Global / excludeLintKeys += update / evictionWarningOptions
