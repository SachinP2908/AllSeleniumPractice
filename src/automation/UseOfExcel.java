 package automation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.ExcelReader;

public class UseOfExcel {
	public static void main(String[] args) throws IOException {
		// Set the path to the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver", "F://chromedriver-win64//chromedriver-win64//chromedriver.exe");
		// Initialize Chrome WebDriver
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		
		ExcelReader er=new ExcelReader();
		String typeText = er.readData(2, 0);
		driver.findElement(By.xpath("//*[@jsname='yZiJbe']")).sendKeys(typeText);
		

	}
}
