package ifstudy;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		//���ɳʸ� �����
		Scanner scan = new Scanner(System.in);
		//������ �Է� �޴´�
		byte score = scan.nextByte();
		if (score >= 90) {
			//90�� �̻��̸� A���
			System.out.println('A');
		} else if (score >= 80) {
			//�׷��� �ʰ� 80�� �̻��̸� B
			System.out.println('B');
		} else if (score >= 70) {
			System.out.println('C');
		} else {
			System.out.println('F');
		}
	}

}
