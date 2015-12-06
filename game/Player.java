package game;

public class Player {
	private String name;
	private CrewMember rank;
	
	public Player(String name, CrewMember rank){
		this.name = name;
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CrewMember getRank() {
		return rank;
	}

	public void setRank(CrewMember rank) {
		this.rank = rank;
	}
	
	public String toString(){
		return "Hi " + getName() + "! You are playing as :\n" + rank.toString();
	}
}
