package MultiSelectBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "Chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");
		
		WebElement userNumBox = driver.findElement(By.xpath("//input[@id='user-number']"));
		userNumBox.sendKeys("7719840376");
		WebElement userEmailBox = driver.findElement(By.xpath("//input[@id='email_id']"));
		userEmailBox.sendKeys("shbm535@gmail.com");
		WebElement clickBtn = driver.findElement(By.xpath("//button[@id='irtct-acc-detail']"));
		clickBtn.click();
		
		WebElement petBox = driver.findElement(By.xpath("(//button[@class='btn dropdown-toggle'])[3]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(petBox).click().build().perform();
		for(int i=0;i<5;i++)
		{
			Thread.sleep(2000);
			act.sendKeys(Keys.DOWN).build().perform();
		}
		act.sendKeys(Keys.ENTER).build().perform();
		driver.close();

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
