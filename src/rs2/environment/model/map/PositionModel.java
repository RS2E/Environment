package rs2.environment.model.map;

import rs2.environment.model.Model;
import rs2.environment.model.entity.GameObjectModel;
import rs2.environment.wrapper.map.Position;

/**
 * 
 * @author Lazaro Brito
 * 
 * @see rs2.environment.wrapper.map.Position
 */
public interface PositionModel extends Model<Position> {
	int get_x();
	
	int get_y();
	
	int get_z();
	
	GameObjectModel get_object();
}
