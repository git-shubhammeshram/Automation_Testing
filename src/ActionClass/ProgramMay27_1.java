package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ProgramMay27_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "Chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement iFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iFrame);
		
		WebElement imgFirst = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement imgSecond = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement imgThird = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement imgFourth = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		WebElement imgTrash = driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(imgFirst).clickAndHold().moveToElement(imgTrash).release().build().perform();
        Thread.sleep(2000);
        act.moveToElement(imgSecond).clickAndHold().moveToElement(imgTrash).release().build().perform();
        Thread.sleep(2000);
        act.moveToElement(imgThird).clickAndHold().moveToElement(imgTrash).release().build().perform();
        Thread.sleep(2000);
        act.moveToElement(imgFourth).clickAndHold().moveToElement(imgTrash).release().build().perform();
        Thread.sleep(2000);
        
        driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
