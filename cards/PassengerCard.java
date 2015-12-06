package cards;

public class PassengerCard extends Card{
	private int value;
	private boolean anchor = false;
	private boolean firstClass = false;
	
	public PassengerCard(int value) {
		this.value = value;
	}
	
	public PassengerCard(int value, boolean anchor, boolean firstClass){
		this.value = value;
		this.anchor = anchor;
		this.firstClass = firstClass;
	}

	public boolean hasAnchor() {
		return anchor;
	}

	public boolean isGreaterThan(PassengerCard card){
		return value > card.value;
	}
	
	public String toString(){
		return "is faceUp : " + super.toString() + ", " +
				"value : " + value + (anchor? "*":"") + ", class : " + (firstClass? "1st":"2nd");
	}
}
