package rs2.enviroment.entity;

import rs2.enviroment.model.entity.EntityModel;

/**
 * @author Lazaro Brito.
 *
 */
public abstract class Entity {
	private final EntityModel model;
	
	public Entity(EntityModel model) {
		this.model = model;
	}
	
	public EntityModel getModel() {
		return model;
	}
}
