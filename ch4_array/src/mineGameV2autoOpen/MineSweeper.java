package mineGameV2autoOpen;

import java.util.Scanner;

/**
 * �ڵ����� ��ġ�� ��� �߰���
 */
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
				if (mineCnt == 0) {
					//�� �ֺ��� ���ڰ� �ϳ��� ����. �̶��� �ڵ� ��ġ�� ����� �۵��Ǿ�� �ϰ���
					//��ġ�⿡�� ����߾���? �ʱⰪ�� false�ϰ���.
					boolean[][] isConsidered = new boolean[ROOT][ROOT];
					isConsidered[x][y] = true;	//�� �ڸ��� ����� ������!!
					autoOpen(x, y, isConsidered, board);
				}
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
			int provingCol = y + row[1];
			if (!isSafe(provingRow, provingCol))
				continue;
			if (board[provingRow][provingCol] == MINE)
				ret++;
		}
		return ret;
	}

	//ArrayIndexOutofBound ���� �����ϱ�
	private static boolean isSafe(int provingRow, int provingCol) {
		if (isSafe(provingRow))
			return false;
		if (isSafe(provingCol))
			return false;
		return true;
	}

	/** Overloading �Լ� �̸��� ���� �Ű������� �ٸ� ��� */
	private static boolean isSafe(int provingRow) {
		return provingRow < 0 || provingRow >= ROOT;
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

	private static void autoOpen(int x, int y, boolean[][] isConsidered, char[][] board) {
		for (int[] row : diff) {
			int openTargetRow = x + row[0];
			int openTargetCol = y + row[1];
			if (!isSafe(openTargetRow, openTargetCol)
					|| isConsidered[openTargetRow][openTargetCol]
					|| board[openTargetRow][openTargetCol] == MINE)
				continue;
			//���� ���� �ȿ� �����鼭 ���� �ڵ� ��ġ�� ���� ���� ����̸�
			isConsidered[openTargetRow][openTargetCol] = true;
			int mineCnt = countMines(board, openTargetRow, openTargetCol);
			board[openTargetRow][openTargetCol] = (char) ('0' + mineCnt);

			if (mineCnt == 0)
				autoOpen(openTargetRow, openTargetCol, isConsidered, board);
		}
	}

}
