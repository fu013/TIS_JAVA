package swallowOrDeepCopy;

public class A {
	private String name;
	private B[] arrB = new B[10];
	
	public A(String name, B[] arrB) {
		super();
		this.name = name;
		this.arrB = arrB;
	}

	public void doaaa() {
		for (B b : arrB) {
			System.out.println(b);
		}
	}

	public void askjfdjaksdfh() {
	}
	
	
}
