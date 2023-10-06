package MultipleElements;import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "Chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.computerhope.com/issues/ch000604.htm");
		
		List<WebElement> CHopeLinks = driver.findElements(By.xpath("//a"));
		
		System.out.println(CHopeLinks.size());
		
		for(int i=0;i<CHopeLinks.size();i++)
		{
			System.out.println(CHopeLinks.get(i).getText());
		}
		
		for(int i=0;i<CHopeLinks.size();i++)
		{
			String excepted = "Help";
			String actualValue = CHopeLinks.get(i).getText();
			
			if(excepted.equals(actualValue))
			{
				CHopeLinks.get(i).click();
				break;
			}
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			driver.close();
		}
		
	}

}
