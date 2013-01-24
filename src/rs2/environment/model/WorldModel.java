package rs2.environment.model;

import rs2.environment.RS2Environment;
import rs2.environment.model.entity.NPCModel;
import rs2.environment.model.entity.PlayerModel;
import rs2.environment.model.entity.defs.ObjectDefinitionModel;
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
	RS2Environment get_env();
	
	/**
	 * The client version the world is using.
	 * @return The client revision.
	 */
	int get_client_version();
	
	/**
	 * @return The global collection of players.
	 */
	PlayerModel[] get_players();
	
	/**
	 * @return The global collection of NPCs.
	 */
	NPCModel[] get_npcs();
	
	/**
	 * Finds a player by it's username.
	 * @param username The name of the player.
	 * @return The player instance.
	 */
	PlayerModel find_player_by_name(String username);
	
	int get_max_object_id();
	ObjectDefinitionModel get_object_def(int id);
	
}
