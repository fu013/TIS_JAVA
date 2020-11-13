package model;

import view.Canvas;

public class Line {
	private Point start, end;
	private double inclination;	//기울기
	private double bias;	//절편
	
	public Line(Point point, Point point2) {
		start = point;
		end = point2;
		inclination = start.calcInclination(end);
		bias = start.getY() - inclination * start.getX();
	}

	public void draw(Canvas canvas) {
		//기울기를 산출하여 눞혀져있을때는 x를 기준으로 y를 계산한다. 급할때는 반대
		if (inclination < 1 && inclination > -1) {
			//눞혀져있을때
			workThrough(start.getX(), end.getX(), canvas);
		} else {
			//세워짐
			workThrough(start.getY(), end.getY(), canvas);
		}
	}

	private void workThrough(int start, int end, Canvas canvas) {
		int sx = start;
		int ex;
		if (sx > end) {
			sx = end;
			ex = start;
		} else {
			ex = end;
		}
		for (int i = sx; i < ex; i++) {
			int y = (int) (inclination * i + bias);
			canvas.remember(i, y);
		}
	}

	
}
