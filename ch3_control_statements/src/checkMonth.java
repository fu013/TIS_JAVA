import java.util.Scanner;

public class checkMonth {

	public static void main(String[] args) {
		// 사용자로부터 월을 입력받는다.
		// 올바른 월을 입력받았는 지 확인.
		// 입력값이 올바르지 않으면 다시 입력받는다.
		// 입력값이 올바른 값이면 출력한다.
		final int MIN_MONTH = 1, MAX_MONTH = 12;
		Scanner scan = new Scanner(System.in);
		int month;
		do {
			System.out.print("올바른 월을 입력하세요 [1-12] : ");
			month = scan.nextInt();
		} while (month < MIN_MONTH || month > MAX_MONTH);
		System.out.printf("입력한 월은 %d입니다.", month);
		
		for (int i = 0; i < 5; i ++){
		
		}
	}

}
