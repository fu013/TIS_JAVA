package mineGame;

import java.util.Scanner;

public class MineSweeper {
	private static final int ROOT = 10;
	private static final char MINE = '#';
	private static final char BEFORE_OPEN = '.';
	/** ����ڰ� ������ Cell�� �������� �ֺ� �˻縦 ���� ��� ��ġ ������ ���� ���� ���� */
	private static final int[][] diff = {{-1, -1}, {-1, 0}, {-1, 1},
			{0, -1}, {0, 1},	//{0, 0} �ڱ� �ڽ��̴ϱ� ����
			{1, -1}, {1, 0}, {1, 1}};
	
	public static void main(String[] args) {
		//���� ��
		char[][] board = new char[ROOT][ROOT];
		initBoard(board, GameLevel.midium);

		Scanner scan = new Scanner(System.in);
		int x, y;
		do {
			displayBoard(board);
			System.out.println("��ĥ �ڸ��� �Է��ϼ��� : ");
			x = scan.nextInt();
			y = scan.nextInt();
			if (board[x][y] == MINE) {
				//���� ��Ҿ��
				System.out.println("���� ��Ҿ��. ���� ��!");
				break;
			} else if (board[x][y] == BEFORE_OPEN) {
				//�ֺ� ���� ���� ���Ͽ� ���ڸ��� ���
				int mineCnt = countMines(board, x, y);
				board[x][y] = (char) ('0' + mineCnt);
			}
		} while(true);
	}

	/**
	 * �ֺ� ���� ���� ���ϱ�
	 * @param board
	 * @param x ����ڰ� ������ ��
	 * @param y ��
	 * @return �ֺ� ���� ����
	 */
	private static int countMines(char[][] board, int x, int y) {
		int ret = 0;
		for (int[] row : diff) {
			int provingRow = x + row[0];
			//ArrayIndexOutofBound ���� �����ϱ�
			if (provingRow < 0 || provingRow >= ROOT)
				continue;
			int provingCol = y + row[1];
			//ArrayIndexOutofBound ���� �����ϱ�
			if (provingCol < 0 || provingCol >= ROOT)
				continue;
			if (board[provingRow][provingCol] == MINE)
				ret++;
		}
		return ret;
	}

	/**
	 * �ʱ�ȭ
	 * @param board
	 */
	private static void initBoard(char[][] board, GameLevel gl) {
		for (int i = 0; i < ROOT; i++)
			for (int j = 0; j < ROOT; j++)
				if (Math.random() < gl.probability)
					board[i][j] = MINE;
				else
					board[i][j] = BEFORE_OPEN;
	}

	/**
	 * ���� ��Ȳ ����ϱ�
	 * @param board
	 */
	private static void displayBoard(char[][] board) {
		for (int i = 0; i < ROOT; i++) {
			for (int j = 0; j < ROOT; j++)
				System.out.print(" " + board[i][j]);
			System.out.println();
		}
	}

}
