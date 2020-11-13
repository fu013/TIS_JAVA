package p269_circle;

public class Circle {
	private int radius;
	private Point center;
	
	public Circle(Point point, int i) {
		center = point;
		radius = i;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", center=" + center + "]";
	}
	
}
