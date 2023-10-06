package AdvanceSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramMay24_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "Chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement searchbar = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		searchbar.sendKeys("jav");
		
		Thread.sleep(1000);
		
		List<WebElement> eleSearchBar = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		
		for(int i=0; i<eleSearchBar.size(); i++)
		{
			System.out.println(eleSearchBar.get(i).getText());
		}
		for(int i=0; i<eleSearchBar.size(); i++)
		{
//			String exp = "java";
//			String act = eleSearchBar.get(i).getText();
//			
//			if(exp.equals(act))
//			{
//				eleSearchBar.get(i).click();
//			}
			Thread.sleep(3000);
			String exp = "java compiler";
			String act = eleSearchBar.get(i).getText();
			
			if(exp.equals(act))
			{
				eleSearchBar.get(i).click();
				break;
			}
			
		}
		
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
