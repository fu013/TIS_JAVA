package p293_Emp;

public class EmpTest {

	public static void main(String[] args) {
		Emp hhh = new Emp("sddddf", 555);
		
		makeEmp();
		System.gc();
		System.out.println(Emp.getCount());
	}

	private static void makeEmp() {
		Emp hhh = new Emp("sdddzdfhdf", 5455);
		System.out.println(Emp.getCount());
	}

}
