package AdvanceSelenium;
//How We handle Tables In Selenium

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramMay25_1 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "Chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/index.html");
		
		List<WebElement> rowBse = driver.findElements(By.xpath("//div[@class='hmbseindicestable show']//ul"));
		List<WebElement> cellBse = driver.findElements(By.xpath("//div[@class='hmbseindicestable show']//ul//li"));
		
		System.out.println("Size of row = " + rowBse.size() );
		System.out.println("Size of cell = " + cellBse.size() );
		
		for(int i=0; i<rowBse.size(); i++)
		{
			System.out.println(rowBse.get(i).getText());
		}
		
		
		driver.close();
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
