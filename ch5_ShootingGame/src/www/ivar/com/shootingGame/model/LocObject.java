package www.ivar.com.shootingGame.model;

public abstract class LocObject {
	//위치정보. 단위 meter. 30 기준 20~40 사이로 만들 것. int : 최대값이 40000.
	protected int posX;
	protected int posY = 0;

	public LocObject(int pos) {
		this.posX = pos;
	}
	
	/** 위치 복사 */
	protected void clonePos(LocObject other) {
		other.posX = posX;
	}

	/**
	 * 상위 개념은 상위끼리만 어울리게 만들어야 함.
	 * 거리는 음수가 없지
	 * @param other
	 * @return
	 */
	public int calcDistance(LocObject other) {
		return Math.abs(posX - other.posX);
	}
	
	public boolean isUnderGroud() {
		return posY < 0;
	}

}
