name := """neo4j-ogm-scala"""

version := "1.0"

scalaVersion := "2.11.7"

// resolvers += Resolver.url("Spring Milestones", http://repo.spring.io/milestone)( Patterns("[organisation]/[module]/[revision]/[artifact].[ext]") )
//resolvers += "Spring Maven MILESTONE Repository" at "http://repo.spring.io/milestone"

// Change this to another test framework if you prefer
libraryDependencies ++= Seq(
	"org.scalatest" %% "scalatest" % "2.2.4" % "test",
	"org.neo4j" % "neo4j-ogm" % "1.1.0",
	"org.neo4j" % "neo4j-cypher-dsl" % "2.0.1"
)

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"
