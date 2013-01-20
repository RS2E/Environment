package rs2.environment.model.entity;

import rs2.environment.model.map.PositionModel;

/**
 * Represents any in-game object.
 * This can include, but is not limited to,
 * players, npcs, items, ground items, game objects, etc.
 * 
 * This is a backend interface for implementation.
 * 
 * @author Lazaro Brito.
 *
 */
public interface EntityModel {
	PositionModel getPosition();
}
