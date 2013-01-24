package rs2.environment.model.entity.bridge;

/**
 * 
 * @author Lazaro Brito
 *
 */
public interface PlayerBridge {
	/**
	 * Sends a game message to the player.
	 * @param message The message.
	 */
	void sendMessage(String message);
}
