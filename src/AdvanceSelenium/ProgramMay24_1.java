package AdvanceSelenium;

//How to finds multiple elements and click specify elements

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramMay24_1 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "Chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		List<WebElement> linksPage = driver.findElements(By.xpath("//a"));
		
		System.out.println("Size of links is = "+ linksPage.size() );
		
		for(int i=0; i<linksPage.size(); i++)
		{
			System.out.println(linksPage.get(i).getText());
		}
		//linksPage.get(0).click();

		for(int i=0; i<linksPage.size(); i++)
		{
			String Exp = "Gmail";
			String Act = linksPage.get(i).getText();
			
			if(Act.equals(Exp))
			{
				linksPage.get(i).click();
				break;
			}
		}
		System.out.println("Url is = "+ driver.getTitle());
		
		
		
		
		
		
		driver.close();
	
		
		
		
		
	}

}
