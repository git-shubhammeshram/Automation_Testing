package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ProgramApr28_2 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "Chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		driver.manage().window().maximize();
        WebElement monthDropBox = driver.findElement(By.xpath("//select[@name='date_mon']"));
	    Select y = new Select (monthDropBox);
	    List<WebElement> monthOptions = y.getOptions();
	    
	    for(int i=0;i<=12;i++)
	    {
	    	System.out.println(monthOptions.get(i).getText());
	    }
	    
	    for(WebElement value:monthOptions)
	    {
	    	System.out.print(value.getText()+ " ");
	    }
	    
	    driver.close();
	
	
	}

}
