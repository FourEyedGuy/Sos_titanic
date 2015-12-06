package cards;

import java.util.ArrayList;
import java.util.Random;
import errors.*;

public class CardsPoolManager{
	private static final int NB_1ST_CARDS = 13;
	private static final int NB_2ND_CARDS = 17;
	
	private static CardsPoolManager instance;
	
	private ArrayList<PassengerCard> passengersCards;
	
	private CardsPoolManager() {
		passengersCards = new ArrayList<PassengerCard>();
		
		for(int i = 0; i < NB_1ST_CARDS; i++){
			passengersCards.add(new PassengerCard(i+1, false, true));
			passengersCards.add(new PassengerCard(i+1, true, true));
		}
		
		for(int j = 0; j < NB_2ND_CARDS; j++){
			passengersCards.add(new PassengerCard(j+1, false, false));
			passengersCards.add(new PassengerCard(j+1, true, false));
		}
		
		for(PassengerCard card:passengersCards)
			System.out.println(card.toString());
	}
	
	public static CardsPoolManager getCardsPoolManager(){
		if(instance == null){
			instance = new CardsPoolManager();
		}
		
		return instance;
	}
	
	/**
	 * Draw a random card from the pool and put it in the deck
	 * @param deck 
	 */
	public void dealPassengerCards(ArrayList<PassengerCard> deck, int nbCards){
		for(int i=0; i<nbCards; i++){
			Random rand = new Random();
			int randomCard = rand.nextInt(passengersCards.size());
			PassengerCard card = passengersCards.remove(randomCard);
			deck.add(card);
		}
	}
}
