import LiftModule.{liftVersion, liftEdition}

name := "paypal"

organization := "net.liftmodules"

version := "1.6.0-SNAPSHOT"

liftVersion := "3.2.0"

liftEdition := liftVersion.value.substring(0,3)

moduleName := name.value + "_" + liftEdition.value

scalaVersion := "2.12.6"

crossScalaVersions := Seq("2.12.6", "2.11.11")

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

resolvers += "Java.net Maven2 Repository" at "http://download.java.net/maven/2/"

libraryDependencies ++=
  "net.liftweb"       %%  "lift-webkit"        %  liftVersion.value %  "provided" ::
  "org.specs2"        %%  "specs2-core"        %  "3.8.7"           %  "test" ::
  "commons-httpclient" %  "commons-httpclient" %  "3.1" ::
  Nil

publishTo := (version.value.endsWith("SNAPSHOT") match {
 	case true  => Some("snapshots" at "https://oss.sonatype.org/content/repositories/snapshots")
 	case false => Some("releases" at "https://oss.sonatype.org/service/local/staging/deploy/maven2")
  }
)

credentials ++= (for {
  username <- Option(System.getenv().get("SONATYPE_USERNAME"))
  password <- Option(System.getenv().get("SONATYPE_PASSWORD"))
} yield Credentials("Sonatype Nexus Repository Manager", "oss.sonatype.org", username, password)).toSeq


publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

pomExtra := (
	<url>https://github.com/liftmodules/paypal</url>
	<licenses>
		<license>
	      <name>Apache 2.0 License</name>
	      <url>http://www.apache.org/licenses/LICENSE-2.0.html</url>
	      <distribution>repo</distribution>
	    </license>
	 </licenses>
	 <scm>
	    <url>git@github.com:liftmodules/paypal.git</url>
	    <connection>scm:git:git@github.com:liftmodules/paypal.git</connection>
	 </scm>
	 <developers>
	    <developer>
	      <id>liftmodules</id>
	      <name>Lift Team</name>
	      <url>http://www.liftmodules.net</url>
	 	</developer>
	 </developers>
 )
