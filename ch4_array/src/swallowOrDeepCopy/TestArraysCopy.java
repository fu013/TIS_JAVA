package swallowOrDeepCopy;

import java.util.Arrays;

public class TestArraysCopy {

	public static void main(String[] args) {
		A[] aa = new A[3];
		for (int j = 0; j < 3; j++) {
			String name = args[0];
			B[] ab = new B[5];
			for (int i = 0; i < 5; i++) {
				ab[i] = new B(i);
			}
			aa[j] = new A(name, ab);
		}
		
		A[] aCopy = Arrays.copyOf(aa, 3);
		aCopy[0].doaaa();
	}

}
