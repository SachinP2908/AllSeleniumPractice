package waits;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicitWait {
	public static void main(String[] args) throws IOException {
		// Set the path to the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver", "F://chromedriver-win64//chromedriver-win64//chromedriver.exe");
		// Initialize Chrome WebDriver
		WebDriver driver = new ChromeDriver();

	
	driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
     driver.findElement(By.xpath("//*[@class='btn btn-success']")).click();
	
	
	
	
	}
}