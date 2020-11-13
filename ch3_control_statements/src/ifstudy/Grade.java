package ifstudy;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		//스케너를 만든다
		Scanner scan = new Scanner(System.in);
		//성적을 입력 받는다
		byte score = scan.nextByte();
		if (score >= 90) {
			//90점 이상이면 A출력
			System.out.println('A');
		} else if (score >= 80) {
			//그렇지 않고 80점 이상이면 B
			System.out.println('B');
		} else if (score >= 70) {
			System.out.println('C');
		} else {
			System.out.println('F');
		}
	}

}
