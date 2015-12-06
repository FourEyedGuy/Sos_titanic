package cards;

public class ActionCard extends Card {
	private Action action;
	
	public ActionCard(Action action) {
		this.action = action;
	}
	
	public Action getAction(){
		return action;
	}
	
}
