package FramePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_May_6_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "Chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		
		WebElement searchBarMainPage = driver.findElement(By.xpath("//input[@id='s']"));
		searchBarMainPage.sendKeys("Harry");
		Thread.sleep(2000);
		
		driver.switchTo().frame("globalSqa");
		
		WebElement frameSearchBarMain = driver.findElement(By.xpath("//input[@id='s']"));
		frameSearchBarMain.sendKeys("Peter");
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();
//		searchBarMainPage.clear();
		searchBarMainPage.sendKeys("Potter");
		
//      Following code are use to scrolling the up page
		
		WebElement searchScrollMainButton = driver.findElement(By.xpath("//button[@class='button_search']"));
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", searchScrollMainButton);
		
		driver.close();
		driver.quit();
		
		
		
		
		
	}

}
