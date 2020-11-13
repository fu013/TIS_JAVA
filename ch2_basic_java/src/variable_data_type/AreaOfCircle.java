package variable_data_type;

public class AreaOfCircle {

	public static void main(String[] args) {
		// 계산하고자 하는 원의 반지름을 정의합니다.
		double radius = 5.0d;
		
		//원의 면적은 파이 * 반지름의 제곱
		double area;
		calcAndDisplay(radius);

		if (args.length == 1) {
			radius = Double.parseDouble(args[0]);
			calcAndDisplay(radius);
		}
	}

	private static void calcAndDisplay(double radius) {
		double area = Math.PI * radius * radius;
		System.out.printf("\"반지름\"이 %f 인 원의 면적은 %f 입니다.\n", radius, area);
		System.out.println("반지름이 " + radius + "인 원의 면적은 " + area + " 입니다.");
	}

}
