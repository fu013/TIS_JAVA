package control;

import java.util.List;
import java.util.Scanner;

import model.Board;
import model.Cell;
import model.Line;
import model.StoneType;

public class SmartComPlayer {
	private Board board;
	private Scanner in = new Scanner(System.in);
	
	private void startGame() {
		board = new Board();
		boolean isComTurn = true;
		do {
			if (isComTurn) {
				play();
			} else {
				playByUser();
			}
			isComTurn = !isComTurn;
			board.display();
		} while (!board.gameEnded());
	}

	/**
	 * 규칙 1 : 이길 곳이 있으면 무조건 거기에
	 * 규칙 2 : 막아야 할 곳이 있으면 무조건 거기에
	 * 규칙 3 : 이길 가능성을 가장 높일 수 있는 곳에
	 */
	private void play() {
		List<Line> listLine = board.getListLine();
		for (Line line : listLine) {
			Cell winnableCell = line.findWinnablePlace();
			if (winnableCell != null) {
				winnableCell.place(StoneType.comStone);
				break;
			}
		}
	}

	private void playByUser() {
		System.out.println("게이머가 놓을 자리를 입력하세요 : ");
		byte rowIdx = in.nextByte();
		byte colIdx = in.nextByte();
		board.placeStone(rowIdx, colIdx, StoneType.userStone);
	}

	public static void main(String[] args) {
		SmartComPlayer smartComPlayer = new SmartComPlayer();
		smartComPlayer.startGame();
	}
}
