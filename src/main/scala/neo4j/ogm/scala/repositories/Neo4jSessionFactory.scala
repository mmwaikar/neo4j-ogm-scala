package neo4j.ogm.scala.repositories

import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;


/**
 * @author manoj.waikar
 */
object Neo4jSessionFactory {
  val sessionFactory = new SessionFactory("neo4j.ogm.scala.domain")
  
  def getNeo4jSession(): Session = {
    System.setProperty("username", "neo4j")
    System.setProperty("password", "neoman4j")
    sessionFactory.openSession("http://localhost:7474")
  }
}