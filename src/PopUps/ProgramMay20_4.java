package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramMay20_4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "ChromeDriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/Alerts.html");
		Thread.sleep(3000);
		WebElement alertWithTextBox = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		alertWithTextBox.click();
		Thread.sleep(3000);
		WebElement clickButton = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		clickButton.click();
		Thread.sleep(3000);
		
		
		Alert popUpTab = driver.switchTo().alert();
		String popUpTabText = popUpTab.getText();
		System.out.println(popUpTabText);
		Thread.sleep(3000);

		popUpTab.sendKeys("Hey There Whatsup!!!!");
		Thread.sleep(3000);
		popUpTab.accept();
		Thread.sleep(8000);


		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
