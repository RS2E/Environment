package rs2.environment.wrapper.entity;

import rs2.environment.RS2Environment;
import rs2.environment.model.entity.GameObjectModel;
import rs2.environment.wrapper.entity.defs.ObjectDefinition;

public class GameObject extends Entity<GameObjectModel> {
	public GameObject(GameObjectModel model) {
		super(model);
	}
	
	/**
	 * @return The object's id.
	 */
	public int getId() {
		return model.get_id();
	}
	
	/**
	 * @return The object's type.
	 */
	public int getType() {
		return model.get_type();
	}
	
	/**
	 * @return The object's definition.
	 */
	public ObjectDefinition getDef() {
		return RS2Environment.wrap(model.get_def());
	}
}
