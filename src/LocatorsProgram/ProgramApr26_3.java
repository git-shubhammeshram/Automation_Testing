package LocatorsProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramApr26_3 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "Chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		driver.manage().window().maximize();
		//Locator = tagname
		driver.findElement(By.tagName("input")).sendKeys("Komal");
		//Locator = ID
		driver.findElement(By.id("emailid")).sendKeys("shbm535@gmail.com");
		//Locator = Class name
		driver.findElement(By.className("txtbox1")).sendKeys("Pass@123");
		//Locator = linktext
		driver.findElement(By.linkText("CompleteLinkText"));
		//Locator = partiallinktext
		driver.findElement(By.partialLinkText("Complete"));
	}

}
