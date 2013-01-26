package rs2.environment.wrapper.entity;

import rs2.environment.model.entity.ItemModel;

/**
 * @author Lazaro Brito
 *
 */
public class Item extends Entity<ItemModel> {
	public Item(ItemModel model) {
		super(model);
	}
	
	public int getId() {
		return model.get_id();
	}
	
	public int getAmount() {
		return model.get_amount();
	}
}
