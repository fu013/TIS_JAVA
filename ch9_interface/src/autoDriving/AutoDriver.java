package autoDriving;

public class AutoDriver {
	public static void main(String[] args) {
		IAuto drivingTarget = new Car();
		
		drivingTarget.start();
		drivingTarget.setSpeed(10);
		drivingTarget.turn(-10);
		drivingTarget.setSpeed(10);
		
		System.out.println(drivingTarget);
	}
}
