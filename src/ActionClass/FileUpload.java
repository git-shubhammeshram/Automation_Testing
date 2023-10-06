package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "Chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		WebElement uploadBtn = driver.findElement(By.xpath("//input[@type='file']"));
		WebElement pressBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		
		
		uploadBtn.sendKeys("C:\\Users\\HP\\OneDrive\\Desktop\\Softwere Testing\\Manual Testing");
		Thread.sleep(5000);
		pressBtn.click();
	}

}
