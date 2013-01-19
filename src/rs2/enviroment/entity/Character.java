package rs2.enviroment.entity;

import rs2.enviroment.model.entity.CharacterModel;

/**
 * @author Lazaro Brito.
 *
 */
public abstract class Character extends Entity {
	private final CharacterModel model;
	
	public Character(CharacterModel model) {
		super(model);
		this.model = model;
	}
	
	@Override
	public CharacterModel getModel() {
		return model;
	}
}
