package ifstudy;

import java.time.LocalDateTime;

public class Greeting {

	public static void main(String[] args) {
		//���� �ð��� Ȯ���Ͽ�
		//���� 4�ÿ��� ���� 10�� �����̸� ��ħ�ڼ̾��
		//�׷��� �ʰ� ���� 4�� �����̸� good afternoon
		//�׷��� ������ good night

		LocalDateTime curTime = LocalDateTime.now();
		int hour = curTime.getHour();
		if (hour > 4 && hour <= 10) {
			System.out.println("��ħ�ڼ̾��");
		} else if (hour > 10 && hour <= 16) {
			System.out.println("good afternoon");
		} else {
			System.out.println("good night");
		}
	}

}
