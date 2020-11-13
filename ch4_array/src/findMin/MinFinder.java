package findMin;

public class MinFinder {

	public static void main(String[] args) {
		//점수 5개 들어 있는 배열이 있다.
		int[] scores = {45, 33, -23, 65, 33};
		//최소값을 구하여 출력
		int minVal = Integer.MAX_VALUE;
		
		for (int score : scores) {
			if (score < minVal)
				minVal = score;
		}
		System.out.println("최소값은 : " + minVal);
	}

}
