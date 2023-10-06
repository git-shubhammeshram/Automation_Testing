package AdvanceSelenium;

//import java.util.Iterator;
//import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramMay23_1 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "Chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.aspsnippets.com/demos/1102/");
		
		WebElement popUpButton = driver.findElement(By.xpath("//input[@value='Open Popup']"));
		popUpButton.click();
		
//		Set<String> winPage = driver.getWindowHandles();
		
//		Iterator<String> itr = winPage.iterator();
		
//		String[] win = new String[10];
//		System.out.println("Window Size = "+ winPage.size());
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}
