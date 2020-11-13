package www.ivar.com.shootingGame.model;

public class Target extends LocObject {
	//위치할 범위
	private static final int RANGE = 20000;
	//가장 가까운 거리
	private static final int MIN_DISTANCE = 20000;
	
	public Target() {
		super((int) (Math.random() * RANGE + MIN_DISTANCE));
	}
}
