package p674_ColApi;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class JUTSortByCustomComp {

	@Test
	public void test() {
		Set<Party> setA = new TreeSet<>(new BirthDataComparator());
		setA.add(new Party("ȫ�浿", new Date()));
		setA.add(new Party("������", new Date(2010, 1, 1)));
		setA.add(new Party("�����", new Date(2010, 1, 2)));
		
		for (Party p : setA) {
			System.out.println(p);
		}
	}

}
