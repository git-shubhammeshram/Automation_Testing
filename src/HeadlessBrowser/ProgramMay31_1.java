package HeadlessBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class ProgramMay31_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "Chromedriver");
		ChromeOptions a = new ChromeOptions();
		a.addArguments("headless");
		
		
		WebDriver driver = new ChromeDriver(a);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement searchBar = driver.findElement(By.xpath("//input[@name='q']"));
		searchBar.sendKeys("nare");
		Thread.sleep(1000);
		List<WebElement> autoSugestion = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		
		for(int i=0;i<autoSugestion.size();i++)
		{
		      System.out.println(autoSugestion.get(i).getText());
		}
		
		for(int i=0;i<autoSugestion.size();i++)
		{
		            String exp = "Narendra Modi\n"
		                       + "Prime Minister of India";
		            String act = autoSugestion.get(i).getText();
		
		if(exp.equals(act))
		{
		      Thread.sleep(2000);
		      JavascriptExecutor jse = (JavascriptExecutor)driver;
		      jse.executeScript("arguments[0].click()",
		      autoSugestion.get(i));
		      break;
		}
	}

	}
}
