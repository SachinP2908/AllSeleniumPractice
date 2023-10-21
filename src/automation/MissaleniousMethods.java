package automation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MissaleniousMethods 
{
	public static void main(String[] args) throws IOException {
		// Set the path to the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver", "F://chromedriver-win64//chromedriver-win64//chromedriver.exe");
		// Initialize Chrome WebDriver
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
// getattribute(String value): This method returns a string which is nothing but a String value present inside a Text field.
		WebElement name = driver.findElement(By.xpath("//*[@jsname='yZiJbe']"));
				name.sendKeys("Sachin");
				String Text = name.getAttribute("value");
				System.out.println(Text);//Sachin
//getCurrentURL(): This method returns the current page url as a String value.				
				
				String url = driver.getCurrentUrl();
				System.out.println(url);//https://www.google.com/
//getTitle(): This method returns the title of the webpage as a String value.
				String titleOfPage = driver.getTitle();
				System.out.println(titleOfPage); //Google
	}

}
