package model;

public class Point {
	private int x, y;

	public Point(int i, int j) {
		x = i;
		y = j;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public double calcInclination(Point end) {
		if (x - end.x == 0)
			return Double.MAX_VALUE;
		return ((double)y - end.y) / (x - end.x);
	}

}
