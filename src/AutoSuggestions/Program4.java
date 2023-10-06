package AutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "Chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		searchBox.sendKeys("Radh");
		Thread.sleep(4000);
		
		List<WebElement> serResult = driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
		
		for(int i=0;i<serResult.size();i++)
		{
			System.out.println(serResult.get(i).getText());
		}
		
		for(int i=0;i<serResult.size();i++)
		{
			String exp = "Radha Krishn" + "Television series"; 
			String act = serResult.get(i).getText();
			
			if(exp.equalsIgnoreCase(act))
			{
				serResult.get(i).click();
				break;
			}
		}
		System.out.println("Serch result is = "+driver.getTitle());
	}
	
	

}
