package p277_array;

import java.util.Scanner;

public class ArrayProc {
	public void getValues(int[] array) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.print("������ �Է��Ͻÿ�:");
			array[i] = scan.nextInt();
		}
	}
	
	public double getAverage(int[] array) {
		double total = 0;
		for (int i = 0; i < array.length; i++)
			total += array[i];
		return total / array.length;
	}
}
