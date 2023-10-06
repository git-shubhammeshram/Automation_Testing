package BasicProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    //Following are the methods are :-

public class ProgramApr20_1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "Chromedriver");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(4000);
//		3) Maximize method
//		It is used to maximize the browser
		
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		Thread.sleep(3000);
		driver.get("https://facebook.com");
		Thread.sleep(3000);
		driver.get("https://google.com");
		Thread.sleep(3000);
		
//		5) Navigate method
//		It is used to enter URL as well as we can perform move forward, back and
//		refresh functionality
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();
		
//		4) Quit method
//		It use to close all tabs
		
		driver.quit();
	}

}
