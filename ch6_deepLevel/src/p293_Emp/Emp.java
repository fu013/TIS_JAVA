package p293_Emp;

public class Emp {
	private String name;
	private int salary;

	private static int COUNTS = 0;

	public Emp(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
		COUNTS++;
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		COUNTS--;
	}
	
	public static int getCount() {
		return COUNTS;
	}
	
	
}
