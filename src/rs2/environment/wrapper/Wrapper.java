package rs2.environment.wrapper;

import rs2.environment.model.Model;

/**
 * Represents a model wrapper.
 * 
 * @author Lazaro Brito.
 *
 */
public interface Wrapper<M extends Model<?>> {
	M getModel();
	
	void setModel(M model);
}
