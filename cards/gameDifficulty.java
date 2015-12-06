package cards;

public enum gameDifficulty {
	EASY(4,6,8,10),
	MEDIUM(7,7,7,7),
	HARD(10,8,6,4);
	
	private int[] settings;
	
	gameDifficulty(int first, int second, int third, int fourth){
		settings = new int[4];
		
		settings[0] = first;
		settings[1] = second;
		settings[3] = third;
		settings[4] = fourth;
	}
	
	public int[] getSettings(){
		return settings;
	}
}
