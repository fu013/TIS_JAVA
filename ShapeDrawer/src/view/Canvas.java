package view;

public class Canvas {
	private static int ROOT_SIZE = 100;
	private char[][] pt = new char[ROOT_SIZE][ROOT_SIZE];
	
	public void display() {
		for (char[] row : pt) {
			for (char ch : row) {
				System.out.print(ch);
			}
			System.out.println();
		}
		
	}

	public void remember(int i, int y) {
		pt[i][y] = '*';
	}
}
