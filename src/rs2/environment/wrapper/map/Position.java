package rs2.environment.wrapper.map;

import rs2.environment.RS2Environment;
import rs2.environment.model.map.PositionModel;
import rs2.environment.wrapper.AbstractWrapper;
import rs2.environment.wrapper.entity.GameObject;

public class Position extends AbstractWrapper<PositionModel> {
	public Position(PositionModel model) {
		super(model);
	}
	
	public int getX() {
		return model.get_x();
	}
	
	public int getY() {
		return model.get_y();
	}
	
	public int getZ() {
		return model.get_z();
	}
	
	public GameObject getObject() {
		return RS2Environment.wrap(model.get_object());
	}
	
	public int calcDistance(Position other) {
		return (int) Math.sqrt(Math.pow(other.getX() - getX(), 2) + Math.pow(other.getY() - getY(), 2));
	}
	
	@Override
	public String toString() {
		return "[x=" + getX() + ", y=" + getY() + ", z=" + getZ() + "]";
	}
}
