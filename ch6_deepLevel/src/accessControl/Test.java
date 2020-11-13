package accessControl;

class A {
	/*
	 * ����� ��� ���� �Ұ��� �̹Ƿ� public�̾ ������ ���� ����.
	 * �׷��ٰ� �ϴ��� ������ Ŭ���������� Ȱ���Ѵٸ� private
	 */
	
	/* �ʵ�(�Ӽ�)�� ��� �⺻�� private : �������� */
	/* �ʵ�(�Ӽ�)�� ��� Child�� ���Ͽ� ���� �� ������ ��쿡 protected */
	private int a;
	int b;
	public int c;
	protected int d;
	
	/* �Լ� (�޼ҵ�)�� ��� �ܺο��� ȣ���� public
	 * �� �ȿ����� Ȱ��˴ϴ�. private
	 * Child���� ���� Ŭ������ ����� ���� �ʿ��Ҷ��� protected
	 */
	public void doA() {}
	protected void doB() {}
	void doC() {}
	private void doD() {}
	
	public int getA() {
		return a;
	}
	
	public int getC() {
		return c;
	}
	public void setD(int d) {
		this.d = d;
	}
	public void setA(int a) {
		this.a = a;
	}
	
	
}

public class Test {

	public static void main(String[] args) {
		A a = new A();
		//a.a = 10;
		a.b = 10;
		a.c = 10;
		a.d = 10;
	}

}
