package LocatorsProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ProgramApr26_6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "Chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		driver.manage().window().maximize();
		WebElement dayDropBox = driver.findElement(By.xpath("//select[@name='date_day']"));
		Select s = new Select (dayDropBox);
		s.selectByIndex(10);
		Thread.sleep(3000);
		s.selectByValue("15");
		Thread.sleep(3000);
		s.selectByVisibleText("15");
		
		driver.close();
	
	}

}
