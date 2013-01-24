package rs2.environment.wrapper.entity.defs;

import java.util.ArrayList;
import java.util.List;

import rs2.environment.RS2Environment;
import rs2.environment.model.entity.defs.ObjectDefinitionModel;
import rs2.environment.wrapper.AbstractWrapper;

/**
 * @author Lazaro Brito
 *
 */
public class ObjectDefinition extends AbstractWrapper<ObjectDefinitionModel> {
	/**
	 * Finds all the object ids with the specified action.
	 * @param env The environment context.
	 * @param action The action we're matching.
	 * @return The object ids.
	 */
	public static List<Integer> matchingAction(RS2Environment env, String action) {
		List<Integer> matching = new ArrayList<Integer>();
		for(int id=0; id<env.getWorld().getMaxObjectId(); id++) {
			ObjectDefinition def = env.getWorld().getObjectDefinition(id);
			if(def != null && def.getActions() != null) {
				for(String act : def.getActions()) {
					if(act != null && act.equalsIgnoreCase(action)) {
						matching.add(def.getId());
					}
				}
			}
		}
		return matching;
	}
	
	public ObjectDefinition(ObjectDefinitionModel model) {
		super(model);
	}
	
	/**
	 * @return The object's id.
	 */
	public int getId() {
		return model.get_id();
	}
	
	/**
	 * @return The object's name.
	 */
	public String getName() {
		return model.get_name();
	}
	
	/**
	 * @return The object's actions.
	 */
	public String[] getActions() {
		return model.get_actions();
	}
	
	/**
	 * @return The object's width.
	 */
	public int getSizeX() {
		return model.get_size_x();
	}
	
	/**
	 * @return The object's length
	 */
	public int getSizeY() {
		return model.get_size_y();
	}
}
