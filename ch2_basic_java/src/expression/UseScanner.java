package expression;

import java.util.Scanner;

public class UseScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 : ");
		int a = scan.nextInt();
		
		System.out.print("\n두번째 : ");
		int b = scan.nextInt();
		
		System.out.print("\n합은 : " + (a + b));
	}

}
