package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramMay20_2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.driver", "Chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement alertWithOkButton = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		alertWithOkButton.click();
		Thread.sleep(3000);
		
		Alert popClick = driver.switchTo().alert();
		String popText = popClick.getText();
		System.out.println(popText);
		popClick.accept();
		
		Thread.sleep(3000);
		driver.close();
	
	
	
	
	
	
	
	
	}

}
