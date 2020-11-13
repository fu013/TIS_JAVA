package p674_ColApi;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import www.dream.com.framework.array.ArrayStatic;

public class JUTListToArray {

	@Test
	public void test() {
		List<Integer> listA = new ArrayList<>();
		listA.add(1);listA.add(2);listA.add(3);

		Integer[] arrA = new Integer[0];
		arrA = listA.toArray(arrA);
		System.out.println(ArrayStatic.toString(arrA));
	}

}
