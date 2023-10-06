package AutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Program1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.chrome.driver", "Chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@title='Search']"));
		searchBox.sendKeys("Mave");
		Thread.sleep(2000);
		
		List<WebElement> listSuggEle = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		for(int i=0;i<listSuggEle.size();i++)
		{
			System.out.println(listSuggEle.get(i).getText());
		}
		
		for(int i=0;i<listSuggEle.size();i++)
		{
			String exceptedValue = "maven dependency";
			String actualValue = listSuggEle.get(i).getText();
			
			if(exceptedValue.equals(actualValue))
			{
				listSuggEle.get(i).click();
				break;
			}
//			System.out.println(driver.getTitle());
//			Thread.sleep(2000);
//			driver.close();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
