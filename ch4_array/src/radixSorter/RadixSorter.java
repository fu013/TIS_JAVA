package radixSorter;

import java.util.ArrayList;

public class RadixSorter {

	/** 
	 * 주어진 문제에서 절대값 기준으로 가장 큰 값을 구한다.
	 * Math.log10(2866772) : 총 반복 회수
	 * 
	 * 분모. 
	 * solving에 들어 있는 모든 데이터를 denominator(10, 100, 1000)등으로 나눈 나머지를
	 * 다음 넣을 방으로 삼아 넣는다. 음수의 경우 나머지가 음수 이므로 절대값을 구하여 방을 찾는다.
	 * 
	 */
	public static void main(String[] args) {
		final int RADIX = 10;
		ArrayList<Integer>[] solving = new ArrayList[RADIX];
		ArrayList<Integer> problem = new ArrayList();
		problem.add(-7);problem.add(-2866772);
		problem.add(21);problem.add(5);problem.add(0);
		solving[0] = problem;
		for (int i = 1; i < RADIX; i++)
			solving[i] = new ArrayList();
		
		int totLoopCnt = (int) Math.log10(findMaxValInAbs(problem)) + 1;
		int denominator = 1;
		
		ArrayList<Integer>[] answer = new ArrayList[RADIX];
		for (int i = 0; i < RADIX; i++)
			answer[i] = new ArrayList();

		for (int i = 0; i <= totLoopCnt; i++) {
			denominator *= 10;
			for (ArrayList<Integer> sol : solving) {
				for (int val : sol) {
					answer[Math.abs(val % denominator) / (denominator / 10)].add(val);
				}
			}
			ArrayList<Integer>[] swap = solving;
			solving = answer;
			for (ArrayList<Integer> as : swap)
				as.clear();
			answer = swap;
		}
		
		ArrayList<Integer> solved = new ArrayList();
		for (Integer val : solving[0]) {
			if (val > 0) {
				solved.add(val);
			} else {
				solved.add(0, val);
			}
		}
		
		System.out.println(solved);
	}

	/** 
	 * 주어진 배열에서 절대값 기준으로 가장 큰 값을 구한다.
	 */
	private static int findMaxValInAbs(ArrayList<Integer> problem) {
		int ret = Integer.MIN_VALUE;
		for (Integer val : problem) {
			if (Math.abs(val) > ret)
				ret = Math.abs(val); 
		}
		return ret;
	}

}
