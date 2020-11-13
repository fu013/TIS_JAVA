package www.ivar.com.shootingGame.model;

public class Planet {
	private PlanetEnum planet;

	private Cannon cannon;
	private Target target;
	private Bullet bullet;
	
	public Planet(PlanetEnum planet) {
		this.planet = planet;
	}

	public void locate(Cannon cannon) {
		this.cannon = cannon;
	}

	public void locate(Target target) {
		this.target = target;
	}

	public void locate(Bullet bullet) {
		this.bullet = bullet;
	}

	public void timeFlow() {
		do {
			bullet.fly(1, planet.getSurfaceGravity());
			System.out.println(bullet);
		} while (!bullet.isUnderGroud());
		int acc = bullet.calcDistance(target);
		System.out.printf("목표물까지 떨어진 거리는 %dMeter입니다.", acc);
	}
}
