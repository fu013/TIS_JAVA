package mineGameV2autoOpen;

import java.util.Scanner;

/**
 * 자동으로 펼치기 기능 추가함
 */
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
				if (mineCnt == 0) {
					//내 주변에 지뢰가 하나도 없군. 이때는 자동 펼치기 기능이 작동되어야 하겠지
					//펼치기에서 고려했었니? 초기값은 false일것임.
					boolean[][] isConsidered = new boolean[ROOT][ROOT];
					isConsidered[x][y] = true;	//내 자리는 고려한 것이지!!
					autoOpen(x, y, isConsidered, board);
				}
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
			int provingCol = y + row[1];
			if (!isSafe(provingRow, provingCol))
				continue;
			if (board[provingRow][provingCol] == MINE)
				ret++;
		}
		return ret;
	}

	//ArrayIndexOutofBound 예외 방지하기
	private static boolean isSafe(int provingRow, int provingCol) {
		if (isSafe(provingRow))
			return false;
		if (isSafe(provingCol))
			return false;
		return true;
	}

	/** Overloading 함수 이름은 같고 매개변수는 다른 경우 */
	private static boolean isSafe(int provingRow) {
		return provingRow < 0 || provingRow >= ROOT;
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

	private static void autoOpen(int x, int y, boolean[][] isConsidered, char[][] board) {
		for (int[] row : diff) {
			int openTargetRow = x + row[0];
			int openTargetCol = y + row[1];
			if (!isSafe(openTargetRow, openTargetCol)
					|| isConsidered[openTargetRow][openTargetCol]
					|| board[openTargetRow][openTargetCol] == MINE)
				continue;
			//안전 범위 안에 있으면서 아직 자동 펼치기 하지 않은 경우이면
			isConsidered[openTargetRow][openTargetCol] = true;
			int mineCnt = countMines(board, openTargetRow, openTargetCol);
			board[openTargetRow][openTargetCol] = (char) ('0' + mineCnt);

			if (mineCnt == 0)
				autoOpen(openTargetRow, openTargetCol, isConsidered, board);
		}
	}

}
