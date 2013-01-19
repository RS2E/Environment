package rs2.environment.entity;

import rs2.environment.model.entity.CharacterModel;

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
