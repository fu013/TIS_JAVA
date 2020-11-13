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

			System.out.println("다음 놓을 곳의 좌표를 입력하시오 : ");
			x = scan.nextInt(); y = scan.nextInt();
			
			//놓여진 곳을 다시 선택하는 나쁜 인간!
			if (board[x][y] != ' ') {
				System.out.println("잘못된 좌표!");
				continue;
			}
			board[x][y] = 'X';
			
			//컴퓨터는 비어있는 첫 자리에 놓는다
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
	 * 게임 상황판 출력하기
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
	 * 게임 보드를 공백으로 초기화합니다.
	 * @param board
	 */
	private static void initializeBoard(char[][] board) {
		for (int i = 0; i < ROOT; i++)
			for (int j = 0; j < ROOT; j++)
				board[i][j] = ' ';
	}

}
