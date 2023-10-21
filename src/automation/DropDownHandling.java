package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {
public static void main(String[] args) throws Exception {

	System.setProperty("webdriver.chrome.driver", "F://chromedriver-win64//chromedriver-win64//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	driver.manage().window().maximize();
//	driver.findElement(By.xpath("//div[@class='_6ltg']//a[@role='button']")).click();
//	WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
//	Select sel=new Select(day);
//	sel.selectByVisibleText("21");
	Thread.sleep(2000);
	WebElement product = driver.findElement(By.xpath("(//*[@id='first'])[2]"));
	Select sec=new Select(product);
//	sec.selectByIndex(2);
	sec.selectByVisibleText("Iphone");
	
}
}
