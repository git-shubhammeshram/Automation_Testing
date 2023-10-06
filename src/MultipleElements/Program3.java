package MultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.chrome.driver", "Chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		
		List<WebElement> googleLinks = driver.findElements(By.xpath("//a"));
		System.out.println("links available in page = "+ googleLinks);
		
		for(int i=0;i<googleLinks.size();i++)
		{
			System.out.println(googleLinks.get(i).getText());
		}
		
		for(int i=0;i<googleLinks.size();i++)
		{
			String exceptedValue = "Images";
			String actualValue = googleLinks.get(i).getText();
			
			if(exceptedValue.equals(actualValue))
			{

				Thread.sleep(2000);
				googleLinks.get(i).click();
				break;
			}
			System.out.println(driver.getTitle());
//			driver.close();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
