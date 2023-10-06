package BasicProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramApr21_1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrorme.driver", "Chromedriver");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		System.out.println(driver.getTitle());
		
		String expectedTitle = "Rediffmail Free Unlimited Storage";
		String actualTitle = driver.getTitle();
		
		if (expectedTitle.equals(actualTitle))
		{
			System.out.println("Rediff test case is pass");
		}
		else
		{
			System.out.println("Rediff test case is fail");
		}
		
		String currentUrl= driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.close();
		
		
	}

  }
