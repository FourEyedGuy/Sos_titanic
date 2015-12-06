package titanic;
import java.util.ArrayList;
import java.util.Scanner;

import cards.CardsPoolManager;
import cards.PassengerCard;
import errors.*;
import game.CrewMember;
import game.GameManager;

public class Titanic {
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		//initPlayer();
		initCardsPiles();
	}
	
	private static void initPlayer(){
		System.out.println("Quel est votre nom ?");
		String name = scanner.nextLine();
		System.out.println();
		
		System.out.println("Choisissez votre membre d'équipage :");
		System.out.println();
		int index = 1;
		ArrayList<CrewMember>  crewList = new ArrayList<CrewMember>(); 
		for(CrewMember crew : CrewMember.values()){
			if(crew.getMinPlayers() <= 1){
				System.out.println(index + ") "+ crew.getName() + ", " + crew.getRank());
				index++;
				crewList.add(crew);
			}
		}
		System.out.println();
		System.out.print("Your choice : " );
		int choice = scanner.nextInt();
		
		//initialisation du jeu à partir des infos demandés.
		GameManager.getGameManager().init(name, crewList.get(choice-1));
		System.out.println();
		System.out.println(GameManager.getGameManager().getPlayer().toString());
		
		
	}
	
	 private static void initCardsPiles(){
		 ArrayList<PassengerCard> deck = new ArrayList<PassengerCard>();
		 CardsPoolManager.getCardsPoolManager().dealPassengerCards(deck, 5);
		 //for(PassengerCard card:deck)
			 //System.out.println(card.toString());
	 }
}
