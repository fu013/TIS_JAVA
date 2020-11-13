package findMin;

public class DiffFinder {

	public static void main(String[] args) {
		//점수 5개 들어 있는 배열이 있다.
		int[] scores = {45, 33, -23, 65, 33};
		//앞 뒤 차이값을 구하여 출력. 12, 56, -88, 32
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
