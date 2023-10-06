package LocatorsProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ProgramApr27_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "Chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		driver.manage().window().maximize();
		WebElement yourFullName = driver.findElement(By.xpath("//input[@name='fullname']"));
		yourFullName.sendKeys("Shubham Satish Meshram");
		Thread.sleep(3000);
		WebElement yourEmailId = driver.findElement(By.xpath("//input[@id='emailid']"));
		yourEmailId.sendKeys("shbm535@gmail.com");
		Thread.sleep(3000);
		WebElement yourPassword = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		yourPassword.sendKeys("Pass@123");
		Thread.sleep(3000);
		WebElement rePassword = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		rePassword.sendKeys("Pass@123");
		Thread.sleep(3000);
		WebElement genderClickBox = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		genderClickBox.click();
		WebElement dateSelectBox = driver.findElement(By.xpath("//select[@name='date_day']"));
		Select x = new Select(dateSelectBox);
		x.selectByVisibleText("31");
		Thread.sleep(3000);
		WebElement monthSelectBox = driver.findElement(By.xpath("//select[@name='date_mon']"));
		Select y = new Select(monthSelectBox);
		y.selectByVisibleText("AUG");
		Thread.sleep(3000);
		WebElement yearSelectBox = driver.findElement(By.xpath("//select[@name='Date_Year']"));
	    Select z = new Select(yearSelectBox);
	    z.selectByVisibleText("1997");
	    Thread.sleep(3000);
	    WebElement cityNameBox = driver.findElement(By.xpath("//input[@name='city']"));
	    cityNameBox.sendKeys("Amravati");
	    Thread.sleep(3000);
	    WebElement schoolNameBox = driver.findElement(By.xpath("//input[@id='school']"));
	    schoolNameBox.sendKeys("Government Technical Highschool Amravati");
	    Thread.sleep(3000);
	    WebElement collegeNameBox = driver.findElement(By.xpath("//input[@id='college']"));
	    collegeNameBox.sendKeys("PRMCEAM Badnera");
	    Thread.sleep(3000);
	    WebElement captchaBox = driver.findElement(By.xpath("//input[@id='fld_captcha']"));
	    captchaBox.sendKeys("445869");
	    Thread.sleep(3000);
	    WebElement submitClick = driver.findElement(By.xpath("//input[@type='submit']"));
	    submitClick.click();
	    Thread.sleep(3000);
	    WebElement termsLink = driver.findElement(By.xpath("//a[text()='Terms of Use']"));
	    termsLink.click();
	    Thread.sleep(3000);
	    driver.close();
	
	
	
	}

}
