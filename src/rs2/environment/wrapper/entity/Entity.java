package rs2.environment.wrapper.entity;

import java.util.LinkedList;
import java.util.Queue;

import rs2.environment.RS2Environment;
import rs2.environment.events.Event;
import rs2.environment.model.entity.EntityModel;
import rs2.environment.wrapper.AbstractWrapper;
import rs2.environment.wrapper.World;
import rs2.environment.wrapper.map.Position;
import rs2.environment.wrapper.util.Attributes;

/**
 * @author Lazaro Brito.
 *
 */
public abstract class Entity<M extends EntityModel<?>> extends AbstractWrapper<M> {
	private Queue<Event<?>> eventQueue = new LinkedList<Event<?>>();
	private Attributes attributes = new Attributes();
	
	public Entity(M model) {
		super(model);
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
	
	/**
	 * @return The world context this entity is associated with.
	 */
	public World getWorld() {
		return RS2Environment.wrap(model.get_world());
	}
	
	/**
	 * @return The current position this entity is occupying.
	 */
	public Position getPosition() {
		return RS2Environment.wrap(model.get_position());
	}
}
