package model;

import java.util.ArrayList;
import java.util.List;

public class Board {
	protected static final byte ROOT = 3;
	
	private Cell[][] arrCell = new Cell[ROOT][ROOT];
	private List<Line> listLine = new ArrayList<>();
	
	public Board() {
		//ĭ 9�� �����
		for (byte i = 0; i < ROOT; i++) {
			for (byte j = 0; j < ROOT; j++) {
				arrCell[i][j] = new Cell(i, j);
			}
		}
		//�� 8�� �����
		//������ �����
		for (byte i = 0; i < ROOT; i++) {
			Line line = new Line(arrCell[i]);
			listLine.add(line);
		}
		
		//������ �����
		for (byte colIdx = 0; colIdx < ROOT; colIdx++) {
			Line line = new Line();
			listLine.add(line);
			for (byte rowIdx = 0; rowIdx < ROOT; rowIdx++) {
				line.add(arrCell[rowIdx][colIdx]);
			}
		}
		
		//�밢�� �����
		Line diagonalLine = new Line();
		listLine.add(diagonalLine);
		Line diagonalLineRotated = new Line();
		listLine.add(diagonalLineRotated);
		for (byte i = 0; i < ROOT; i++) {
			diagonalLine.add(arrCell[i][i]);
			diagonalLineRotated.add(arrCell[i][ROOT - i - 1]);
		}
		
		/* ���� �׽�Ʈ�� ���Ͽ� ��ǻ�� �� �ΰ��� �����ؼ� ���ƺ���
		arrCell[0][0].place(StoneType.comStone);
		arrCell[1][1].place(StoneType.comStone);
		*/
	}

	public Cell[][] getArrCell() {
		return arrCell;
	}

	public List<Line> getListLine() {
		return listLine;
	}

	public boolean gameEnded() {
		return false;
	}

	public void placeStone(byte rowIdx, byte colIdx, StoneType userstone) {
		arrCell[rowIdx][colIdx].place(userstone);
	}

	public void display() {
		for (int i = 0; i < ROOT; i++) {
			System.out.println(" " + arrCell[i][0].toString4Display() 
					+ " | " + arrCell[i][1].toString4Display()
					+ " | " + arrCell[i][2].toString4Display());
			if (i != 2)
				System.out.println("---|---|---");
		}
	}

/* --------------�Ⱦ��� ������ �������� ������ ���  ----------------------- */	
	
	
	/**
	 * �̱� ���ɼ��� ���� ����
	 * @return
	 */
	public Cell getMostWinable() {
		Cell ret = arrCell[0][0];
		for (Cell[] row : arrCell) {
			for (Cell cell : row) {
				if (cell.getLineCount() > ret.getLineCount()) {
					ret = cell;
				}
			}
		}
		return ret;
	}

}
