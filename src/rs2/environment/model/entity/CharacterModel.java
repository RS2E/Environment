package rs2.environment.model.entity;

import rs2.environment.wrapper.entity.Character;

/**
 * Represents an in-game player or NPC.
 * This is a backend interface for implementation.
 * 
 * @author Lazaro Brito.
 *
 * @see rs2.environment.wrapper.entity.Character
 */
public interface CharacterModel<C extends Character<?>> extends EntityModel<C> {
	String getName_();
	
	int getCombatLevel_();
	
	void doAnimation_(int id, int delay);
	
	void doGraphic_(int id, int delay, int height, int dir, int dir2);
}
