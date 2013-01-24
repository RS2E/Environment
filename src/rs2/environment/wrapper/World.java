package rs2.environment.wrapper;

import java.util.LinkedList;
import java.util.List;

import rs2.environment.RS2Environment;
import rs2.environment.model.WorldModel;
import rs2.environment.model.entity.NPCModel;
import rs2.environment.model.entity.PlayerModel;
import rs2.environment.wrapper.entity.NPC;
import rs2.environment.wrapper.entity.Player;
import rs2.environment.wrapper.entity.defs.ObjectDefinition;

public class World extends AbstractWrapper<WorldModel> {
	public World(WorldModel model) {
		super(model);
	}
	
	/**
	 * Gets the environment context.
	 * @return The environment.
	 */
	public RS2Environment getEnvironment() {
		return model.get_env();
	}
	
	/**
	 * Gets the world's client version.
	 * @return The client version.
	 */
	public int getClientVersion() {
		return model.get_client_version();
	}
	
	/**
	 * Gets the global player list.
	 * @return The global player list.
	 */
	public List<Player> getPlayers() {
		PlayerModel[] playerModels = model.get_players();
		
		LinkedList<Player> players = new LinkedList<Player>();
		for(PlayerModel playerModel : playerModels) {
			Player player = RS2Environment.wrap(playerModel);
			if(player != null) {
				players.add(player);
			}
		}
		
		return players;
	}
	
	/**
	 * Gets the global npc list.
	 * @return The global npc list.
	 */
	public List<NPC> getNPCs() {
		NPCModel[] npcModels = model.get_npcs();
		
		LinkedList<NPC> npcs = new LinkedList<NPC>();
		for(NPCModel npcModel : npcModels) {
			NPC npc = RS2Environment.wrap(npcModel);
			if(npc != null) {
				npcs.add(npc);
			}
		}
		
		return npcs;
	}
	
	/**
	 * Finds a player by it's username.
	 * @param username The username
	 * @return The player.
	 */
	public Player findPlayerByName(String username) {
		return RS2Environment.wrap(model.find_player_by_name(username));
	}
	
	/**
	 * @return The maximum possible object id.
	 */
	public int getMaxObjectId() {
		return model.get_max_object_id();
	}
	
	/**
	 * Gets an object definition for the specified id.
	 * @param id The object id.
	 * @return The object definition.
	 */
	public ObjectDefinition getObjectDefinition(int id) {
		return RS2Environment.wrap(model.get_object_def(id));
	}
}
