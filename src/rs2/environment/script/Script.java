package rs2.environment.script;

import rs2.environment.RS2Environment;

/**
 * @author Lazaro Brito
 *
 */
public interface Script {
	/**
	 * Initializes all the needed resources for the script
	 * and registers itself.
	 * 
	 * @param env The environment context.
	 */
	void initialize(RS2Environment env);
}
