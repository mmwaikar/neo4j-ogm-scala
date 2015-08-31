package neo4j.ogm.scala.domain

import org.neo4j.ogm.annotation.{GraphId, Relationship, NodeEntity}

/**
 * @author manoj.waikar
 */
//@NodeEntity
//class Ingredient extends Entity {
//  var name: String = _
//
//  @Relationship(`type` = "HAS_CATEGORY", direction = "OUTGOING")
//  var category: Category = _
//
//  @Relationship(`type` = "PAIRS_WITH", direction = "UNDIRECTED")
//  var pairings: Set[Pairing] = Set()
//
//  def addPairing(pairing: Pairing): Unit = {
//    pairing.first.pairings +(pairing)
//    pairing.second.pairings +(pairing)
//  }
//
//  def this(name: String, category: Category) {
//    this()
//    this.name = name
//    this.category = category
//  }
//}

@NodeEntity
class Ingredient (var name: String,
                  @Relationship(`type` = "HAS_CATEGORY", direction = "OUTGOING")
                  var category: Category) {

  @GraphId
  protected var _id: java.lang.Long = _

  @Relationship(`type` = "PAIRS_WITH", direction = "UNDIRECTED")
  var pairings: Set[Pairing] = Set()

  def addPairing(pairing: Pairing): Unit = {
    pairing.first.pairings +(pairing)
    pairing.second.pairings +(pairing)
  }
}