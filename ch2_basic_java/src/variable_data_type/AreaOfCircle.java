package variable_data_type;

public class AreaOfCircle {

	public static void main(String[] args) {
		// ����ϰ��� �ϴ� ���� �������� �����մϴ�.
		double radius = 5.0d;
		
		//���� ������ ���� * �������� ����
		double area;
		calcAndDisplay(radius);

		if (args.length == 1) {
			radius = Double.parseDouble(args[0]);
			calcAndDisplay(radius);
		}
	}

	private static void calcAndDisplay(double radius) {
		double area = Math.PI * radius * radius;
		System.out.printf("\"������\"�� %f �� ���� ������ %f �Դϴ�.\n", radius, area);
		System.out.println("�������� " + radius + "�� ���� ������ " + area + " �Դϴ�.");
	}

}
