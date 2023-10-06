package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ProgramApr28_5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		
		WebElement dropBox = driver.findElement(By.xpath("//select[@name='cars']"));
	    Select z = new Select(dropBox);
	    System.out.println(z.isMultiple());
	    
	    z.selectByVisibleText("Volvo");
	    z.selectByVisibleText("Saab");
	    
	    Thread.sleep(3000);
	    
	    z.deselectByVisibleText("Saab");
	    z.deselectByVisibleText("Volvo");
	    driver.close();
	
	
	}

}
