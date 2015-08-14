package neo4j.ogm.scala.domain

import org.neo4j.ogm.annotation.GraphId;
import scala.beans.BeanProperty

/**
 * @author manoj.waikar
 */
abstract class Entity {
  @GraphId
  @BeanProperty
  var id: java.lang.Long = _
  
  override def equals(o: Any): Boolean = o match {
    case other: Entity => other.id.equals(this.id)
    case _ => false
  }
    
  override def hashCode: Int = id.hashCode()
}
