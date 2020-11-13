package accessControl;

class A {
	/*
	 * 상수의 경우 변경 불가능 이므로 public이어도 위험할 일은 없다.
	 * 그렇다고 하더라도 정의한 클래스에서만 활용한다면 private
	 */
	
	/* 필드(속성)일 경우 기본은 private : 정보은닉 */
	/* 필드(속성)일 경우 Child를 위하여 열어 줄 제한적 경우에 protected */
	private int a;
	int b;
	public int c;
	protected int d;
	
	/* 함수 (메소드)의 경우 외부에서 호출은 public
	 * 내 안에서만 활용됩니다. private
	 * Child에서 상위 클래스의 기능이 또한 필요할때는 protected
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
