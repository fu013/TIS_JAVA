package findMin;

public class DiffFinder {

	public static void main(String[] args) {
		//���� 5�� ��� �ִ� �迭�� �ִ�.
		int[] scores = {45, 33, -23, 65, 33};
		//�� �� ���̰��� ���Ͽ� ���. 12, 56, -88, 32
		Integer prev = null;
		boolean isFirst = true;
		for (int score : scores) {
			if (prev != null) {
				if (isFirst) {
					isFirst = false;
					System.out.print(prev - score);
				} else {
					System.out.print(", " + (prev - score));
				}
			}
			prev = score;
		}
	}

}
