package model;

import java.util.ArrayList;
import java.util.List;

public class Cell {
	private byte rowIdx, colIdx;
	private StoneType stone = StoneType.emptyStatus;
	
	//���� ��� �ִ� �ٵ���?
	private List<Line> containingLines = new ArrayList<>();

	public Cell(byte i, byte j) {
		rowIdx = i;
		colIdx = j;
	}

	/**
	 * �ʰ����°����������
	 * @param line
	 */
	public void addedTo(Line line) {
		containingLines.add(line);
	}

	public int getLineCount() {
		return containingLines.size();
	}

	public StoneType getStone() {
		return stone;
	}

	public void place(StoneType comstone) {
		stone = comstone;
	}

	public String toString4Debug() {
		return "Cell[���ȣ=" + rowIdx 
				+ ", ����ȣ=" + colIdx
				+ ", ���ε�=" + stone.getStone()
				+ ", ����ٰ���=" + containingLines.size() + "]";
	}

	public String toString4Display() {
		return "" + stone.getStone();
	}
}
