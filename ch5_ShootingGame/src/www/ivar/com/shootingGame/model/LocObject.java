package www.ivar.com.shootingGame.model;

public abstract class LocObject {
	//��ġ����. ���� meter. 30 ���� 20~40 ���̷� ���� ��. int : �ִ밪�� 40000.
	protected int posX;
	protected int posY = 0;

	public LocObject(int pos) {
		this.posX = pos;
	}
	
	/** ��ġ ���� */
	protected void clonePos(LocObject other) {
		other.posX = posX;
	}

	/**
	 * ���� ������ ���������� ��︮�� ������ ��.
	 * �Ÿ��� ������ ����
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
