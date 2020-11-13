package forEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEach1 {

	public static void main(String[] args) {
		int[] aaa = {1, 2, 3};
		int[] coped = Arrays.copyOf(aaa, 2);
		for (int va : coped) {
			System.out.println(va);
		}
	}

}
