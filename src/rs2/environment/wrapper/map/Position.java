package rs2.environment.wrapper.map;

import rs2.environment.model.map.PositionModel;
import rs2.environment.wrapper.Wrapper;

public class Position implements Wrapper<PositionModel> {
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
	
	@Override
	public PositionModel getModel() {
		return model;
	}

	@Override
	public void setModel(PositionModel model) {
		this.model = model;
	}
	
	@Override
	public String toString() {
		return "[x=" + getX() + ", y=" + getY() + ", z=" + getZ() + "]";
	}
}
