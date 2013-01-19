package rs2.enviroment.entity;

import rs2.enviroment.model.entity.PlayerModel;

/**
 * @author Lazaro Brito.
 *
 */
public class Player extends Character {
	private final PlayerModel model;
	
	public Player(PlayerModel model) {
		super(model);
		this.model = model;
	}
	
	@Override
	public PlayerModel getModel() {
		return model;
	}
}
