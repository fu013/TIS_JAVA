package www.ivar.com.shootingGame.control;

import java.util.Scanner;

import www.ivar.com.shootingGame.model.Bullet;
import www.ivar.com.shootingGame.model.Cannon;
import www.ivar.com.shootingGame.model.Planet;
import www.ivar.com.shootingGame.model.PlanetEnum;
import www.ivar.com.shootingGame.model.Target;

public class Shooter {
	public static void main(String[] args) {
		Planet planet = new Planet(PlanetEnum.EARTH);
		Cannon cannon = new Cannon(0);
		planet.locate(cannon);
		
		//Default Constructor(������)�� ȣ���մϴ�.
		Target target = new Target();
		planet.locate(target);
		Bullet bullet = new Bullet();
		planet.locate(bullet);
		
		cannon.load(bullet);
		int distance = cannon.calcDistance(target);
		System.out.printf("��ǥ�������� �Ÿ��� %fkm�Դϴ�.", distance / 1000.0f);
		
		float degree = getDegree();
		cannon.setDegree(degree);
		cannon.shot();
		
		planet.timeFlow();
	}

	private static float getDegree() {
		Scanner scan = new Scanner(System.in);
		float ret = -1;
		do {
			ret = scan.nextFloat();
		} while (!Cannon.isSafe(ret));
		return ret;
	}
}
