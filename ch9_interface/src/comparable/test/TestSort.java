package comparable.test;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

import comparable.Party;

public class TestSort {

	@Test
	public void test() {
		Set<Party> setParty = new TreeSet<>();
		setParty.add(new Party("ȫ�浿", new Date(1600, 1, 1)));
		setParty.add(new Party("�迵��", new Date(1950, 1, 1)));
		setParty.add(new Party("�ܱ�", new Date(500, 1, 1)));
		
		for (Party p : setParty) {
			System.out.println(p);
		}
	}

}
