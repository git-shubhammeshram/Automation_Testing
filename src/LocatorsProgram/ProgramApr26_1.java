package LocatorsProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramApr26_1 {

	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver", "Chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='fullname']")).sendKeys("Shubham");
		
		String x = driver.findElement(By.xpath("//div[text()='Location']")).getText();
		System.out.println(x);
		
		driver.findElement(By.xpath("//a[text()='Investor Information']")).click();
	}

}
