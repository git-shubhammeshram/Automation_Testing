package Parameterization;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program_May_5_1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		System.setProperty("Webdriver.chrome.driver", "Chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		driver.manage().window().maximize();
		
		WebElement nameTextBox = driver.findElement(By.xpath("//input[@id='fullname']"));
		WebElement emailTextBox = driver.findElement(By.xpath("//input[@id='emailid']"));
		WebElement passTextBox = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement rePassTextBox = driver.findElement(By.xpath("//input[@id='repass']"));
		WebElement genderClick = driver.findElement(By.xpath("//input[@value='m']"));
		WebElement dayClickBox = driver.findElement(By.xpath("//select[@id='date_day']"));
		WebElement monthClickBox = driver.findElement(By.xpath("//select[@id='date_mon']"));
		WebElement yearClickBox = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		WebElement locationTextBox = driver.findElement(By.xpath("//input[@name='city']"));
		WebElement schoolTextbox = driver.findElement(By.xpath("//input[@name='school']"));
		WebElement collegeTextBox = driver.findElement(By.xpath("//input[@name='college']"));
		WebElement captchaTextbox = driver.findElement(By.xpath("//input[@name='fld_captcha']"));
		WebElement registerClick = driver.findElement(By.xpath("//input[@id='btn_register']"));
		
		
		FileInputStream inputExcel = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Automation\\TestData\\RedData.xlsx");
		Sheet readExcel = WorkbookFactory.create(inputExcel).getSheet("Sheet1");
		
		nameTextBox.sendKeys(readExcel.getRow(0).getCell(0).getStringCellValue());
		emailTextBox.sendKeys(readExcel.getRow(0).getCell(1).getStringCellValue());
		passTextBox.sendKeys(readExcel.getRow(0).getCell(2).getStringCellValue());
		rePassTextBox.sendKeys(readExcel.getRow(0).getCell(3).getStringCellValue());
		genderClick.click();
		
		
		Select x = new Select(dayClickBox);
		x.selectByVisibleText(readExcel.getRow(0).getCell(4).getStringCellValue());
		Select y = new Select(monthClickBox);
		y.selectByVisibleText(readExcel.getRow(0).getCell(5).getStringCellValue());
		Select z = new Select(yearClickBox);
		z.selectByVisibleText(readExcel.getRow(0).getCell(6).getStringCellValue());
		
		locationTextBox.sendKeys(readExcel.getRow(0).getCell(7).getStringCellValue());
		schoolTextbox.sendKeys(readExcel.getRow(0).getCell(8).getStringCellValue());
		collegeTextBox.sendKeys(readExcel.getRow(0).getCell(9).getStringCellValue());
		captchaTextbox.sendKeys(readExcel.getRow(0).getCell(10).getStringCellValue());
		
		Thread.sleep(3000);
		registerClick.click();
		driver.close();
		
		
		
		
		
	}

}
