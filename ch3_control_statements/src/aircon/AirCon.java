package aircon;

public class AirCon {

	public static void main(String[] args) {
		//���� �ǳ� �µ�
		double curTemp = 30;
		//�����µ�
		final double TARGET_TEMP = 20;
		//�������� ���� �Ǵ� ���� ����
		boolean isOn = false;
		
		//���� ����
		while (true) {
			if (curTemp > TARGET_TEMP) {
				if (!isOn) {
					isOn = true;
					System.out.println("����");
				}
				curTemp--;	//�µ� �ϰ�
			} else {
				if (isOn) {
					isOn = false;
					System.out.println("����");
				}
				curTemp++;	//�µ� ���
			}
			System.out.println("���� �µ�" + curTemp);
		}
	}

}
