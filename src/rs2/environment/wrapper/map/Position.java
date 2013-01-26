package rs2.environment.wrapper.map;

import rs2.environment.RS2Environment;
import rs2.environment.model.map.PositionModel;
import rs2.environment.wrapper.AbstractWrapper;
import rs2.environment.wrapper.entity.GameObject;

public class Position extends AbstractWrapper<PositionModel> {
	public Position(PositionModel model) {
		super(model);
	}
	
	/**
	 * @return The tile's absolute X value.
	 */
	public int getX() {
		return model.get_x();
	}
	
	/**
	 * @return The tile's absolute Y value.
	 */
	public int getY() {
		return model.get_y();
	}
	
	/**
	 * @return The tile's absolute Z value.
	 */
	public int getZ() {
		return model.get_z();
	}
	
	/**
	 * @return The main object being occupied on this position.
	 */
	public GameObject getObject() {
		return RS2Environment.wrap(model.get_object());
	}
	
	/**
	 * Uses the distance formula to calculate the distance between two positions.
	 * @param other The other position.
	 * @return The distance.
	 */
	public int calcDistance(Position other) {
		return (int) Math.sqrt(Math.pow(other.getX() - getX(), 2) + Math.pow(other.getY() - getY(), 2));
	}
	
	public Position translate(int x, int y, int z) {
		return getEnvironment().getWorld().getPosition(getX() + x, getY() + y, getZ() + z);
	}
	
	@Override
	public String toString() {
		return "[x=" + getX() + ", y=" + getY() + ", z=" + getZ() + "]";
	}
}
