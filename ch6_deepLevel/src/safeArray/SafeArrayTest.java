package safeArray;

public class SafeArrayTest {

	public static void main(String[] args) {
		final int SIZE = 5;
		SafeArray safeArray  = new SafeArray(SIZE);
		
		for (int i = 0; i < (safeArray.length + 1); i++) {
			safeArray.put(i, i * 10);
		}
	}

}
