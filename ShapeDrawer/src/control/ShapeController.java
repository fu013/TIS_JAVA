package control;

import model.Line;
import model.Point;
import view.Canvas;

public class ShapeController {

	public static void main(String[] args) {
		final int NUM_OF_PT_IN_STAR = 5;
		
		Point[] points = new Point[NUM_OF_PT_IN_STAR];
		points[0] = new Point(10, 10);
		points[1] = new Point(10, 50);
		points[2] = new Point(30, 70);
		points[3] = new Point(50, 50);
		points[4] = new Point(50, 10);
		
		Line[] lines = new Line[NUM_OF_PT_IN_STAR];
		lines[0] = new Line(points[0], points[2]);
		lines[1] = new Line(points[2], points[4]);
		lines[2] = new Line(points[4], points[1]);
		lines[3] = new Line(points[1], points[3]);
		lines[4] = new Line(points[3], points[0]);
		
		Canvas canvas = new Canvas();
		for (Line line : lines) {
			line.draw(canvas);
		}
		
		canvas.display();
	}

}
