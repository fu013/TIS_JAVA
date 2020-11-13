package www.ivar.com.shootingGame.model;

public class Bullet extends LocObject {
	//���� �ӵ�
	private double horizontalVelocity;
	//���� �ӵ�
	private double verticalVelocity;

	public Bullet() {
		super(-1);
	}

	public void setHorizontalVelocity(double horizontalVelocity) {
		this.horizontalVelocity = horizontalVelocity;
	}

	public void setVerticalVelocity(double verticalVelocity) {
		this.verticalVelocity = verticalVelocity;
	}

	/**
	 * 1�� ���� ���ư���
	 * @param duration
	 */
	public void fly(int duration, double gravity) {
		//������ ��ġ��
		posX = (int) (posX + horizontalVelocity * duration);
		//���� �ӵ� ��ȭ
		verticalVelocity -= (int) (gravity * duration);
		//������ ��ġ��
		posY += (int) (verticalVelocity * duration);
	}

	@Override
	public String toString() {
		return "Bullet [posX=" + posX + ", posY=" + posY + "]";
	}
	
}
