package mineGame;

import java.util.Scanner;

public class MineSweeper {
	private static final int ROOT = 10;
	private static final char MINE = '#';
	private static final char BEFORE_OPEN = '.';
	/** 사용자가 선택한 Cell을 바탕으로 주변 검사를 위한 상대 위치 산출을 위한 차이 정보 */
	private static final int[][] diff = {{-1, -1}, {-1, 0}, {-1, 1},
			{0, -1}, {0, 1},	//{0, 0} 자기 자신이니까 제외
			{1, -1}, {1, 0}, {1, 1}};
	
	public static void main(String[] args) {
		//게임 판
		char[][] board = new char[ROOT][ROOT];
		initBoard(board, GameLevel.midium);

		Scanner scan = new Scanner(System.in);
		int x, y;
		do {
			displayBoard(board);
			System.out.println("펼칠 자리를 입력하세요 : ");
			x = scan.nextInt();
			y = scan.nextInt();
			if (board[x][y] == MINE) {
				//지뢰 밟았어요
				System.out.println("지뢰 밟았어요. 게임 끝!");
				break;
			} else if (board[x][y] == BEFORE_OPEN) {
				//주변 지뢰 개수 구하여 내자리에 출력
				int mineCnt = countMines(board, x, y);
				board[x][y] = (char) ('0' + mineCnt);
			}
		} while(true);
	}

	/**
	 * 주변 지뢰 개수 구하기
	 * @param board
	 * @param x 사용자가 선택한 행
	 * @param y 열
	 * @return 주변 지뢰 개수
	 */
	private static int countMines(char[][] board, int x, int y) {
		int ret = 0;
		for (int[] row : diff) {
			int provingRow = x + row[0];
			//ArrayIndexOutofBound 예외 방지하기
			if (provingRow < 0 || provingRow >= ROOT)
				continue;
			int provingCol = y + row[1];
			//ArrayIndexOutofBound 예외 방지하기
			if (provingCol < 0 || provingCol >= ROOT)
				continue;
			if (board[provingRow][provingCol] == MINE)
				ret++;
		}
		return ret;
	}

	/**
	 * 초기화
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
	 * 게임 상황 출력하기
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
