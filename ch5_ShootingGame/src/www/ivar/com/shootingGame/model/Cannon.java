package www.ivar.com.shootingGame.model;

public class Cannon extends LocObject {
	//포에 허용하는 최소 최대 발사 각도
	private static final byte MIN_DEGREE = 10, MAX_DEGREE = 70;
	public static boolean isSafe(float degree) {
		return degree >= MIN_DEGREE && degree <= MAX_DEGREE;
	}
	//사각
	private float degree;
	//발사속도. m/sec
	private static final short VELOCITY = 300;
	
	/** 관계선이 association인 이유는 불려진 함수 사이에 기억 되어야 할 때 */
	private Bullet bullet;
	
	public Cannon(int pos) {
		//상위 클래스의 생성자 호출
		super(pos);
	}

	/**
	 * 장전
	 * @param bullet
	 */
	public void load(Bullet bullet) {
		clonePos(bullet);
		this.bullet = bullet;
	}

	public int calcDistance(Target target) {
		return super.calcDistance(target);
	}

	public void setDegree(float degree) {
		this.degree = degree;
	}

	public void shot() {
		double radians = Math.toRadians(degree);
		//수평 속도
		double horizontalVelocity = Math.cos(radians) * VELOCITY;
		//수직 속도
		double verticalVelocity = Math.sin(radians) * VELOCITY;
		bullet.setHorizontalVelocity(horizontalVelocity);
		bullet.setVerticalVelocity(verticalVelocity);
	}
	
}
