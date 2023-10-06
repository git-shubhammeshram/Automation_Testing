package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ProgramMay30_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "Chromdriver");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement primeKey = driver.findElement(By.xpath("//span[text()='Prime']"));
		Actions act = new Actions(driver);
		act.moveToElement(primeKey).build().perform();
		Thread.sleep(2000);
		WebElement primeWindow = driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
		primeWindow.click();
		driver.close();
		
//		driver.get("https://www.amazon.in/");
//		WebElement	primeLink = driver.findElement(By.xpath("//span[text()='Prime']"));
//		Actions	b	=	new	Actions(driver);
//		b.moveToElement(primeLink).build().perform();
//		Thread.sleep(2000);
//		WebElement	joinPrimeLink = driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
//		joinPrimeLink.click();
		
	}

}
