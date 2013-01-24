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
	
	/**
	 * @return The player's user name. 
	 * 
	 * This is formated specifically and is not ambiguous.
	 */
	public String getUserName() {
		return model.get_user_name();
	}
	
	public void message(String message) {
		model.get_bridge().sendMessage(message);
	}
}
