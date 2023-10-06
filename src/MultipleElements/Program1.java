package MultipleElements;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Program1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "Chromedriver");
		
		ChromeOptions x = new ChromeOptions();
		x.addArguments("--disable-notifications");
//		x.addArguments("headless");
		
		
		WebDriver driver = new ChromeDriver(x);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		List<WebElement> googleLinks = driver.findElements(By.xpath("//a"));
		
		System.out.println(googleLinks.size());
		
		for(int i=0; i<googleLinks.size();i++)
		{
			System.out.println(googleLinks.get(i).getText());
		}
		
		for(int i=0;i<googleLinks.size();i++)
		{
			String excepted = "Images";
			String actual = googleLinks.get(i).getText();
			if(excepted.equals(actual))
			{
				googleLinks.get(i).click();
				break;
			}
		}
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		
	}

}
