package rs2.environment.wrapper;

import rs2.environment.model.Model;

/**
 * Represents a model wrapper.
 * 
 * @author Lazaro Brito.
 *
 */
public interface Wrapper<M extends Model<?>> {
	/**
	 * The model object being wrapped.
	 * @return The model.
	 */
	M getModel();
	
	/**
	 * Sets the underlaying model object.
	 * @param model The model.
	 */
	void setModel(M model);
}
