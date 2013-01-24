package rs2.environment.script;

import rs2.environment.events.player.ObjectAction;
import rs2.environment.wrapper.entity.Player;

public interface ObjectScript extends Script {
	/**
	 * 
	 * @param player
	 * @param action
	 */
	void handleObjectAction(Player player, ObjectAction action);
}
