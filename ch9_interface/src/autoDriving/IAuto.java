package autoDriving;

public interface IAuto {
	public void start();	
	public void turnOff();	
	public void stop();
	public int setSpeed(int speed);
	public int turn(int degree);
}
