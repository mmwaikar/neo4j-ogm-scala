package neo4j.ogm.scala.domain

import org.neo4j.ogm.annotation.{GraphId, EndNode, StartNode, RelationshipEntity}

/**
 * @author manoj.waikar
 */
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

@RelationshipEntity(`type` = "PAIRS_WITH")
class Pairing (@StartNode var first: Ingredient,
               @EndNode var second: Ingredient) {

  @GraphId
  protected var _id: java.lang.Long = _
}