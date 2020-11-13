package ifstudy;

import java.util.Scanner;

public class SalesCommission {

	public static void main(String[] args) {
		//목표 실적 상수 정의. 만원
		final int TARGET_SALES = 1000;
		//영업 보너스 상수 정의
		final float COMM_RATE = 0.1f;
		//스캐너 만들기
		Scanner scan = new Scanner(System.in);
		//실적 입력 받을 것야
		System.out.println("실적을 입력하세요!!!");
		int perfomedSales = scan.nextInt();
		//목표 실적 달성 여부 판단
		if (perfomedSales > TARGET_SALES) {
			//실적 달성 시
			//달성 축하 출력
			System.out.println("실적을 달성하였습니다!");
			//실적 빼기 목표 계산해서
			int overSales = perfomedSales - TARGET_SALES;
			//초과 실적에 대하여 보너스를 곱하고 계산하여 출력한다.
			System.out.printf("보너스는 %d입니다", (int) (overSales * COMM_RATE));
		}
	}

}
