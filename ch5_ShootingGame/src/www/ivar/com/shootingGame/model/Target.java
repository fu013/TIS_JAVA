package www.ivar.com.shootingGame.model;

public class Target extends LocObject {
	//��ġ�� ����
	private static final int RANGE = 20000;
	//���� ����� �Ÿ�
	private static final int MIN_DISTANCE = 20000;
	
	public Target() {
		super((int) (Math.random() * RANGE + MIN_DISTANCE));
	}
}
