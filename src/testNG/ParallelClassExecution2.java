package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelClassExecution2 {
	WebDriver driver;

	@Test
	public void testCase3() {
		driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
	}

	@Test
	public void testCase4() {
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
	}
}
