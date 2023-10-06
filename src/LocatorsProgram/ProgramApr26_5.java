package LocatorsProgram;
//How we can get the status of element????????????
//d) isDisplayed
//It is used to verify weather element is present or not, if element is present on webpage
//it return true else return false
//e) IsEnabled
//It used to verify weather element is enabled or disable, if element enable return true
//else return false
//f) isSelected
//It used to verify weather radio button or checkbox selected or not

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramApr26_5 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "Chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://megrecruitment.nic.in/rpa/register.htm");
		driver.manage().window().maximize();
		
		WebElement emailIdTestBox = driver.findElement(By.xpath("//input[@id='emailid']"));
		System.out.println("is Displayed = " + emailIdTestBox.isDisplayed());
		System.out.println("is Enabled = " + emailIdTestBox.isEnabled());
		System.out.println("is Selected = " + emailIdTestBox.isSelected());
		
		WebElement specifyTextBox = driver.findElement(By.xpath("//select[@id='howindian']"));
		System.out.println("is Displayed = " + specifyTextBox.isDisplayed());
		System.out.println("is Enabled = " + specifyTextBox.isEnabled());
		System.out.println("is Selected = " + specifyTextBox.isSelected());

	}

}
