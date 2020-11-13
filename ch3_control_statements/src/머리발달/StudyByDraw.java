package �Ӹ��ߴ�;

public class StudyByDraw {

	public static void main(String[] args) {
		drawRect();
		System.out.println();
		drawTriangle();
		System.out.println();
		drawInvertedTriangle();
		System.out.println();
		drawInvertedRigthTriangle();
		
		drawEmptyRect();
		
		drawEmptyTriangle();
	}

	/**
	  
	  *
	  **
	  ***
	  ****
	  *****
	 
	 */
	private static void drawTriangle() {
		final byte ROWS = 5;
		//����� ���̳Ŀ� ���� ĭ�� ä���
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print('*');
			}
			System.out.print('\n');
		}
	}

	/**
	  
	  *
	  **
	  * *
	  *  *
	  *****
	 
	 */
	private static void drawEmptyTriangle() {
		final byte ROWS = 5;
		//����� ���̳Ŀ� ���� ĭ�� ä���
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print('*');
			}
			System.out.print('\n');
		}
	}

	/**
	  
	  *****
	  ****
	  ***
	  **
	  *
	 
	 */
	private static void drawInvertedTriangle() {
		final byte ROWS = 5;
		//����� ���̳Ŀ� ���� ĭ�� ä���
		for (int i = 0; i < ROWS; i++) {
			for (int j = ROWS - i; j > 0; j--) {
				System.out.print('*');
			}
			System.out.print('\n');
		}
	}

	/**
	   0 1 2 3 4 
	 0 *****
	 1 ^****
	 2 ^^***
	 3 ^^^**
	 4 ^^^^*
	 
	 */
	private static void drawInvertedRigthTriangle() {
		final byte ROWS = 5;
		//����� ���̳Ŀ� ���� ĭ�� ä���
		for (int i = 0; i < ROWS; i++) {
			char startChar = ' ';
			for (int j = 0; j < ROWS; j++) {
				if (i == j)
					startChar = '*';
				System.out.print(startChar);
			}
			System.out.print('\n');
		}
	}
	
	
	private static void drawRect() {
		//5�� 10ĭ
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

	/**
********************
*                  *
*                  *
********************
	�� ù �ٰ� ������ ���� �� ���
	�� �߰��� �÷��� ó���� �������� * �� �߰��� ����
	 */
	private static void drawEmptyRect() {
		//5�� 10ĭ
		for (int i = 0; i < 5; i++) {
			boolean isFirstOrLastRow = i == 0 || i == 4;
			
			for (int j = 0; j < 10; j++) {
				if (isFirstOrLastRow) {
					System.out.print('*');
				} else {
					boolean isStartOrLastColumn = j == 0 || j == 9;
					if (isStartOrLastColumn) {
						System.out.print('*');
					} else {
						System.out.print(' ');
					}
				}
			}
			System.out.println();
		}
	}

}
