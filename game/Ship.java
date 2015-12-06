package game;

import cards.gameDifficulty;

public class Ship {
	private static final int[] NB_COMPARTMENTS = {3,3,2,2,1,0};
	private static final int NB_DECKS = 6;
	
	private Deck[] shipDecks;
	private int score = 10;
	private static Ship instance;
	
	private Ship(){
		shipDecks = new Deck[NB_DECKS];
	}
	
	public static Ship getShip(){
		if(instance == null)
			instance = new Ship();
		return instance;
	}

	public Deck[] getShipDecks() {
		return shipDecks;
	}
	
	public Deck getShipDeckAt(int index){
		return shipDecks[index];
	}

	public void setShipDecks(Deck[] shipDecks) {
		this.shipDecks = shipDecks;
	}
	
	public void setShipDeckAt(Deck shipDeck, int index){
		shipDecks[index] = shipDeck;
	}
	
	public void init(gameDifficulty mode){
		int[] settings = mode.getSettings();
		
		for(int i=0; i<NB_DECKS; i++)
			if(i <settings.length) setShipDeckAt(new Deck(settings[i], NB_COMPARTMENTS[i]), i);
			else setShipDeckAt(new Deck(NB_COMPARTMENTS[i]), i);
	}

	public int getScore() {
		return score;
	}

	public void turnPage(){
		score--;
	}
	
	public void sink(int index){
		for(int i = 0; i < index; i++){
			if(shipDecks[i] != null) shipDecks[i] = null;
		}
	}
	
	public boolean gameOver(){
		return score <= 2;
	}
	
	public String toString(){
		return null;
	}
}
