package AutoSuggestions;

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
		driver.get("https://www.flipkart.com/");
	
		
		WebElement crossBtn = driver.findElement(By.xpath("//button[text()='✕']"));
	    crossBtn.click();
	    WebElement serachBox = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
	    serachBox.sendKeys("iphon");
	    Thread.sleep(2000);
	    
	   List<WebElement> serachResult = driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1']//li"));
	   System.out.println(serachResult.size());
	   
	   for(int i=0; i<serachResult.size(); i++)
	   {
		   System.out.println(serachResult.get(i).getText());
	   }
	   
	   for(int i=0; i<serachResult.size(); i++)
	   {
		   String x = "iphone 13";
		   String z = serachResult.get(i).getText();
		   
		   if(x.equals(z))
		   {
			   serachResult.get(i).click();
			   break;
		   }
		   
	   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
