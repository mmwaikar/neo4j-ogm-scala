package neo4j.ogm.scala.domain

import org.neo4j.ogm.annotation.NodeEntity

/**
 * @author manoj.waikar
 */
@NodeEntity
class Category extends Entity {
  var name: String = _
  
  def this(name: String) {
    this()
    this.name = name
  }
}