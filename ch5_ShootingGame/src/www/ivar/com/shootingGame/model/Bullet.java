package www.ivar.com.shootingGame.model;

public class Bullet extends LocObject {
	//수평 속도
	private double horizontalVelocity;
	//수직 속도
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
	 * 1초 동안 날아가기
	 * @param duration
	 */
	public void fly(int duration, double gravity) {
		//수평의 위치는
		posX = (int) (posX + horizontalVelocity * duration);
		//수직 속도 변화
		verticalVelocity -= (int) (gravity * duration);
		//수직의 위치는
		posY += (int) (verticalVelocity * duration);
	}

	@Override
	public String toString() {
		return "Bullet [posX=" + posX + ", posY=" + posY + "]";
	}
	
}
