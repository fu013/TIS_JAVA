package expression;

import java.util.Scanner;

public class UseScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ù��° : ");
		int a = scan.nextInt();
		
		System.out.print("\n�ι�° : ");
		int b = scan.nextInt();
		
		System.out.print("\n���� : " + (a + b));
	}

}
