package rs2.environment.wrapper;

import rs2.environment.model.Model;

/**
 * @author Lazaro Brito
 *
 */
public class AbstractWrapper<M extends Model<?>> implements Wrapper<M> {
	protected M model;
	
	public AbstractWrapper() {
		this(null);
	}
	
	public AbstractWrapper(M model) {
		this.model = model;
	}
	
	@Override
	public M getModel() {
		return model;
	}

	@Override
	public void setModel(M model) {
		this.model = model;
	}

}
