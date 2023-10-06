package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramMay31_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ishare.rediff.com/");
		driver.manage().window().maximize();
		
		
		WebElement downEnd = driver.findElement(By.xpath("//img[@alt='rediff on the net']"));
		
		JavascriptExecutor x = ((JavascriptExecutor)driver);
		x.executeScript("arguments[0].scrollIntoView();",downEnd);
		
		Thread.sleep(2000);
		downEnd.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.close();


		
	}

}
