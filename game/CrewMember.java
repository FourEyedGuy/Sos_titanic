package game;

public enum CrewMember {
	CAPTAIN("Captain","Edward John Smith", 1, 3, 5),
	OFFICER1("1st Officer", "William Murdoch", 2, 1, 4),
	OFFICER2("2nd Officer", "Charles Lightoller", 2, 2, 5),
	OFFICER3("3rd Officer", "Herbert John Pitman", 1, 2, 5),
	OFFICER4("4th Officer", "Joseph Boxhall", 0, 1, 3),
	OFFICER5("5th Officer", "Harold Lowe", 2, 1, 5),
	WIRELESS_OP("Wireless Operator", "Jack Phillips", 1, 2, 6),
	CHIEF_STEWARD("Chief Steward", "Andrew Latimer", 0, 1, 5),
	LOOKOUT1("Lookout", "Frederick Fleet", 1, 1, 3),
	LOOKOUT2("Lookout", "Reginald Lee", 4, 1, 6);
	
	private String rank;
	private String name;
	private int nbActionCards;
	private int minPlayers;
	private int maxPassCards;
	
	CrewMember(String rank, String name, int nbActionCards, int minPlayers, int maxPassengerCards){
		this.rank = rank;
		this.name = name;
		this.nbActionCards = nbActionCards;
		this.minPlayers = minPlayers;
		this.maxPassCards = maxPassengerCards;
	}

	public String getRank() {
		return rank;
	}

	public String getName() {
		return name;
	}

	public int getNbActionCards() {
		return nbActionCards;
	}

	public int getMinPlayers() {
		return minPlayers;
	}

	public int getMaxPassCards() {
		return maxPassCards;
	}
	
	public String toString(){
		return getRank() + " " + getName() + " : \n" 
				+ "Starting number of Action Cards : " + getNbActionCards() + "\n"
				+ "Minimum numbers of players in play to be played with : " + getMinPlayers() + "\n"
				+ "You can draw 1 to " + getMaxPassCards() + " passengers cards each turn\n"
				+ "Special skill : \n" + guide();
	}
	
	public String guide(){
		if(this.equals(CAPTAIN))
			return "Can choose as an action in his turn to reorganize Action cards amongst all players(including himself."
					+ "This action must not leave the game plan unchanged.";
		
		else if(this.equals(CHIEF_STEWARD))
			return "Draw an Action card each time he places a passenger card with an anchor in a Survivors Group and forming in the process a group of three anchored cards. A same passenger cannont belong to more than one group of three.";
		
		else if(this.equals(LOOKOUT1))
			return "Draw three Action cards, keep one and discard others when he fails a Passengers Rescue (after he turned a page of the booklet).";
		
		else if(this.equals(LOOKOUT2))
			return "Cannot draw an Action card when fails a Passengers Rescue.";
		
		else if(this.equals(OFFICER1))
			return "Can lay some or all of his possible passengers cards during Passenger Rescue phase. On the other hand, if he fails"
					+ "to do so, he won't be crawing any Action cards.";
		
		else if(this.equals(OFFICER2))
			return "Can immediately play his Action card that he has just drawn after he failed the Passenger Rescue phase (but after he turned the page of the booklet)";
		
		else if(this.equals(OFFICER3))
			return "Won't draw an Action card when failed a Passenger Rescue. However, draws an Action Card when an another crew member fails a Passenger Rescue !";
			
		else if(this.equals(OFFICER4))
			return "draw and keep 2 Action cards when he fails a Passenger Rescue (after having turned a page of the booklet).";
		
		else if(this.equals(OFFICER5))
			return "Can choose as an action on his turn to discard one by one passengers in deck until encountering a passenger with an anchor. He can then switch two passengers of the same rank (number) and same class in two different Survivors Groups.";
		
		else if(this.equals(WIRELESS_OP))
			return "Can play any Action card owned by another crew member.";
		
		return null;
	}
}
