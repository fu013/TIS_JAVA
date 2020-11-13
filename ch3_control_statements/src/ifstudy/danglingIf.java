package ifstudy;

public class danglingIf {

	public static void main(String[] args) {
		if (true) {
			if (false) {
				System.out.println("¤¡¤¡");
			}
		} else {
			System.out.println("¤·¤·");
		}
	}

}
