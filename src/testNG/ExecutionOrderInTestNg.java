package testNG;

import org.testng.annotations.Test;

public class ExecutionOrderInTestNg {
//	It will execute by alphabetically order
	@Test
	public void AB() {
		System.out.println("AB");
	}

	@Test
	public void AC() {
		System.out.println("AC");

	}

	@Test
	public void AD() {
		System.out.println("AD");

	}

	@Test
	public void AE() {
		System.out.println("AE");

	}

	@Test
	public void ZA() {
		System.out.println("ZA");

	}

	@Test
	public void AQ() {
		System.out.println("AQ");

	}
//	AB
//	AC
//	AD
//	AE
//	AQ
//	ZA
}
