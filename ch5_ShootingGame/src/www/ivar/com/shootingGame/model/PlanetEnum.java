package www.ivar.com.shootingGame.model;

public enum PlanetEnum {
	MERCURY(3.302e+23, 2.439e6), EARTH(5.9722e+24, 6.37100e6);

	private static final double G = 6.673e-11;
	private final double mass; // 킬로그램 단위
	private final double radius;
	private final double surfaceGravity;

	// MERCURY (3.302e+23, 2.439e6) 처럼 두개의 값을 초기화 하는 생성자
	private PlanetEnum(double mass, double radius) {
		this.mass = mass;
		this.radius = radius;
		surfaceGravity = G * mass / (radius * radius);
	}

	// 접근자
	public double getMass() {
		return mass;
	}

	public double getSurfaceGravity() {
		return surfaceGravity;
	}
}
