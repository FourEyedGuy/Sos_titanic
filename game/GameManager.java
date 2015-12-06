package game;

import errors.*;

/**
 * Class that manager the process of the game.
 * Singleton (use getGameManager)
 * @author Edgar
 *
 */
public class GameManager {
	private static GameManager instance;
	private Player player;
	
	private GameManager(){
		player = new Player(null, null);
	}
	
	public static GameManager getGameManager(){
		if(instance == null)
			instance = new GameManager();
		
		return instance;
	}

	public Player getPlayer(){
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public void init(String name, CrewMember crew){
		setPlayer(new Player(name, crew));
	}
}
