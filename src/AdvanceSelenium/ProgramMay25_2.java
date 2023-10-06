package AdvanceSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramMay25_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "Chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/indices?src=moneyhome_bseIndices_more");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='showMoreLess']")).click();
		
		List<WebElement> rowBse = driver.findElements(By.xpath("//table[@id='dataTable']//tr"));
//		List<WebElement> cellBse = driver.findElements(By.xpath("//table[@id='dataTable']//tr//th"));
	
	    for(int i=0; i<rowBse.size(); i++)
	    {
	    	System.out.println(rowBse.get(i).getText());
	    }
	    
	    driver.close();
	    
	
	
	
	
	
	
	
	
	}

}
