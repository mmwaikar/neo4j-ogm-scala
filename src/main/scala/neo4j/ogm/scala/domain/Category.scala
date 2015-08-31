package neo4j.ogm.scala.domain

import org.neo4j.ogm.annotation.{GraphId, NodeEntity}

import scala.beans.BeanProperty

/**
 * @author manoj.waikar
 */
@NodeEntity
class Category (@BeanProperty var name: String) {
  @GraphId
  @BeanProperty
  var id: java.lang.Long = _

//  @BeanProperty
//  var name: String = _
//
//  def this(name: String) = {
//    this()
//    this.name = name
//  }
}
