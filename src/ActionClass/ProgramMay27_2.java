package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ProgramMay27_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","Chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement ele5000 = driver.findElement(By.xpath("//li[@class='block13 ui-draggable']//a[@class='button button-orange']"));
		WebElement bankKey = driver.findElement(By.xpath("//li[@class='block14 ui-draggable']//a[@class='button button-orange']"));
		WebElement salesKey = driver.findElement(By.xpath("//li[@class='block15 ui-draggable']//a[@class='button button-orange']"));
		WebElement acctDebitSide = driver.findElement(By.xpath("//ol[@id='bank']"));
		WebElement amtDebitSide = driver.findElement(By.xpath("//ol[@id='amt7']"));
		WebElement accCreditSide = driver.findElement(By.xpath("//ol[@id='loan']"));
		WebElement amtCreditSide = driver.findElement(By.xpath("//ol[@id='amt8']"));
		
		Actions act = new Actions(driver);
		act.clickAndHold(ele5000).moveToElement(amtDebitSide).release().build().perform();
		Thread.sleep(3000);
		act.dragAndDrop(bankKey,acctDebitSide).build().perform();
		Thread.sleep(3000);
		act.dragAndDrop(ele5000, amtCreditSide).build().perform();
		Thread.sleep(3000);
		act.dragAndDrop(salesKey, accCreditSide).build().perform();
		
		WebElement perfectButton = driver.findElement(By.xpath("//div[@class='table4_result']//a[@class='button button-green']"));
		String expResult = "Perfect!";
		String actResult = perfectButton.getText();
		if(expResult.equals(actResult))
		{
			System.out.println("Test Case Is Pass");
		}
		else
		{
			System.out.println("Test Case is Fail");
		}
		
		Thread.sleep(3000);
		driver.close();
	}

}
