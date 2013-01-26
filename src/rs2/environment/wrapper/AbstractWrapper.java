package rs2.environment.wrapper;

import rs2.environment.RS2Environment;
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
	public RS2Environment getEnvironment() {
		return model.get_env();
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
