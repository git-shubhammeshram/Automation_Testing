package FramePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_May_5_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.dirver", "Chromedriver");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		driver.switchTo().frame("iframeResult");

		WebElement calenderFrameClick = driver.findElement(By.xpath("//button[@type='button']"));
		
		
		calenderFrameClick.click();
		Thread.sleep(2000);
		
	    driver.switchTo().defaultContent();
	    
	    WebElement homeIonClick = driver.findElement(By.xpath("//a[@id='tryhome']"));
		homeIonClick.click();
		
		driver.close();
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
