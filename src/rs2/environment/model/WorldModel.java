package rs2.environment.model;

import rs2.environment.model.entity.NPCModel;
import rs2.environment.model.entity.PlayerModel;
import rs2.environment.wrapper.World;

/**
 * Represents the in-game world.
 * This is a backend interface for implementation.
 * 
 * @author Lazaro Brito.
 *
 */
public interface WorldModel extends Model<World> {
	/**
	 * @return The global collection of players.
	 */
	PlayerModel[] getPlayers();
	
	/**
	 * @return The global collection of NPCs.
	 */
	NPCModel[] getNPCs();
	
	/**
	 * Finds a player by it's username.
	 * @param username The name of the player.
	 * @return The player instance.
	 */
	PlayerModel findPlayerByName(String username);
}
