package model;

import java.util.ArrayList;
import java.util.List;

public class Line {
	private List<Cell> cells = new ArrayList<>();
	
	public Line(Cell[] cells) {
		for (Cell cell : cells) {
			this.cells.add(cell);
			cell.addedTo(this);
		}
	}

	public Line() {
	}

	public void add(Cell cell) {
		cells.add(cell);
		cell.addedTo(this);
	}

	/**
	 * 두곳에 O. 나머지 하나는 비어있을 것
	 * @return
	 */
	public Cell findWinnablePlace() {
		byte cntCom = 0, cntEmpty = 0;
		Cell ret = null;
		for (Cell cell : cells) {
			if (cell.getStone() == StoneType.comStone) {
				cntCom++;
			} else if (cell.getStone() == StoneType.emptyStatus) {
				cntEmpty++;
				ret = cell;
			}
		}
		if (cntCom == 2 && cntEmpty == 1) {
			return ret;
		} else {
			return null;
		}
	}

	public void placeStone(StoneType comstone) {
		// TODO Auto-generated method stub
		
	}
}
