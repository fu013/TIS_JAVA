package forStudy;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		//����ڰ� �Է��� ����� �������� ���丮���� ���Ͽ� ����Ѵ�.
		final int MIN = 0;
		Scanner scan = new Scanner(System.in);
		int target;
		do {
			target = scan.nextInt();
		} while (target < MIN);

		int fact = 1;
		for (int i = 1; i <= target; i++) {
			fact *= i;
		}
		System.out.printf("%d! = %d", target, fact);
	}

}
