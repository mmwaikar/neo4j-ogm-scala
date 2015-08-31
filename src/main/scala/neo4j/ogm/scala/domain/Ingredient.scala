package neo4j.ogm.scala.domain

import org.neo4j.ogm.annotation.{GraphId, Relationship, NodeEntity}

import scala.beans.BeanProperty

/**
 * @author manoj.waikar
 */
@NodeEntity
class Ingredient {
  @GraphId
  @BeanProperty
  var id: java.lang.Long = _

  @BeanProperty
  var name: String = _

  @BeanProperty
  @Relationship(`type` = "HAS_CATEGORY", direction = "OUTGOING")
  var category: Category = _

  @BeanProperty
  @Relationship(`type` = "PAIRS_WITH", direction = "UNDIRECTED")
  var pairings: Set[Pairing] = _

  def addPairing(pairing: Pairing): Unit = {
    pairing.first.pairings +(pairing)
    pairing.second.pairings +(pairing)
  }

  def this(name: String, category: Category) {
    this()
    this.name = name
    this.category = category
    this.pairings = Set()
  }
}
