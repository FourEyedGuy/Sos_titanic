package cards;

public abstract class Card {
	private boolean faceUp = false;

	public boolean isHidden() {
		return faceUp;
	}

	public void setFaceUp(boolean faceUp) {
		this.faceUp = faceUp;
	}
	
	public void turnOver(){
		faceUp = !faceUp;
	}
	
	public boolean isFaceUp(){
		return faceUp;
	}
	
	public String toString(){
		return Boolean.toString(faceUp);
	}
}
