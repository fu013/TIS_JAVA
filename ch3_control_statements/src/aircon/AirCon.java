package aircon;

public class AirCon {

	public static void main(String[] args) {
		//현재 실내 온도
		double curTemp = 30;
		//설정온도
		final double TARGET_TEMP = 20;
		//에어컨이 켜짐 또는 꺼짐 상태
		boolean isOn = false;
		
		//무한 루핑
		while (true) {
			if (curTemp > TARGET_TEMP) {
				if (!isOn) {
					isOn = true;
					System.out.println("켜짐");
				}
				curTemp--;	//온도 하강
			} else {
				if (isOn) {
					isOn = false;
					System.out.println("꺼짐");
				}
				curTemp++;	//온도 상승
			}
			System.out.println("현재 온도" + curTemp);
		}
	}

}
