package automation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassUse {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "F://chromedriver-win64//chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//		driver.get("https://www.facebook.com/");
//		  WebElement dd = driver.findElement(By.name("email"));

		//			 Key Board related actions

		//		Actions act=new Actions(driver);
//	   act.sendKeys(dd, "sachin").perform();
//	act.sendKeys(Keys.TAB).sendKeys("sadda").build().perform();
    
		//	      Mouse Action
	driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
//	Hower
	WebElement howerpoint = driver.findElement(By.id("sub-menu"));
	Actions act =new Actions(driver);
	act.moveToElement(howerpoint).perform();
	driver.findElement(By.id("link3")).click();
     driver.navigate().back();
     WebElement doubleclick = driver.findElement(By.id("double-click"));
     act.doubleClick(doubleclick).perform();
     driver.switchTo().alert().accept();
     driver.findElement(By.name("confirmation")).click();
     driver.switchTo().alert().dismiss();
	
	}
}
