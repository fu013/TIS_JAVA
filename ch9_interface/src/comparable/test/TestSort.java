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
		setParty.add(new Party("È«±æµ¿", new Date(1600, 1, 1)));
		setParty.add(new Party("±è¿µÈñ", new Date(1950, 1, 1)));
		setParty.add(new Party("´Ü±º", new Date(500, 1, 1)));
		
		for (Party p : setParty) {
			System.out.println(p);
		}
	}

}
