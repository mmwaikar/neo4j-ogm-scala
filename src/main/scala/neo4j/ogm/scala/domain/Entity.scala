package neo4j.ogm.scala.domain

import org.neo4j.ogm.annotation.{NodeEntity, GraphId}

/**
 * @author manoj.waikar
 */
@NodeEntity
abstract class Entity {
//  @GraphId
//  @BeanProperty
//  var id: java.lang.Long = _

  protected var _id: java.lang.Long = _

  @GraphId
  def id = _id
  def id_=(newValue: java.lang.Long) {
    _id = newValue
  }
  
  override def equals(o: Any): Boolean = o match {
    case other: Entity => other.id.equals(this.id)
    case _ => false
  }
    
  override def hashCode: Int = id.hashCode()
}
