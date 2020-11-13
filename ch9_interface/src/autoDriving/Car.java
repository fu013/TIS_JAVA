package autoDriving;

public class Car implements IAuto {
	private boolean isStarted = false;
	private int speed;
	private
	
	@Override
	public void start() {
		isStarted = true;
		speed = 0;
	}

	@Override
	public void turnOff() {
		
	}

	@Override
	public void stop() {
		
	}

	@Override
	public int setSpeed(int speed) {
		return 0;
	}

	@Override
	public int turn(int degree) {
		return 0;
	}

}
