package rs2.environment.model.entity;

/**
 * Represents an in-game player or NPC.
 * This is a backend interface for implementation.
 * 
 * @author Lazaro Brito.
 *
 */
public interface CharacterModel extends EntityModel {
	String getName();
	
	int getCombatLevel();
	
	void doAnimation(int id, int delay);
	
	void doGraphic(int id, int delay, int height, int dir, int dir2);
}
