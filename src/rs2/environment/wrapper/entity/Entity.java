package rs2.environment.wrapper.entity;

import rs2.environment.RS2Environment;
import rs2.environment.model.entity.EntityModel;
import rs2.environment.wrapper.Wrapper;
import rs2.environment.wrapper.map.Position;

/**
 * @author Lazaro Brito.
 *
 */
public abstract class Entity<M extends EntityModel<?>> implements Wrapper<M> {
	protected final M model;
	
	public Entity(M model) {
		this.model = model;
	}
	
	@Override
	public M getModel() {
		return model;
	}
	
	public Position getPosition() {
		return RS2Environment.wrap(model.getPosition());
	}
}
