package rs2.environment.model.entity.defs;

import rs2.environment.model.Model;
import rs2.environment.wrapper.entity.defs.ObjectDefinition;

/**
 * @author Lazaro Brito
 *
 * @see rs2.environment.wrapper.entity.defs.ObjectDefinition
 */
public interface ObjectDefinitionModel extends Model<ObjectDefinition> {
	int get_id();
	
	String get_name();
	
	String[] get_actions();
	
	int get_size_x();
	int get_size_y();
}
