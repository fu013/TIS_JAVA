package expression;

public class LeapYearCalc {

	public static void main(String[] args) {
		// 서력 기원 연수가 4로 나누어 떨어지는 해는 윤년으로 한다. ...
		// 서력 기원 연수가 4, 100으로 나누어 떨어지는 해는 평년으로 한다. ...
		// 서력 기원 연수가 4, 100, 400으로 나누어 떨어지는 해는 윤년으로 둔다.
		
		short year = 2100;
		boolean isLeapYear = false;
		
		isLeapYear = isLeapByBit(year, isLeapYear);
		
		if (isLeapYear) {
			System.out.printf("%d년은 윤년입니다", year);
		} else {
			System.out.printf("%d년은 윤년이 아닙니다.", year);
		}
	}

	//함수 틀. method signiture. 성능 향상
	private static final short BIT_MASK = 3;	//0000000011
	private static boolean isLeapByBit(short year, boolean isLeapYear) {
		return (year & BIT_MASK) == 0 ? 
				(year % 100 == 0 ? year % 400 == 0 : true) 
				: false;
	}

	private static boolean isLeapByIf(short year, boolean isLeapYear) {
		if (year % 4 == 0) {	//기원 연수가 4로 나누어 떨어지는
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					isLeapYear = true;
				}
			} else {
				isLeapYear = true;
			}
		}
		return isLeapYear;
	}

}
