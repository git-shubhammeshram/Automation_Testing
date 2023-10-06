package BasicProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

public class ProgramApr21_2 {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("Webdriver.chrome.driver", "Chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Dimension d = new Dimension(200,250);
		driver.manage().window().setSize(d);;
		Thread.sleep(2000);
		Point p = new Point(10,700);
		driver.manage().window().setPosition(p);
		
		
		driver.close();
		
	
	
	}

}
