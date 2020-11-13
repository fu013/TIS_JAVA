package 머리발달;

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
		//몇번쨰 줄이냐에 따라서 칸을 채운다
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
		//몇번쨰 줄이냐에 따라서 칸을 채운다
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
		//몇번쨰 줄이냐에 따라서 칸을 채운다
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
		//몇번쨰 줄이냐에 따라서 칸을 채운다
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
		//5줄 10칸
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
	맨 첫 줄과 마지막 줄은 다 찍기
	그 중간은 컬럼의 처음과 마지막만 * 그 중간은 공백
	 */
	private static void drawEmptyRect() {
		//5줄 10칸
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
