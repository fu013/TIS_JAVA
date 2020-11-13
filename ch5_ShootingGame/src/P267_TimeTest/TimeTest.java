package P267_TimeTest;

public class TimeTest {
	private int hour;
	private int minute;
	private int second;
	public TimeTest() {
		super();
	}
	public TimeTest(int hour, int minute, int second) {
		super();
		this.hour = ((hour >= 0 && hour <24) ? hour : 0);
		this.minute =((minute >= 0 && minute <60) ? minute : 0);
		this.second = ((second >= 0 && second <60) ? second : 0);;
	}
	
}
