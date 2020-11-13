package expression;

public class LeapYearCalc {

	public static void main(String[] args) {
		// ���� ��� ������ 4�� ������ �������� �ش� �������� �Ѵ�. ...
		// ���� ��� ������ 4, 100���� ������ �������� �ش� ������� �Ѵ�. ...
		// ���� ��� ������ 4, 100, 400���� ������ �������� �ش� �������� �д�.
		
		short year = 2100;
		boolean isLeapYear = false;
		
		isLeapYear = isLeapByBit(year, isLeapYear);
		
		if (isLeapYear) {
			System.out.printf("%d���� �����Դϴ�", year);
		} else {
			System.out.printf("%d���� ������ �ƴմϴ�.", year);
		}
	}

	//�Լ� Ʋ. method signiture. ���� ���
	private static final short BIT_MASK = 3;	//0000000011
	private static boolean isLeapByBit(short year, boolean isLeapYear) {
		return (year & BIT_MASK) == 0 ? 
				(year % 100 == 0 ? year % 400 == 0 : true) 
				: false;
	}

	private static boolean isLeapByIf(short year, boolean isLeapYear) {
		if (year % 4 == 0) {	//��� ������ 4�� ������ ��������
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
