package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Board;
import model.Cell;

public class TestTicTacToe {

	@Test
	public void test() {
		Board board = new Board();
		Cell[][] arrCell = board.getArrCell();
		for (Cell[] row : arrCell) {
			for (Cell cell : row) {
				System.out.println(cell);
			}
		}
	}

}
