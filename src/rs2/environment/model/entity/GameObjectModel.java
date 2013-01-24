package rs2.environment.model.entity;

import rs2.environment.model.entity.defs.ObjectDefinitionModel;
import rs2.environment.wrapper.entity.GameObject;

/**
 * @author Lazaro Brito
 * 
 * @see rs2.environment.wrapper.entity.GameObject
 */
public interface GameObjectModel extends EntityModel<GameObject> {
	int get_id();
	
	int get_type();
	
	ObjectDefinitionModel get_def();
}
