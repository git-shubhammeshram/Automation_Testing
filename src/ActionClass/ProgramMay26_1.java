package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ProgramMay26_1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.chrome.driver", "Chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(options);
	    driver.manage().window().maximize();
	    driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");
	    
	    WebElement SecutityQueBox = driver.findElement(By.xpath("//button[normalize-space(text())='Select']"));
	    
	    Actions act = new Actions(driver);
	    act.moveToElement(SecutityQueBox).click().build().perform();
	    
	    for(int i=0; i<=7; i++)
	    {
	    	Thread.sleep(3000);
	    	act.sendKeys(Keys.DOWN).build().perform();
	    }
	    act.sendKeys(Keys.ENTER).build().perform();
    	Thread.sleep(3000);
        driver.close();
		  

	
	
	
	
	
	}

}
