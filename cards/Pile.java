package cards;

import java.util.ArrayList;

public abstract class Pile implements Shufflable{
	private ArrayList<Card> drawingPile;
	private ArrayList<Card> discardPile;
	
	public Pile() {
		drawingPile = new ArrayList<Card>();
		discardPile = new ArrayList<Card>();
	}

	
}
