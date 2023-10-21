package automation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import utility.ScreenShot;

public class BrowserLuanch {
	public static void main(String[] args) throws IOException {
		// Set the path to the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver", "F://chromedriver-win64//chromedriver-win64//chromedriver.exe");
		// Initialize Chrome WebDriver
		WebDriver driver = new ChromeDriver();

//	// Navigate to a website
//	driver.get("https://www.google.com");
//	driver.get("https://www.facebook.com/");
//	
//	 driver.navigate().back();
//	 driver.navigate().forward();
//	 driver.navigate().refresh();

		driver.manage().window().maximize();
//	 driver.manage().window().minimize();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.navigate().to("https://www.google.com");
		System.out.println("Window Id" + driver.getWindowHandle() + "  is this");
		WebElement voice = driver.findElement(By.xpath("//*[@jsname='F7uqIe']"));
		boolean isclickable = voice.isEnabled();
		System.out.println(isclickable);
		WebElement camera = driver.findElement(By.xpath("//*[@class='Gdd5U']"));
		
		System.out.println(camera.isDisplayed());;


		String t = driver.switchTo().frame("callout").getTitle();
		System.out.println(t);
//		System.out.println(t.toUpperCase());;
//		System.out.println(t.length());
		driver.findElement(By.xpath("//*[@jsname='ZUkOIc']")).click();
		
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C://Users//sachin//Desktop//screnshot//ads.png");
		FileHandler.copy(source, destination);
		ScreenShot.captureScreenshot(driver, "Sachin ");
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//*[@jsname='yZiJbe']")).sendKeys("SACHIN");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();

		
		
		
		
		// Perform some actions or operations on the web page

		// Close the browser window
//	driver.quit();
	}
}
