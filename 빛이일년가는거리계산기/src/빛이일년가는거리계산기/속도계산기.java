package �����ϳⰡ�°Ÿ�����;

/**
 * ���� �ϳ� ���� ���� �Ÿ��� ����մϴ�.
 * @author uer-004
 *
 */
public class �ӵ����� {
	//�ϳ��� �� �� �ΰ���?
	private static final int SECOND_PER_YEAR = 60 * 60 * 24 * 365;
	// ���� km/sec
	private static int LIGHT_SPEED_KM = 30_0000;

	/**
	 * ���α׷� ������
	 * @param args
	 */
	public static void main(String[] args) {
		long �����ϳⰡ�°Ÿ� = (long) LIGHT_SPEED_KM * SECOND_PER_YEAR;
		System.out.println("���� �ϳ� ���� �Ÿ� = " + �����ϳⰡ�°Ÿ�);
	}
}
