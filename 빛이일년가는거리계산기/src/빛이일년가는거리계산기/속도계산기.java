package 빛이일년가는거리계산기;

/**
 * 빛이 일년 동안 가는 거리를 계산합니다.
 * @author uer-004
 *
 */
public class 속도계산기 {
	//일년은 몇 초 인가요?
	private static final int SECOND_PER_YEAR = 60 * 60 * 24 * 365;
	// 단위 km/sec
	private static int LIGHT_SPEED_KM = 30_0000;

	/**
	 * 프로그램 시작점
	 * @param args
	 */
	public static void main(String[] args) {
		long 빛이일년가는거리 = (long) LIGHT_SPEED_KM * SECOND_PER_YEAR;
		System.out.println("빛이 일년 가는 거리 = " + 빛이일년가는거리);
	}
}
