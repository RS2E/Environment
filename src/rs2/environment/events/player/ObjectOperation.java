package rs2.environment.events.player;

import java.util.HashMap;
import java.util.Map;

import rs2.environment.events.Event;
import rs2.environment.wrapper.entity.Player;
import rs2.environment.wrapper.map.Position;

/**
 * 
 * @author Lazaro Brito
 *
 */
public class ObjectOperation extends Event<Player> {
	public static enum RightClickOption {		
		CLICK(1), CLICK2(2), CLICK3(3), CLICK4(4), CLICK5(5), EXAMINE(6), CLICK7(7);
		
		private static Map<Integer, RightClickOption> options = new HashMap<Integer, RightClickOption>();
		static {
			for(RightClickOption option : RightClickOption.values()) {
				options.put(option.id, option);
			}
		}
		
		public static RightClickOption forId(int id) {
			return options.get(id);
		}
		
		private final int id;
		
		private RightClickOption(int id) {
			this.id = id;
		}
		
		public int getId() {
			return id;
		}
	}
	
	public final int id;
	public final RightClickOption option;
	public final Position position;
	
	public ObjectOperation(Player context, int id, RightClickOption option, Position position) {
		super(context);
		this.id = id;
		this.option = option;
		this.position = position;
	}

	@Override
	public void handle() {
		context.message("On object click: " + id + ", " + option + ", " + position);
	}
}
