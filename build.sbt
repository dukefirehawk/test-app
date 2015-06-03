name := """test-app"""

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  specs2 % Test
)

resolvers ++= Seq(
    "Local Ivy" at "http://localhost:9080/artifactory/ivy-remote-repos",
    "Local Maven" at "http://localhost:9080/artifactory/libs-release"
)

resolvers += Resolver.sonatypeRepo("snapshots")

// resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

lazy val root = (project in file(".")).enablePlugins(PlayScala)