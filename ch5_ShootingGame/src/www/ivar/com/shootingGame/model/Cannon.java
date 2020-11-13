package www.ivar.com.shootingGame.model;

public class Cannon extends LocObject {
	//���� ����ϴ� �ּ� �ִ� �߻� ����
	private static final byte MIN_DEGREE = 10, MAX_DEGREE = 70;
	public static boolean isSafe(float degree) {
		return degree >= MIN_DEGREE && degree <= MAX_DEGREE;
	}
	//�簢
	private float degree;
	//�߻�ӵ�. m/sec
	private static final short VELOCITY = 300;
	
	/** ���輱�� association�� ������ �ҷ��� �Լ� ���̿� ��� �Ǿ�� �� �� */
	private Bullet bullet;
	
	public Cannon(int pos) {
		//���� Ŭ������ ������ ȣ��
		super(pos);
	}

	/**
	 * ����
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
		//���� �ӵ�
		double horizontalVelocity = Math.cos(radians) * VELOCITY;
		//���� �ӵ�
		double verticalVelocity = Math.sin(radians) * VELOCITY;
		bullet.setHorizontalVelocity(horizontalVelocity);
		bullet.setVerticalVelocity(verticalVelocity);
	}
	
}
