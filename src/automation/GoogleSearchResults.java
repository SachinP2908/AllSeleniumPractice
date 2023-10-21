package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchResults {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://chromedriver-win64//chromedriver-win64//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
  
		driver.get("https://www.google.com/");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@jsname='ZUkOIc']")).click();
		driver.switchTo().parentFrame();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("sachin");
//		driver.findElement(By.xpath("//*[@class='G43f7e']//span[contains(text(),'Sachin Pilot')]")).click();
		
	
	
	
	}
}
