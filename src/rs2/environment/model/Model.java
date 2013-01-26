package rs2.environment.model;

import rs2.environment.RS2Environment;
import rs2.environment.wrapper.Wrapper;

/**
 * Represents an environment hook.
 * 
 * @author Lazaro Brito.
 *
 */
public interface Model<W extends Wrapper<?>> {
	/**
	 * The environment instance.
	 * @return The environment.
	 */
	RS2Environment get_env();
	
	W get_wrapper();
}
