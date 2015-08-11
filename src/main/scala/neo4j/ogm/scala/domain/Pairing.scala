package neo4j.ogm.scala.domain

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

/**
 * @author manoj.waikar
 */
@RelationshipEntity(`type` = "PAIRS_WITH")
class Pairing extends Entity {
  @StartNode
  var first: Ingredient = _
  
  @EndNode
  var second: Ingredient = _
  
  def this(first: Ingredient, second: Ingredient) {
    this()
    this.first = first
    this.second = second
  }
}