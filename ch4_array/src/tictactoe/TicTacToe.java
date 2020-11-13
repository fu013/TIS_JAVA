package tictactoe;

import java.util.Scanner;

public class TicTacToe {
	final static int ROOT = 3;

	public static void main(String[] args) {
		char[][] board = new char[ROOT][ROOT];
		int x, y;
		Scanner scan = new Scanner(System.in);
		initializeBoard(board);
		do {
			displayBoard(board);

			System.out.println("���� ���� ���� ��ǥ�� �Է��Ͻÿ� : ");
			x = scan.nextInt(); y = scan.nextInt();
			
			//������ ���� �ٽ� �����ϴ� ���� �ΰ�!
			if (board[x][y] != ' ') {
				System.out.println("�߸��� ��ǥ!");
				continue;
			}
			board[x][y] = 'X';
			
			//��ǻ�ʹ� ����ִ� ù �ڸ��� ���´�
			boolean isComPlayed = playByCom(board);
			if (!isComPlayed)
				break;
		} while (true);
	}

	private static boolean playByCom(char[][] board) {
		boolean isComPlayed = false;
		OUTER:
		for (int i = 0; i < ROOT; i++)
			for (int j = 0; j < ROOT; j++) {
				if (board[i][j] == ' ') {
					board[i][j] = 'O';
					isComPlayed = true;
					break OUTER;
				}
			}
		return isComPlayed;
	}

	/**
	 * ���� ��Ȳ�� ����ϱ�
	 * @param board
	 */
	private static void displayBoard(char[][] board) {
		for (int i = 0; i < ROOT; i++) {
			System.out.println(" " + board[i][0] + "| " + board[i][1] + "| " + board[i][2]);
			if (i != 2)
				System.out.println("---|---|---");
		}
	}

	/**
	 * ���� ���带 �������� �ʱ�ȭ�մϴ�.
	 * @param board
	 */
	private static void initializeBoard(char[][] board) {
		for (int i = 0; i < ROOT; i++)
			for (int j = 0; j < ROOT; j++)
				board[i][j] = ' ';
	}

}
