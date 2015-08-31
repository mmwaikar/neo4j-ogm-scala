package neo4j.ogm.scala.domain

import org.neo4j.ogm.annotation.{GraphId, NodeEntity}

/**
 * @author manoj.waikar
 */
@NodeEntity
class Category (var name: String) {
  @GraphId
  protected var _id: java.lang.Long = _
}