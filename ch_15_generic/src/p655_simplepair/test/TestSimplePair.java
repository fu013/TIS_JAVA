package p655_simplepair.test;

import static org.junit.Assert.*;

import org.junit.Test;

import p655_simplepair.SimplePair;

public class TestSimplePair {

	@Test
	public void test() {
		SimplePair<String> firstSp = new SimplePair<>("배준수", "바보");
		SimplePair<String> secondsp = new SimplePair<>("배준수", "바보");
		SimplePair<SimplePair<String>> spOfSp = new SimplePair<>(firstSp, secondsp);
		assertTrue(spOfSp.getFirst() == firstSp);
		assertTrue(spOfSp.getFirst().equals(secondsp));
	}

}
