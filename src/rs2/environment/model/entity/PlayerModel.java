package rs2.environment.model.entity;

import rs2.environment.wrapper.entity.Player;

/**
 * Represents an in-game player.
 * This is a backend interface for implementation.
 * 
 * @author Lazaro Brito.
 *
 */
public interface PlayerModel extends CharacterModel<Player> {
	String getUserName();
}
