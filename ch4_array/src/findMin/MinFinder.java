package findMin;

public class MinFinder {

	public static void main(String[] args) {
		//���� 5�� ��� �ִ� �迭�� �ִ�.
		int[] scores = {45, 33, -23, 65, 33};
		//�ּҰ��� ���Ͽ� ���
		int minVal = Integer.MAX_VALUE;
		
		for (int score : scores) {
			if (score < minVal)
				minVal = score;
		}
		System.out.println("�ּҰ��� : " + minVal);
	}

}
