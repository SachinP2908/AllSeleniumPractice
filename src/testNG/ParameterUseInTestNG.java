package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterUseInTestNG {

	WebDriver driver;

	@Parameters("browserLaunch")
	@Test
	public void launchBrowser(String value) {
		if (value.contains("chrome")) {

//			System.setProperty("webdriver.chrome.driver",
//					"F://chromedriver-win64//chromedriver-win64//chromedriver.exe");
			driver = new ChromeDriver();
		} else if (value.equals("edge")) {
			System.setProperty("webdriver.chrome.driver",
					"F://chromedriver-win64//chromedriver-win64//chromedriver.exe");
			driver = new EdgeDriver();

		} else {
			System.out.println("Please configure chrome browser");
		}
	}

	@Parameters("urlToBeLaunch")
	@Test
	public void launchURL(String URL) {
//		System.setProperty("webdriver.chrome.driver", "F://chromedriver-win64//chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		if (URL.contains("Facebook")) {
			driver.get(URL);
		} else {
			System.out.println("facebook not  found, I am going on google");
			driver.get("https://www.google.com");
		}
	}
}
