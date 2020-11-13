package frameworkTest;

import static org.junit.Assert.*;

import org.junit.Test;

import www.dream.com.framework.array.ArrayStatic;

public class TestFramework {

	@Test
	public void test() {
		String[] as = {"C++", "C#", "Java"};
		String result = ArrayStatic.toString(as);
		System.out.println(result);
		
		System.out.println(ArrayStatic.getMax(as));
	}

}
