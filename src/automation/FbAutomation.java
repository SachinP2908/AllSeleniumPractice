package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbAutomation {
public static void main(String[] args) throws Exception {

	System.setProperty("webdriver.chrome.driver", "F://chromedriver-win64//chromedriver-win64//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//div[@class='_6ltg']//a[@role='button']")).click();
//	driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='_8ien'")));
//	WebElement day = driver.findElement(By.xpath("//*[@id=\"day\"]"));
//	Select sel=new Select(day);
//	sel.selectByValue("12");
	
	driver.findElement(By.xpath("(//*[starts-with(@id,'u_')])[9]")).sendKeys("sacahin");
	
	
}
}
	