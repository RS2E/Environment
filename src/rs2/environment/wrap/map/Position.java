package rs2.environment.wrap.map;

import rs2.environment.model.map.PositionModel;

public class Position {
	private PositionModel model;
	
	public Position(PositionModel model) {
		this.model = model;
	}
	
	public int getX() {
		return model.getX();
	}
	
	public int getY() {
		return model.getY();
	}
	
	public int getZ() {
		return model.getZ();
	}
	
	public int calcDistance(Position other) {
		return (int) Math.sqrt(Math.pow(other.getX() - getX(), 2) + Math.pow(other.getY() - getY(), 2));
	}
	
	public PositionModel getModel() {
		return model;
	}
}
