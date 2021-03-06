package rs2.environment.model.entity;

import rs2.environment.model.Model;
import rs2.environment.model.WorldModel;
import rs2.environment.model.map.PositionModel;
import rs2.environment.wrapper.entity.Entity;

/**
 * Represents any in-game object.
 * This can include, but is not limited to,
 * players, npcs, items, ground items, game objects, etc.
 * 
 * This is a backend interface for implementation.
 * 
 * @author Lazaro Brito.
 *
 * @see rs2.environment.wrapper.entity.Entity
 */
public interface EntityModel<W extends Entity<?>> extends Model<W> {
	WorldModel get_world();
	
	PositionModel get_position();
}
