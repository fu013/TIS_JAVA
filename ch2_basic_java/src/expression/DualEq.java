package expression;

public class DualEq {

	public static void main(String[] args) {
		double b = -3.0d, c = 2.0d;
		double sqrt = Math.sqrt(b * b - 4 * c);
		double solA = -b + sqrt;
		double solB = -b - sqrt;
		solA = solA / 2;
		solB = solB / 2;
		System.out.println("ù��° ���� " + solA);
		System.out.println("�ι�° ���� " + solB);
	}

}
