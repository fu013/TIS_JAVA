import java.util.Scanner;

public class checkMonth {

	public static void main(String[] args) {
		// ����ڷκ��� ���� �Է¹޴´�.
		// �ùٸ� ���� �Է¹޾Ҵ� �� Ȯ��.
		// �Է°��� �ùٸ��� ������ �ٽ� �Է¹޴´�.
		// �Է°��� �ùٸ� ���̸� ����Ѵ�.
		final int MIN_MONTH = 1, MAX_MONTH = 12;
		Scanner scan = new Scanner(System.in);
		int month;
		do {
			System.out.print("�ùٸ� ���� �Է��ϼ��� [1-12] : ");
			month = scan.nextInt();
		} while (month < MIN_MONTH || month > MAX_MONTH);
		System.out.printf("�Է��� ���� %d�Դϴ�.", month);
		
		for (int i = 0; i < 5; i ++){
		
		}
	}

}
