package rs2.environment.wrapper.entity;

import rs2.environment.model.entity.PlayerModel;

/**
 * @author Lazaro Brito.
 *
 */
public class Player extends Character<PlayerModel> {
	public Player(PlayerModel model) {
		super(model);
	}
	
	public void message(String message) {
		model.getBridge().sendMessage(message);
	}
}
