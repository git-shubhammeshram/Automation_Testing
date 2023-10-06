package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ProgramMay30_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "Chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.americangolf.com/");
		
		WebElement aboutLink = driver.findElement(By.xpath("//a[text()='About Us']"));
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.moveToElement(aboutLink).build().perform();
		
		WebElement blogKey = driver.findElement(By.xpath("//a[text()='Blog']"));
		blogKey.click();
		Thread.sleep(2000);

		driver.close();
		
		
		
	}

}
