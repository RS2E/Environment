package rs2.environment.model;

import rs2.environment.RS2Environment;
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
	 * The environment instance.
	 * @return The environment.
	 */
	RS2Environment getEnvironment();
	
	/**
	 * The client version the world is using.
	 * @return The client revision.
	 */
	int getClientVersion();
	
	/**
	 * @return The global collection of players.
	 */
	PlayerModel[] getPlayers_();
	
	/**
	 * @return The global collection of NPCs.
	 */
	NPCModel[] getNPCs_();
	
	/**
	 * Finds a player by it's username.
	 * @param username The name of the player.
	 * @return The player instance.
	 */
	PlayerModel findPlayerByName_(String username);
}
