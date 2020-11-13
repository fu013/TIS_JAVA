package radixSorter;

import java.util.ArrayList;

public class RadixSorter {

	/** 
	 * �־��� �������� ���밪 �������� ���� ū ���� ���Ѵ�.
	 * Math.log10(2866772) : �� �ݺ� ȸ��
	 * 
	 * �и�. 
	 * solving�� ��� �ִ� ��� �����͸� denominator(10, 100, 1000)������ ���� ��������
	 * ���� ���� ������ ��� �ִ´�. ������ ��� �������� ���� �̹Ƿ� ���밪�� ���Ͽ� ���� ã�´�.
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
	 * �־��� �迭���� ���밪 �������� ���� ū ���� ���Ѵ�.
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
