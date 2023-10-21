package testNG;

import org.testng.annotations.Test;

public class ParallelExecutionOfTestCase {
	@Test
	public void testCase1() {
		System.out.println("test case 1");
	}

	@Test
	public void testCase2() {
		System.out.println("test case 2");
	}

	@Test
	public void testCase3() {
		System.out.println("test case 3");
	}

	@Test
	public void testCase4() {
		System.out.println("test case 4");
	}
}
