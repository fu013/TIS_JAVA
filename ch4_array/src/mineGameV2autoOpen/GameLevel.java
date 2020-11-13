package mineGameV2autoOpen;

/**
 * enum : 상수 집합을 정의하는 것
 */
public enum GameLevel {
	easy(0.1), midium(0.2), hard(0.3);
	
	public double probability;
	private GameLevel(double probability) {
		this.probability = probability;
	}
}
