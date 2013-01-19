package rs2.environment.entity;

import rs2.environment.model.entity.PlayerModel;

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
