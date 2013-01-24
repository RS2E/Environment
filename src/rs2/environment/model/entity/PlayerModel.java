package rs2.environment.model.entity;

import rs2.environment.model.entity.bridge.PlayerBridge;
import rs2.environment.wrapper.entity.Player;

/**
 * Represents an in-game player.
 * This is a backend interface for implementation.
 * 
 * @author Lazaro Brito.
 * 
 * @see rs2.environment.wrapper.entity.Player
 */
public interface PlayerModel extends CharacterModel<Player> {
	PlayerBridge get_bridge();
	
	String get_user_name();
}
