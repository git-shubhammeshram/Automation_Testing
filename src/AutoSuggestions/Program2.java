package AutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "Chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		WebElement searchBox = driver.findElement(By.xpath("//input[@type='text']"));
		searchBox.sendKeys("Jav");
		Thread.sleep(3000);
		
		List<WebElement> googleLinks = driver.findElements(By.xpath("//a"));
		System.out.println(googleLinks.size());
		
		List<WebElement> SuggList = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		
		for(int i=0;i<SuggList.size();i++)
		{
			System.out.println(SuggList.get(i).getText());
			
		}
		for(int i=0;i<SuggList.size();i++)
		{
			
			String x = "javascript";
			String z = SuggList.get(i).getText();
			
			
			if(x.equals(z))
			{
				SuggList.get(i).click();
				break;
			}
			System.out.println(driver.getTitle());
			
			
			
			
		}
		
		
		
	}

}
