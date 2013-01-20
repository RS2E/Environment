package rs2.environment;

import rs2.environment.model.Model;
import rs2.environment.wrapper.Wrapper;

/**
 * @author Lazaro Brito.
 *
 */
public class RS2Environment {
	/**
	 * Gets the wrapper provided by the model.
	 * 
	 * Checks if the model is null to prevent null pointer exceptions.
	 * 
	 * @param model The model to wrap.
	 * @return The wrapper. 
	 */
	public static <W extends Wrapper<?>> W wrap(Model<W> model) {
		if(model != null) {
			return model.getWrapper();
		} else {
			return null;
		}
	}
}
