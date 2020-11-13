package p412Beep;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class MyClass {
	public static void main(String[] args) {
		List<Integer> I = new ArrayList<>();
		IntStream.range(0, 100).peek(i->I.add(i));
		
		System.out.println(I.stream().count());
		I.stream().forEach{e->(System.out.print((e));)};
	}
}
