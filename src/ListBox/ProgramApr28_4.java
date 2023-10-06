package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ProgramApr28_4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		driver.manage().window().maximize();
		WebElement yearDropBox = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		Select z = new Select(yearDropBox);
        System.out.println(z.isMultiple());
        
        driver.close();
	}

}
