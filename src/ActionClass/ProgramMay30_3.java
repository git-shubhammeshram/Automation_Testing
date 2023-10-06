package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ProgramMay30_3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "Chromdriver");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();

		
		WebElement loginKey = driver.findElement(By.xpath("//a[text()='Login']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(loginKey).build().perform();

		WebElement giftKey = driver.findElement(By.xpath("//div[text()='Gift Cards']"));
		giftKey.click();
		
		
		Thread.sleep(2000);
		driver.close();
		
	}
	
}