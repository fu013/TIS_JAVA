package whileStudy;

public class LoopEx1 {

	public static void main(String[] args) {
		//0 ���� 9���� ���ٷ� ���
		boolean isFirst = true;
		int i = 0;
		while (i < 10) {
			if (isFirst) {
				isFirst = false;
				System.out.print(i);
			} else {
				System.out.print("," + i);
			}
			i++;
		}
	}

}
