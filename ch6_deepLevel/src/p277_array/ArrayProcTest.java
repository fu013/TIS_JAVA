package p277_array;

public class ArrayProcTest {
	final static int STUDENTS = 5;
	public static void main(String[] args) {
		int[] scores = new int[STUDENTS];
		ArrayProc obj = new ArrayProc();
		obj.getValues(scores);
		System.out.println("∆Ú±’¿∫ = " + obj.getAverage(scores));
	}

}
