package ifstudy;

import java.util.Scanner;

public class SalesCommission {

	public static void main(String[] args) {
		//��ǥ ���� ��� ����. ����
		final int TARGET_SALES = 1000;
		//���� ���ʽ� ��� ����
		final float COMM_RATE = 0.1f;
		//��ĳ�� �����
		Scanner scan = new Scanner(System.in);
		//���� �Է� ���� �;�
		System.out.println("������ �Է��ϼ���!!!");
		int perfomedSales = scan.nextInt();
		//��ǥ ���� �޼� ���� �Ǵ�
		if (perfomedSales > TARGET_SALES) {
			//���� �޼� ��
			//�޼� ���� ���
			System.out.println("������ �޼��Ͽ����ϴ�!");
			//���� ���� ��ǥ ����ؼ�
			int overSales = perfomedSales - TARGET_SALES;
			//�ʰ� ������ ���Ͽ� ���ʽ��� ���ϰ� ����Ͽ� ����Ѵ�.
			System.out.printf("���ʽ��� %d�Դϴ�", (int) (overSales * COMM_RATE));
		}
	}

}
