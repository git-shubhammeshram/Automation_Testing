package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ProgramApr28_1 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "Chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		driver.manage().window().maximize();
		WebElement dateDropBox = driver.findElement(By.xpath("//select[@name='date_day']"));
		Select x = new Select(dateDropBox);
		List<WebElement> dayOptions = x.getOptions();
		x.selectByVisibleText("31");
		
		for(int i = 0;i<dayOptions.size();i++)
		{
			System.out.println(dayOptions.get(i).getText());
		}
		
		for(WebElement value:dayOptions)
		{
			System.out.print(value.getText()+ " ");
		}
		driver.close();
		
		
		
		
		
		
	}

}
