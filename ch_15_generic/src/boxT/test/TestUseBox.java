package boxT.test;

import static org.junit.Assert.*;

import org.junit.Test;

import boxT.Box;

public class TestUseBox {

	@Test
	public void test() {
		Box<String> box = new Box<>();
		String hi = "Hello";
		box.setThing(hi);
		//assert : �ܾ�, ����
		assertTrue(box.getThing() == hi);
		
		Box<Integer> ibox = new Box<Integer>();
		ibox.setThing(68787);
		assertTrue(ibox.getThing() == 68787);
		
	}

}
