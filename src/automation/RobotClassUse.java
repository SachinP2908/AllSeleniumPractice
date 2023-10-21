package automation;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClassUse {

	public static void main(String[] args) throws IOException, Exception {
		System.setProperty("webdriver.chrome.driver", "F://chromedriver-win64//chromedriver-win64//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
//		Thread.sleep(2000);
		WebElement rightkey = driver.findElement(By.name("email"));
		Actions act=new Actions(driver);
		act.contextClick(rightkey).perform();
		
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_UP);
//		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyPress(KeyEvent.VK_ENTER);
		
		
		
	}
}
