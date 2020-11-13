package expression;

public class CompetitionLevelProblem {

	public static void main(String[] args) {
		int[] pro = {2, 3, 3, 4, 2};
		int sol = 0;
		
		for(int val : pro) {
			sol = sol ^ val;
		}
		System.out.println(sol);
	}

}
