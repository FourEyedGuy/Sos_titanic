package cards;

public enum Action {
	READY("Get ready!", 2),
	CMON("Come On!", 3),
	CMBAK("Come Back!", 3),
	YRTRN("Your Turn!", 2),
	LINES("Same Lines!", 2),
	WAIT("Wait!", 2),
	TIME("Save Time", 1),
	PLNA("Plan A", 1),
	PLNB("Plan B", 1),
	BOAT("Collapsible Boat", 1),
	MYSTPY("Mystery Passenger (yellow)", 1),
	MYSTPP("Mystery Passenger (Purple)", 1);
	
	private String name;
	private int copies;
	
	Action(String name, int copies){
		this.name = name;
		this.copies = copies;
	}

	public int getCopies() {
		return copies;
	}

	public String getName() {
		return name;
	}
	
	public String guide(){
		if(this.equals(READY))
			return "Look at the first 5 cards of the Passengers pile (if there are less than 5 cards, take all the remaining cards). you choose for each card to stack  at the top"
					+ "or the bottom of the pile, in any order";
		
		else if(this.equals(CMON))
			return "Choose a passenger from the passengers pile and immediately bring it in play. Then, reshuffle the pile. If there is not any playable passenger, turn the booklet by one page. Doing so will not allow you to draw one action card.";
		
		else if(this.equals(CMBAK))
			return "Choose a passenger from the discard pile and immediately bring it in play. If there is not any playable passenger, turn the booklet by one page. Doing so will not allow you to draw one action card.";
		
		else if(this.equals(YRTRN))
			return "Choose a Line on a deck. Browse through it and choose the card that will be laid visible on top. The others will be reshuffled and laid face down under the top card.";
		
		else if(this.equals(LINES))
			return "Choose two Lines. Eventually one of them can be empty. They don't have to be next to each others. Shuffle all card face down. Then, rearrange to make them having the same number of cards for each of the line. In case of an odd number of cards, place the exceeding card on the line the closest to the back of the ship. Reveal the first card of each line. You can't look at the cards by playing this action.";
		
		else if(this.equals(WAIT))
			return "";
		
		else if(this.equals(TIME))
			return "";
		
		else if(this.equals(PLNA))
			return "";
		
		else if(this.equals(PLNB))
			return "";
		
		else if(this.equals(BOAT))
			return "";
		
		else if(this.equals(MYSTPY))
			return "";
		
		else if(this.equals(MYSTPP))
			return "";
		
		return null;
	}
}
