package rs2.environment.wrapper.entity;

import rs2.environment.RS2Environment;
import rs2.environment.model.entity.GameObjectModel;
import rs2.environment.wrapper.entity.defs.ObjectDefinition;

public class GameObject extends Entity<GameObjectModel> {
	public GameObject(GameObjectModel model) {
		super(model);
	}
	
	public int getId() {
		return model.get_id();
	}
	
	public int getType() {
		return model.get_type();
	}
	
	public ObjectDefinition getDef() {
		return RS2Environment.wrap(model.get_def());
	}
}
