package rs2.environment.model;

import rs2.environment.wrapper.Wrapper;

/**
 * Represents an environment hook.
 * 
 * @author Lazaro Brito.
 *
 */
public interface Model<W extends Wrapper<?>> {
	W getWrapper();
}
