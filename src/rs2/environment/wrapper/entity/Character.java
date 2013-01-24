package rs2.environment.wrapper.entity;

import rs2.environment.model.entity.CharacterModel;

/**
 * @author Lazaro Brito.
 *
 */
public abstract class Character<C extends CharacterModel<?>> extends Entity<C> {
	public Character(C model) {
		super(model);
	}
	
	/**
	 * @return Gets the display name.
	 */
	public String getName() {
		return model.getName_();
	}
	
	/**
	 * @return The character's combat level.
	 */
	public int getCombatLevel() {
		return model.getCombatLevel_();
	}
	
	
}
