package p674_ColApi;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class JUTestList {

	@Test
	public void test() {
		//List<int> listInt = new ArrayList<>();
		List<Integer> listA = new ArrayList<>();
		List<Integer> listB = new ArrayList<>();
		List<Integer> listC = new ArrayList<>();
		
		listA.add(1);listA.add(2);listA.add(3);
		listB.add(3);listB.add(4);
		
		//합집합
		listC.addAll(listA);
		listC.addAll(listB);
		assertTrue(listC.size() == 5);
		
		//부분집합 검사
		assertFalse(listA.containsAll(listB));
		assertTrue(listC.containsAll(listB));

		//차집합
		listC.removeAll(listA);
		assertTrue(listC.size() == 1);
		
		//교집합만들기
		listA.retainAll(listB);
		assertTrue(listA.size() == 1);
	}

}
