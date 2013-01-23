package rs2.environment;

import rs2.environment.events.Event;
import rs2.environment.model.Model;
import rs2.environment.wrapper.World;
import rs2.environment.wrapper.Wrapper;
import rs2.environment.wrapper.entity.NPC;
import rs2.environment.wrapper.entity.Player;

/**
 * @author Lazaro Brito.
 *
 */
public class RS2Environment {
	/**
	 * Gets the wrapper provided by the model.
	 * 
	 * Checks if the model is null to prevent null pointer exceptions.
	 * 
	 * @param model The model to wrap.
	 * @return The wrapper. 
	 */
	public static <W extends Wrapper<?>> W wrap(Model<W> model) {
		if(model != null) {
			return model.getWrapper();
		} else {
			return null;
		}
	}
	
	/**
	 * Queues the event into it's context entity.
	 * @param event The event the queue.
	 */
	public static void queue(Event<?> event) {
		if(event != null) {
			event.context.queueEvent(event);
		}
	}
	
	private final World world;
	
	public RS2Environment(World world) {
		this.world = world;
	}
	
	/**
	 * Gets the world instance associated with this environment.
	 * @return The world.
	 */
	public World getWorld() {
		return world;
	}
	
	/**
	 * Processes all the events in the world's context.
	 * @param world The world context.
	 */
	public void handle() {
		for(Player player : world.getPlayers()) {
			player.handleEvents();
		}
		
		for(NPC npc : world.getNPCs()) {
			npc.handleEvents();
		}
	}
}
