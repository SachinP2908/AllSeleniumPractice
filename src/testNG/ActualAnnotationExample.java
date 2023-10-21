package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActualAnnotationExample {
	@BeforeSuite
	public void openBrowser() {
		System.out.println("Opening the browser");

	}

	@AfterSuite
	public void closeBrowser() {
		System.out.println("closing the browser");

	}

	@BeforeTest
	public void navToUrl() {
		System.out.println("Navigate to URL");

	}

	@AfterTest
	public void navToBackOriginalURL() {
		System.out.println("NAvigate to back");

	}

	@BeforeClass
	public void loginToApp() {
		System.out.println("Login to app");

	}

	@AfterClass
	public void logOutFromApp() {
		System.out.println("LoggOff from Application");

	}

	@BeforeMethod
	public void navToTestCaseLOcation() {
		System.out.println("nav to test case location");

	}

	@AfterClass
	public void navbackToLocation() {
		System.out.println("Navigate back to original loaction");

	}

	@Test
	public void testCase() {
		System.out.println("Testcase 1");
	}

}
