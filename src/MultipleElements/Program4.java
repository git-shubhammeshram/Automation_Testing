package MultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program4 {

	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver", "Chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		List<WebElement> pageLinks = driver.findElements(By.xpath("//a"));
		
		for(int i=0;i<pageLinks.size();i++)
		{
			System.out.println(pageLinks.get(i).getText());
		}
		
		for(int i=0; i<pageLinks.size();i++)
		{
			String exp = "Images";
			String act = pageLinks.get(i).getText();
			
			if(exp.equalsIgnoreCase(act))
			{
				pageLinks.get(i).click();
				break;
			}
		}
		System.out.println("Title is = " +driver.getTitle());
		driver.close();
		
	}

}
