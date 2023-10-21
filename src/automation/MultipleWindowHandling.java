package automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleWindowHandling {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F://chromedriver-win64//chromedriver-win64//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
//		
//		String ParentWinId = driver.getWindowHandle();
//		System.out.println(ParentWinId);
//		Thread.sleep(2000);
//		WebElement newWindow = driver.findElement(By.xpath("//*[@id='newWindowBtn']"));
		Actions act=new Actions(driver);
//		act.click(newWindow).perform();
//		newWindow.click();
//		String newWinId = driver.getWindowHandle();
//		System.out.println(newWinId);
//		driver.navigate().back();
//		WebElement newTab = driver.findElement(By.xpath("//*[@id='newTabBtn']"));
//		act.click(newTab);
//		String newTabId = driver.getWindowHandle();
//		System.out.println(newTabId);
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
		WebElement newWindowsBtn = driver.findElement(By.xpath("//*[@id='newWindowsBtn']"));
		act.click(newWindowsBtn);
//		
//		Set<String> newWindowsId = driver.getWindowHandles();
//		int numberOfIds = newWindowsId.size();
//		String []winids=new String[numberOfIds];
//		int i=0;
//		for(String id :newWindowsId) 
//		{
//		    winids[i]=id;
//		    i++;
//		}
//		for(String arrayElement:winids) 
//		{
//			System.out.println(arrayElement);
//		}
//		
		
		
	}

}
