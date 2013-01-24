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
	
	public int getId() {
		return model.get_id();
	}
	
	public String getName() {
		return model.get_name();
	}
	
	public String[] getActions() {
		return model.get_actions();
	}
	
	public int getSizeX() {
		return model.get_size_x();
	}
	
	public int getSizeY() {
		return model.get_size_y();
	}
}
