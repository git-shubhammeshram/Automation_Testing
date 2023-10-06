package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramMay20_1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver", "ChromeDriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		WebElement searchbutton = driver.findElement(By.xpath("//input[@type='submit']"));
		searchbutton.click();
		Thread.sleep(3000);
		
		Alert searchbuttonPopUp = driver.switchTo().alert();
		String searchbuttonPopUpText = searchbuttonPopUp.getText();
		System.out.println("PopUp Text is = "+searchbuttonPopUpText);
		
		
		searchbuttonPopUp.accept();
		Thread.sleep(3000);
		
		driver.close();
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
