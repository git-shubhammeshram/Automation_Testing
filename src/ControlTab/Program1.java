package ControlTab;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.chrome.driver", "Chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		WebElement firstTab = driver.findElement(By.xpath("//body"));
		firstTab.sendKeys(Keys.CONTROL+"t");
		driver.get("https://www.bing.com");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);

		
		
		WebElement secondTab = driver.findElement(By.xpath("//body"));
		secondTab.sendKeys(Keys.CONTROL+"\t");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
