package LocatorsProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramApr26_2 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "Chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		driver.manage().window().maximize();
		//xpath by attribute
		driver.findElement(By.xpath("//input[@name='fullname']")).sendKeys("Shubham Meshram");
		//xpath by contains
		driver.findElement(By.xpath("//input[contains(@name,'em')]")).sendKeys("shbm535@gmail.com");
		//xpath by index
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Amravati");
	    ////xpath by text
		driver.findElement(By.xpath("//a[text()='Investor Information']")).click();
	
	}

}
