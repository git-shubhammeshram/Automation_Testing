package Waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "Chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement searchBar = driver.findElement(By.xpath("//input[@class='gLFyfgsfi']"));
		searchBar.sendKeys("Selenium");
		// Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//ul[@role='listbox']//li[4]"));
		ele.click();
		
		driver.close(); }
	}




