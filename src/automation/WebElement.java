package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F://chromedriver-win64//chromedriver-win64//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/text-box");
	driver.manage().window().maximize();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[2]")).click();
//	driver.findElement(By.xpath("//*[@id=\"item-0\"]/span")).click();
	driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Nilesh Barskar");
	driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("Nileshbarskar@gmail.com");
	driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("At/Post:Umbargaon Tal:Pandharpur Dist:Solapur");
    driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("same");
     org.openqa.selenium.WebElement button = driver.findElement(By.xpath("//div//button[@id='submit']"));
     boolean ss = button.isEnabled();
    System.out.println(ss);
}
}
