package rs2.environment.model.map;

import rs2.environment.model.Model;
import rs2.environment.wrapper.map.Position;

/**
 * 
 * @author Lazaro Brito
 *
 */
public interface PositionModel extends Model<Position> {
	int getX();
	
	int getY();
	
	int getZ();
}
