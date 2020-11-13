package p674_ColApi;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class JUTestSet {

	@Test
	public void test() {
		Set<Integer> setA = new TreeSet<>();
		Set<Integer> setB = new TreeSet<>();
		Set<Integer> setC = new TreeSet<>();
		
		setA.add(1);setA.add(2);setA.add(3);
		setB.add(3);setB.add(4);
		
		//합집합
		setC.addAll(setA);
		setC.addAll(setB);
		assertTrue(setC.size() == 4);

		//부분집합 검사
		assertFalse(setA.containsAll(setB));
		assertTrue(setC.containsAll(setB));

		//차집합
		setC.removeAll(setA);
		assertTrue(setC.size() == 1);

		//교집합만들기
		setA.retainAll(setB);
		assertTrue(setA.size() == 1);

	}

}
