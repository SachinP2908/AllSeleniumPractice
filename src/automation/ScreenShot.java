package automation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "F://chromedriver-win64//chromedriver-win64//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
  
		driver.get("https://www.google.com/");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@jsname='ZUkOIc']")).click();
		driver.switchTo().parentFrame();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("sachinss");
//		driver.findElement(By.xpath("//*[@class='G43f7e']//span[contains(text(),'Sachin Pilot')]")).click();
	
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C://Users//sachin//Desktop//screnshot//fb.png");
		FileHandler.copy(source, destination);

}}
