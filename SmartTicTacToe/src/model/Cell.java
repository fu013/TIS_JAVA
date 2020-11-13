package model;

import java.util.ArrayList;
import java.util.List;

public class Cell {
	private byte rowIdx, colIdx;
	private StoneType stone = StoneType.emptyStatus;
	
	//나를 담고 있는 줄들은?
	private List<Line> containingLines = new ArrayList<>();

	public Cell(byte i, byte j) {
		rowIdx = i;
		colIdx = j;
	}

	/**
	 * 너가담기는곳은여기란다
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
		return "Cell[행번호=" + rowIdx 
				+ ", 열번호=" + colIdx
				+ ", 놓인돌=" + stone.getStone()
				+ ", 담긴줄개수=" + containingLines.size() + "]";
	}

	public String toString4Display() {
		return "" + stone.getStone();
	}
}
