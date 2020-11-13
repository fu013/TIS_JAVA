package binarySearch;

import java.util.Scanner;

public class BinarySearcher {

	public static void main(String[] args) {
		//12��
		int[] s = {0, 1, 5, 10, 30, 44, 66, 78, 81, 82, 89, 100};
		
		System.out.println("Ž���� ���� �Է��Ͻÿ�!");
		Scanner scan = new Scanner(System.in);
		//Ž���� ��
		int searchTarget = scan.nextInt();
		//���� �˻��� ���ʰ� ������ ��ġ
		int prevLeftIndex = -1, prevRightIndex = s.length;
		while (true) {
			//�˻��� ��ġ
			int provingIndex = (prevLeftIndex + prevRightIndex) / 2;
			//���̻� �� ���� ����
			if (provingIndex == prevLeftIndex || provingIndex == prevRightIndex) {
				System.out.printf("Ž������ �����ϴ�.");
				break;
			}
			//ã�Ҵ�?
			if (searchTarget == s[provingIndex]) {
				System.out.printf("%d��� Ž������ %d��ġ�� �ֽ��ϴ�.", searchTarget, provingIndex);
				break;
			}
			//ũ��?
			if (searchTarget > s[provingIndex]) {
				prevLeftIndex = provingIndex;
				continue;
			} 
			//���� ��Ȳ�Դϴ�.
			prevRightIndex = provingIndex;
		}
	}
}
