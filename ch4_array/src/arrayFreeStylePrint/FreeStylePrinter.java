package arrayFreeStylePrint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FreeStylePrinter {
	private static final byte ROOT = 5;
	private static char[][] board = {
			{'a', 'b', 'c', 'd', 'e'}, 
			{'f', 'g', 'h', 'i', 'j'}, 
			{'k', 'l', 'm', 'n', 'o'}, 
			{'p', 'q', 'r', 's', 't'}, 
			{'u', 'v', 'w', 'x', 'y'}
	};

	//���� ������
	private static final int[][] direction = {
			//NW       N       NE
			{-1, -1}, {-1, 0}, {-1, 1},
			// S      E
			{0, -1}, {0, 1},	//{0, 0} �ڱ� �ڽ��̴ϱ� ����
			// SW    S        SE
			{1, -1}, {1, 0}, {1, 1}};
	//{{1, 0},  {{-1, 1}, {1, -1}, {0, 1}}}
	private static final Map<int[], ArrayList<int[]>> rotate45NextPaths = new HashMap<>();
	static {
		//W -> SW, NE, E
		ArrayList<int[]> al = new ArrayList<>();
		al.add(new int[] {1, -1});
		al.add(new int[] {1, 1});
		al.add(new int[] {0, 1});
		rotate45NextPaths.put(new int[] {0, -1}, al);
		//N->NE, SW
		al = new ArrayList<>();
		al.add(new int[] {-1, 1});
		al.add(new int[] {1, -1});
		rotate45NextPaths.put(new int[] {-1, 0}, al);
		//SW->SW, E, S
		al = new ArrayList<>();
		al.add(new int[] {1, -1});
		al.add(new int[] {0, 1});
		al.add(new int[] {1, 0});
		rotate45NextPaths.put(new int[] {1, -1}, al);
		//NE->NE, S, E
		al = new ArrayList<>();
		al.add(new int[] {-1, 1});
		al.add(new int[] {1, 0});
		al.add(new int[] {0, 1});
		rotate45NextPaths.put(new int[] {-1, 1}, al);
	}
	
	public static void main(String[] args) {
		printAsIs();
		System.out.println();
		print�̵�ﰢ��();
		System.out.println();
		printSandTimer();
		System.out.println();
		rotate45by������();
		System.out.println();
		//rotate45by����();
		System.out.println();
		printRibbon();
	}
	
	/**
	 * �������� �״�� ����ϱ�
	 */
	private static void printAsIs() {
		for (int i = 0; i < ROOT; i++) {
			for (int j = 0; j < ROOT; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}

	/**
	 * �̵�ﰢ��. ���� ���� ���
	 *   c
	 *  ghi
	 * klmno
	 */
	private static void print�̵�ﰢ��() {
		//00 01 02			0	 2
		//10 11 12 13       1    1
		//20 21 22 23 24    2    0
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3 + i; j++) {
				int spaceCnt = 2 - i;
				if (j < spaceCnt) {
					System.out.print(' ');
				} else {
					System.out.print(board[i][j]);
				}
			}
			System.out.println();
		}
	}

	/**
	 * ���ﰢ�� + ���� ���
	 */

	/**
	 * �𷡽ð� + ���� ���
	 */
	private static void printSandTimer() {
		//�밢�� 00, 11, 22, 33, 44
		//���밢�� 04, 13, 22, 31, 40
		for (int i = 0; i < ROOT; i++) {	//01234
			int j = ROOT - i - 1;	//43210
			int start, end;
			if (i < ROOT / 2) {
				start = i; end = j;
			} else {
				start = j; end = i;
			}
			for (int k = 0; k <= end; k++) {
				if (k < start)
					System.out.print(' ');
				else
					System.out.print(board[i][k]);
			}
			System.out.println();
		}
	}
	
	private static void printRibbon() {
		System.out.println("==========Ribbon=========");
		//�밢�� 00, 11, 22, 33, 44
		//���밢�� 04, 13, 22, 31, 40
		for (int i = 0; i < ROOT; i++) {	//01234
			int j = ROOT - i - 1;	//43210
			int start, end;
			if (i < ROOT / 2) {
				start = i; end = j;
			} else {
				start = j; end = i;
			}
			for (int k = 0; k < ROOT; k++) {
				if (k <= start || k >= end) {
					System.out.print(board[i][k]);
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}
	/**
	 * ȸ��. 90��, 45��, �ð����, �ݽð����
	 */
	private static void rotate45by������() {
		/*
		{'a', 'b', 'c', 'd', 'e'}, 
		{'f', 'g', 'h', 'i', 'j'}, 
		{'k', 'l', 'm', 'n', 'o'}, 
		{'p', 'q', 'r', 's', 't'}, 
		{'u', 'v', 'w', 'x', 'y'}
		abfkgcdhlpuqmiejnrvwsotxy */
		for (int k = 0; k < 9; k++) {
			int abs = Math.abs(4-k);
			for (int i = 0; i < abs ; i++) {
				System.out.print(' ');
			}
			for (int j = 0; j < ROOT; j++) {
				for (int i = 0; i < ROOT; i++) {
					// �� ���� ���� �� (k)�� ���� ���� ��� ����Ѵ�. 
					if ( i + j == k) {
						System.out.print("" + board[i][j] + ' ');
					}
				}
			}
			System.out.println();
		}
	}

	private static void rotate45by����() {
		step(rotate45NextPaths, new int[] {0, -1}, new int[] {0, 1});
	}

	private static void step(Map<int[], ArrayList<int[]>> pathGuide, 
			int[] curPos, int[] toDirection) {
		int nextX = curPos[0] + toDirection[0], 
			nextY = curPos[1] + toDirection[1];
		if (!(nextX >= 0 && nextX <= ROOT && nextY >= 0 && nextY <= ROOT))
			return;
		System.out.print("" + board[nextX][nextY] + ' ');

		if (toDirection[0] == 0 && toDirection[1] == 1) {
			int[] direction = {0, -1};
			for (int[] nextdirection : pathGuide.get(direction)) {
				step(pathGuide, new int[] {nextX, nextY}, nextdirection);
			}
 		}
	}
	
	/**
	 * �׵θ� ���� ������ ���鼭
	 * abcdejotyxwvupkfg...
	 */

	/**
	 * �ȿ������� ������ ���� ���鼭
	 * mhinsr...
	 */
}
