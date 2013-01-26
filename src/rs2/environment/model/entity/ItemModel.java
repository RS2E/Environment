package rs2.environment.model.entity;

import rs2.environment.wrapper.entity.Item;

/**
 * @author Lazaro Brito
 *
 */
public interface ItemModel extends EntityModel<Item> {
	int get_id();
	
	int get_amount();
}
