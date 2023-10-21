package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelClassExecution1 {
	WebDriver driver;

	@Test
	public void testCase1() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}

	@Test
	public void testCase2() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}

}
