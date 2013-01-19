package rs2.environment.model;

import java.util.Collection;

import rs2.environment.model.entity.NPCModel;
import rs2.environment.model.entity.PlayerModel;

/**
 * Represents the in-game world.
 * This is a backend interface for implementation.
 * 
 * @author Lazaro Brito.
 *
 */
public interface WorldModel {
	/**
	 * @return The global collection of players.
	 */
	Collection<PlayerModel> getPlayers();
	
	/**
	 * @return The global collection of NPCs.
	 */
	Collection<NPCModel> getNPCs();
	
	/**
	 * Finds a player by it's username.
	 * @param username The name of the player.
	 * @return The player instance.
	 */
	PlayerModel findPlayerByName(String username);
}
