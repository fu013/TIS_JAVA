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
		
		setA.add(new Party("ȫ�浿", new Date()));
		setA.add(new Party("������", new Date(2010, 1, 1)));
		setA.add(new Party("�����", new Date(2010, 1, 2)));
		
		setB.add(new Party("�����", new Date(2009, 1, 1)));
		setB.add(new Party("ȣ����", new Date(1500, 1, 1)));
		
		//������
		setC.addAll(setA);
		setC.addAll(setB);
		assertTrue(setC.size() == 5);

	}

}
