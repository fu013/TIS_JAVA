package binarySearch;

import java.util.Scanner;

public class BinarySearcher {

	public static void main(String[] args) {
		//12개
		int[] s = {0, 1, 5, 10, 30, 44, 66, 78, 81, 82, 89, 100};
		
		System.out.println("탐색할 값을 입력하시오!");
		Scanner scan = new Scanner(System.in);
		//탐색할 값
		int searchTarget = scan.nextInt();
		//이전 검사한 왼쪽과 오른쪽 위치
		int prevLeftIndex = -1, prevRightIndex = s.length;
		while (true) {
			//검사할 위치
			int provingIndex = (prevLeftIndex + prevRightIndex) / 2;
			//더이상 갈 곳이 없어
			if (provingIndex == prevLeftIndex || provingIndex == prevRightIndex) {
				System.out.printf("탐색값은 없습니다.");
				break;
			}
			//찾았니?
			if (searchTarget == s[provingIndex]) {
				System.out.printf("%d라는 탐색값은 %d위치에 있습니다.", searchTarget, provingIndex);
				break;
			}
			//크니?
			if (searchTarget > s[provingIndex]) {
				prevLeftIndex = provingIndex;
				continue;
			} 
			//작은 상황입니다.
			prevRightIndex = provingIndex;
		}
	}
}
