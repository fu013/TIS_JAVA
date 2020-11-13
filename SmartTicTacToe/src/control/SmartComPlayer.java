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
	 * ��Ģ 1 : �̱� ���� ������ ������ �ű⿡
	 * ��Ģ 2 : ���ƾ� �� ���� ������ ������ �ű⿡
	 * ��Ģ 3 : �̱� ���ɼ��� ���� ���� �� �ִ� ����
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
		System.out.println("���̸Ӱ� ���� �ڸ��� �Է��ϼ��� : ");
		byte rowIdx = in.nextByte();
		byte colIdx = in.nextByte();
		board.placeStone(rowIdx, colIdx, StoneType.userStone);
	}

	public static void main(String[] args) {
		SmartComPlayer smartComPlayer = new SmartComPlayer();
		smartComPlayer.startGame();
	}
}
