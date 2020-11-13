package p257_box_constructor;

public class Box {
	private int width;
	private int length;
	private int height;
	private int volume;
	
	public Box(int width, int length, int height) {
		this.width = width;
		this.length = length;
		this.height = height;
		volume = width * length * height;
	}
	public int getVolume() {
		return volume;
	}
	@Override
	public String toString() {
		return "Box [width=" + width + ", length=" + length + ", height=" + height + ", volume=" + volume + "]";
	}
	
	
}	