package neo4j.ogm.scala.domain

import org.neo4j.ogm.annotation.{EndNode, StartNode, GraphId, RelationshipEntity}

import scala.beans.BeanProperty

/**
 * @author manoj.waikar
 */
@RelationshipEntity(`type` = "PAIRS_WITH")
class Pairing {
  @GraphId
  @BeanProperty
  var id: java.lang.Long = _

  @BeanProperty
  @StartNode
  var first: Ingredient = _

  @BeanProperty
  @EndNode
  var second: Ingredient = _

  def this(first: Ingredient, second: Ingredient) {
    this()
    this.first = first
    this.second = second
  }
}

//@RelationshipEntity(`type` = "PAIRS_WITH")
//class Pairing extends Entity {
//  @StartNode
//  var first: Ingredient = _
//
//  @EndNode
//  var second: Ingredient = _
//
//  def this(first: Ingredient, second: Ingredient) {
//    this()
//    this.first = first
//    this.second = second
//  }
//}

//@RelationshipEntity(`type` = "PAIRS_WITH")
//class Pairing (@StartNode @BeanProperty var first: Ingredient,
//               @EndNode @BeanProperty var second: Ingredient) {
//
//  @GraphId
//  protected var id: java.lang.Long = _
//}