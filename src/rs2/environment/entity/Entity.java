package rs2.environment.entity;

import rs2.environment.model.entity.EntityModel;

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
