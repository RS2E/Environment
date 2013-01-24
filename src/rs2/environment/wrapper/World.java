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
	
	public RS2Environment getEnvironment() {
		return model.get_env();
	}
	
	public int getClientVersion() {
		return model.get_client_version();
	}
	
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
	
	public Player findPlayerByName(String username) {
		return RS2Environment.wrap(model.find_player_by_name(username));
	}
	
	public int getMaxObjectId() {
		return model.get_max_object_id();
	}
	
	public ObjectDefinition getObjectDefinition(int id) {
		return RS2Environment.wrap(model.get_object_def(id));
	}
}
