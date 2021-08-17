import uk.gov.hmrc.sbtdistributables.SbtDistributablesPlugin.publishingSettings

val appName = "mtd-itsa-vendors-roadmap"

lazy val microservice = Project(appName, file("."))
  .enablePlugins(play.sbt.PlayScala, SbtAutoBuildPlugin, SbtDistributablesPlugin)
  .settings(
    libraryDependencies ++= AppDependencies.compile ++ AppDependencies.test,
    update / evictionWarningOptions := EvictionWarningOptions.default.withWarnScalaVersionEviction(false),
    majorVersion := 0,
    scalaVersion := "2.12.12"
  )
  .settings(
    publishingSettings: _*
  )
  .settings(
    resolvers += Resolver.jcenterRepo
  )
