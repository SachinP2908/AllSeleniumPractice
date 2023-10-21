package automation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriver_Manager_Use {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();


	ChromeOptions options=new ChromeOptions();
    options.addArguments("--start-maximized");
    
    WebDriver	driver=new ChromeDriver(options);

//    driver.get("https://jqueryui.com/");
    driver.navigate().to("https://jqueryui.com/");
    driver.navigate().forward();
    driver.navigate().back();
    driver.navigate().refresh();
    driver.getCurrentUrl();
    driver.getTitle();
//    driver.switchTo().frame(null)
//    driver.switchTo().parentFrame();
//    driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
//    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//	WebDriverWait wait = new WebDriverWait(driver,60);
//	wait.until(ExpectedConditions.elementToBeClickable(disablebutton));
//	driver.findElement(By.xpath("//*[@id='enable-button']")).click();
//    wait.
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	By disablebutton = null;
	wait.until(ExpectedConditions.elementToBeClickable(disablebutton));
	

//	FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
//									.withTimeout(Duration.ofSeconds(60))
//									.pollingEvery(Duration.ofMillis(9)); 

	FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
									.withTimeout(Duration.ofSeconds(60))
									.pollingEvery(Duration.ofMillis(9))
									.ignoring(NoSuchElementException.class);
									

	

}
}

