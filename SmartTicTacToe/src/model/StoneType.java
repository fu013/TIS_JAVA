package model;

public enum StoneType {
	userStone('X'), comStone('O'), emptyStatus(' ');
	
	private char stone;
	
	private StoneType(char stone) {
		this.stone = stone;
	}

	public char getStone() {
		return stone;
	}
}
