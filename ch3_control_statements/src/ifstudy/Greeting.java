package ifstudy;

import java.time.LocalDateTime;

public class Greeting {

	public static void main(String[] args) {
		//현재 시간을 확보하여
		//오전 4시에서 오전 10시 사이이면 아침자셨어요
		//그렇지 않고 오후 4시 이전이면 good afternoon
		//그렇지 않으면 good night

		LocalDateTime curTime = LocalDateTime.now();
		int hour = curTime.getHour();
		if (hour > 4 && hour <= 10) {
			System.out.println("아침자셨어요");
		} else if (hour > 10 && hour <= 16) {
			System.out.println("good afternoon");
		} else {
			System.out.println("good night");
		}
	}

}
