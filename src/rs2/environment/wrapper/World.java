package rs2.environment.wrapper;

import java.util.LinkedList;
import java.util.List;

import rs2.environment.RS2Environment;
import rs2.environment.model.WorldModel;
import rs2.environment.model.entity.NPCModel;
import rs2.environment.model.entity.PlayerModel;
import rs2.environment.wrapper.entity.NPC;
import rs2.environment.wrapper.entity.Player;

public class World implements Wrapper<WorldModel> {
	private WorldModel model;
	
	public World(WorldModel model) {
		this.model = model;
	}
	
	@Override
	public WorldModel getModel() {
		return model;
	}
	
	public RS2Environment getEnvironment() {
		return model.getEnvironment();
	}
	
	public int getClientVersion() {
		return model.getClientVersion();
	}
	
	public List<Player> getPlayers() {
		PlayerModel[] playerModels = model.getPlayers_();
		
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
		NPCModel[] npcModels = model.getNPCs_();
		
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
		return RS2Environment.wrap(model.findPlayerByName_(username));
	}

	@Override
	public void setModel(WorldModel model) {
		this.model = model;
	}
}
