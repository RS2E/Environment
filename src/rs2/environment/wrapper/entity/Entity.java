package rs2.environment.wrapper.entity;

import java.util.LinkedList;
import java.util.Queue;

import rs2.environment.RS2Environment;
import rs2.environment.events.Event;
import rs2.environment.model.entity.EntityModel;
import rs2.environment.wrapper.Wrapper;
import rs2.environment.wrapper.map.Position;
import rs2.environment.wrapper.util.Attributes;

/**
 * @author Lazaro Brito.
 *
 */
public abstract class Entity<M extends EntityModel<?>> implements Wrapper<M> {
	protected M model;
	
	private Queue<Event<?>> eventQueue = new LinkedList<Event<?>>();
	private Attributes attributes = new Attributes();
	
	public Entity(M model) {
		this.model = model;
	}
	
	/**
	 * Queues the event to be handled later.
	 * @param event The event to be queued.
	 */
	public void queueEvent(Event<?> event) {
		eventQueue.offer(event);
	}
	
	/**
	 * Handles all the queued events.
	 */
	public void handleEvents() {
		Event<?> event;
		while((event = eventQueue.poll()) != null) {
			event.handle();
		}
	}
	
	/**
	 * Returns the entity's attributes.
	 * @return The attributes.
	 */
	public Attributes attributes() {
		return attributes;
	}
	
	@Override
	public M getModel() {
		return model;
	}
	
	@Override
	public void setModel(M model) {
		this.model = model;
	}
	
	public Position getPosition() {
		return RS2Environment.wrap(model.getPosition_());
	}
}
