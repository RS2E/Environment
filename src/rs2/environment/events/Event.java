package rs2.environment.events;

import rs2.environment.wrapper.entity.Entity;

/**
 * @author Lazaro Brito
 *
 */
public abstract class Event<E extends Entity<?>> {
	public final E context;
	
	public Event(E context) {
		this.context = context;
	}
	
	/**
	 * Executes the event.
	 */
	public abstract void handle();
}
