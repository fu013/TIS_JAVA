package selectionSort;

import java.util.Arrays;

public class SelectionSorter {

	public static void main(String[] args) {
		int[] problem = { 5, 22, 4, 6, 1, 4, 7 };
		// 주어진 배열 중에서 최솟값을 찾는다.
		// 그 값을 맨 앞에 위치한 값과 교체한다(패스(pass)).
		// 맨 처음 위치를 뺀 나머지 리스트를 같은 방법으로 교체한다.
		// 하나의 원소만 남을 때까지 위의 1~3 과정을 반복한다.
		
		// 비교시작점
		int compareStartPoint = 0;
		for (; compareStartPoint < problem.length - 1; compareStartPoint++) {
			// 제일 작은 값이 있는 위치
			int indexOfMinVal = compareStartPoint;
			//비교할 곳
			for(int comparePoint = compareStartPoint + 1; comparePoint < problem.length; comparePoint++) {
				//지금까지 찾은 제일 작은 값과 비교값의 크기를 비교한다
				if(problem[comparePoint] < problem[indexOfMinVal]){
					//지금 비교한 위치가 제일 작은 위치가 되어야 한다.
					indexOfMinVal = comparePoint;
				}
			}
			// for이 끝나면 지금까지 찾아던 가장 작은값을 시작점에 들어있던 값과 바꾸어 준다.swap
			int swap = problem[indexOfMinVal];
			problem[indexOfMinVal] = problem[compareStartPoint];
			problem[compareStartPoint] = swap;
		}
		System.out.println(Arrays.toString(problem));
	}

}
