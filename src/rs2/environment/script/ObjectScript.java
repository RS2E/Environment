package rs2.environment.script;

import rs2.environment.events.player.ObjectOperation;
import rs2.environment.wrapper.entity.Player;

public interface ObjectScript extends Script {
	void handleObjectOperation(Player player, ObjectOperation operation);
}
