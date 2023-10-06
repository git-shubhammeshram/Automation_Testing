package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramMay20_3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebdDriver.chrome.driver", "ChromeDriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		
		WebElement alertWithOkAndCancleTab = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		Thread.sleep(3000);
		alertWithOkAndCancleTab.click();
		Thread.sleep(3000);
		
		WebElement clickButton = driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']"));
		clickButton.click();
		Thread.sleep(3000);
	
		Alert popUpTab = driver.switchTo().alert();
		String popUpTabText = popUpTab.getText();
		System.out.println(popUpTabText);
		Thread.sleep(3000);
		
		popUpTab.accept();
		popUpTab.dismiss();
		Thread.sleep(3000);
		
		driver.close();
	    
	
	
	
	
	
	
	
	
	
	
	
	}

}
