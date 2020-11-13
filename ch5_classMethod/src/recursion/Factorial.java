package recursion;

public class Factorial {

	public static void main(String[] args) {
		int result = fact(4);
		System.out.printf("%d!=%d", 4, result);
	}

	private static int fact(int i) {
		if (i == 1)
			return 1;
		return fact(i - 1) * i;
	}

}
