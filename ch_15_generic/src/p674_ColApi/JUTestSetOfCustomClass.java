package p674_ColApi;

import static org.junit.Assert.assertTrue;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class JUTestSetOfCustomClass {

	@Test
	public void test() {
		Set<Party> setA = new TreeSet<>();
		Set<Party> setB = new TreeSet<>();
		Set<Party> setC = new TreeSet<>();
		
		setA.add(new Party("홍길동", new Date()));
		setA.add(new Party("강아지", new Date(2010, 1, 1)));
		setA.add(new Party("고양이", new Date(2010, 1, 2)));
		
		setB.add(new Party("고양이", new Date(2009, 1, 1)));
		setB.add(new Party("호랑이", new Date(1500, 1, 1)));
		
		//합집합
		setC.addAll(setA);
		setC.addAll(setB);
		assertTrue(setC.size() == 5);

	}

}
