package game;

import java.util.ArrayList;
import java.util.Collections;

import cards.Card;
import cards.CardsPoolManager;
import cards.PassengerCard;
import cards.Shufflable;
import cards.gameDifficulty;

public class Deck implements Shufflable{
	private ArrayList<PassengerCard> deck;
	private int compartment;
	
	public Deck(int compartment){
		deck = new ArrayList<PassengerCard>();
		this.compartment = compartment;
	}
	
	public Deck(int nbCards, int compartment){
		deck = new ArrayList<PassengerCard>();
		CardsPoolManager.getCardsPoolManager().dealPassengerCards(deck, nbCards);
		this.compartment = compartment;
	}
	
	public boolean isSunk(){
		return compartment <= 0;
	}
	
	public void sinking(){
		if(!isSunk()) compartment--;
	}

	@Override
	public void shuffle() {
		Collections.shuffle(deck);
	}

	@Override
	public Card getTopCard() {
		return deck.get(deck.size()-1);
	}
}
