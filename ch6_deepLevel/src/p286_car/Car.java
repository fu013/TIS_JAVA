package p286_car;

public class Car {
	private int id;
	protected static int INSTANCE_COUNT = 0;
	
	public Car() {
		this.id = ++INSTANCE_COUNT;
	}
	
	public static void main(String[] args) {
		new Car();
		new Car();
		int cnt = Car.INSTANCE_COUNT;
		System.out.println(cnt);
		System.out.println(Math.sqrt(2));
		
	}
	
}
