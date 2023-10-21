package automation;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.ScreenShot;

public class UseOfSSMethodFromUtility {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "F://chromedriver-win64//chromedriver-win64//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://www.facebook.com/");
	ScreenShot.captureScreenshot(driver, "Name");
}
}
