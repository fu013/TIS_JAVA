package model;

import view.Canvas;

public class Line {
	private Point start, end;
	private double inclination;	//����
	private double bias;	//����
	
	public Line(Point point, Point point2) {
		start = point;
		end = point2;
		inclination = start.calcInclination(end);
		bias = start.getY() - inclination * start.getX();
	}

	public void draw(Canvas canvas) {
		//���⸦ �����Ͽ� �������������� x�� �������� y�� ����Ѵ�. ���Ҷ��� �ݴ�
		if (inclination < 1 && inclination > -1) {
			//������������
			workThrough(start.getX(), end.getX(), canvas);
		} else {
			//������
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
