package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeyWordsUse {
//	It will execute by alphabetically order
	@Test(priority = 4)
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
		Reporter.log("Sachin testng test AD",true);

	}

	@Test(priority = -5,timeOut = 1)
	public void AE() throws Exception {
		System.out.println("AE");
		Thread.sleep(3000);

	}

	@Test(priority = -220, invocationCount = 100)
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
