name := "play-s3"

version := "5.0.2-SNAPSHOT"

organization := "nl.rhinofly"

scalaVersion := "2.11.2"

crossScalaVersions := Seq("2.10.4", "2.11.2")

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-ws" % "2.3.4",
  "nl.rhinofly" %% "play-aws-utils" % "4.0.3-SNAPSHOT",
  "com.typesafe.play" %% "play-test" % "2.3.4" % "test",
  "org.specs2" %% "specs2" % "2.3.12" % "test"
)

publishTo := {
    Some("WiredThing Internal Forks Repository" at "https://wiredthing.artifactoryonline.com/wiredthing/libs-forked-local")
  }

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")  
  
resolvers ++= Seq(
  "WiredThing Internal Forks Repository" at "https://wiredthing.artifactoryonline.com/wiredthing/libs-forked-local",
  "Typesafe Release Repository" at "http://repo.typesafe.com/typesafe/releases")
  


scalacOptions ++= Seq("-feature", "-deprecation")
