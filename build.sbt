val appName = "mtd-itsa-vendors-roadmap"

lazy val microservice = Project(appName, file("."))
  .enablePlugins(play.sbt.PlayScala, SbtDistributablesPlugin)
  .settings(
    libraryDependencies ++= AppDependencies.compile ++ AppDependencies.test,
    majorVersion := 0,
    scalaVersion := "3.5.2",
    scalacOptions ++= Seq(
      "-Werror",
      "-Wconf:msg=Flag.*repeatedly:s",
      "-Wconf:src=routes/.*:s",
      "-feature",
      "-language:postfixOps"
    )
  )
