package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {
	static WebDriver driver;
	@Test
public void firstTest() 
{
	System.setProperty("webdriver.chrome.driver", "F://chromedriver-win64//chromedriver-win64//chromedriver.exe");
    driver = new ChromeDriver();
//	driver.findElement(By.xpath(""));
	driver.manage().window().maximize();// maximize the window of the browser

	driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	}

@Test
public void seconTest() {
	driver.get("https://google.com/");
//	driver.navigate().back();
	driver.findElement(By.className("addsa")).click();
}



}
