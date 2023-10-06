package Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait");
		/*WebElement btn1 =
		driver.findElement(By.xpath("//button[@id='alert']"));
		btn1.click();
		// Thread.sleep(5000);
		WebDriverWait w = new WebDriverWait(driver, 150);
		w.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept(); */
		/*WebElement btn2 =
		driver.findElement(By.xpath("//button[@id='populate-text']"));
		btn2.click();
		WebElement changedLabel =
		driver.findElement(By.xpath("//h2[@id='h2']"));
		WebDriverWait w1 = new WebDriverWait(driver, 150);
		w1.until(ExpectedConditions.textToBePresentInElement(changedLabel,
		"Selenium Webdriver"));*/
		WebElement btn3 = driver.findElement(By.xpath("//button[@id='display-other-button']"));
		btn3.click();
		WebElement hiddenBtn = driver.findElement(By.xpath("//button[@id='hidden']"));
		@SuppressWarnings("deprecation")
		WebDriverWait w2 = new WebDriverWait(driver, 150);
		w2.until(ExpectedConditions.visibilityOfAllElements(hiddenBtn));
		driver.close();
		}
	}


