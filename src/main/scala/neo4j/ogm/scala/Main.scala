package neo4j.ogm.scala

import neo4j.ogm.scala.domain.{Category, Ingredient, Pairing, Person}
import neo4j.ogm.scala.repositories.Neo4jSessionFactory
import org.neo4j.ogm.session.transaction.Transaction

/**
 * @author manoj.waikar
 */
object Main extends App {
  val spices = new Category("Spices")
  val turmeric = new Ingredient("Turmeric", spices)
  val cumin = new Ingredient("Cumin", spices)

  val pairing = new Pairing(turmeric, cumin)
  turmeric.addPairing(pairing)
  cumin.addPairing(pairing)

  val person = new Person("Manoj")
  
  val session = Neo4jSessionFactory.getNeo4jSession()
  val tx: Transaction = session.beginTransaction()
  
  try {
//    session.save(person)
    session.save(spices)
    session.save(turmeric)
    session.save(cumin)
    session.save(pairing)
    tx.commit()
  } catch {
    case e: Exception => // tx.rollback()
  } finally {
//    tx.commit()
  }
}