package automation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Orangehrm {

	public static void main(String[] args) throws IOException, Exception {
		System.setProperty("webdriver.chrome.driver", "F://chromedriver-win64//chromedriver-win64//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		Actions act=new Actions(driver);
		act.sendKeys(driver.findElement(By.xpath("//*[@name='password']")), "admin123").perform();
//		JavascriptExecutor js=JavascriptExecutor(driver);
		act.click(driver.findElement(By.xpath("//*[@type='submit']"))).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='oxd-main-menu-item-wrapper'])[2]")).click();
	}
}
