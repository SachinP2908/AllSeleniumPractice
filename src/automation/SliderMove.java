package automation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderMove {

	public static void main(String[] args) throws IOException, Exception {
		System.setProperty("webdriver.chrome.driver", "F://chromedriver-win64//chromedriver-win64//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		WebElement slider = driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		Actions act=new Actions(driver);
		act.clickAndHold(slider).moveByOffset(400, 0).release().build().perform();
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[text()='Draggable']")).click();

		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		act.dragAndDropBy(driver.findElement(By.xpath("//*[@id='draggable']")), 130, 125).build().perform();
	
	
	}
	
}
