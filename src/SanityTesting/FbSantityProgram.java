package SanityTesting;

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

public class FbSantityProgram {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "Chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805691%7Ce%7Cfb%20register%7C&placement=&creative=550525805691&keyword=fb%20register&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221592%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-323400148944%26loc_physical_ms%3D9299869%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwmuiTBhDoARIsAPiv6L9fJVLshRAeI-2wN_EN8qn0v71cr3TQ_X-Mx1MrGsehSnuJOvwbRDcaAvQVEALw_wcB");
        driver.manage().window().maximize();
        WebElement fbLogo = driver.findElement(By.xpath("//img[@class='fb_logo _registrationPage__fbLogo img']"));
        WebElement createLable = driver.findElement(By.xpath("//div[text()='Create a new account']")); 
        WebElement createLableText = driver.findElement(By.xpath("//div[@class='_52lr _9bq0 fsm fwn fcg']"));
        WebElement nameText = driver.findElement(By.xpath("//input[@name='firstname']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        WebElement emailId = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        WebElement passId = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
        WebElement dobLable = driver.findElement(By.xpath("(//div[@class='mtm mbs _2_68'])[1]"));
        WebElement birthText = driver.findElement(By.xpath("//select[@name='birthday_day']"));
        WebElement monthText = driver.findElement(By.xpath("//select[@name='birthday_month']"));
        WebElement yearText = driver.findElement(By.xpath("//select[@name='birthday_year']"));
        WebElement genderLable = driver.findElement(By.xpath("(//div[@class='mtm mbs _2_68'])[3]"));
        WebElement femaleBox = driver.findElement(By.xpath("//label[text()='Female']"));
        WebElement maleBox = driver.findElement(By.xpath("//label[text()='Male']"));
        WebElement costomBox = driver.findElement(By.xpath("//label[text()='Custom']"));
        WebElement termsTextLabel = driver.findElement(By.xpath("//p[@class='_58mv']"));
        WebElement submitButton = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
        WebElement allreadyText = driver.findElement(By.xpath("//a[text()='Already have an account?']"));
        
        int count=0;
        
       if(fbLogo.isDisplayed()) 
       {
    	   count++;
       }
       if(createLable.isDisplayed()) 
       {
    	   count++;
       }
       if(createLableText.isDisplayed()) 
       {
    	   count++;
       }
       if(nameText.isDisplayed()) 
       {
    	   count++;
       }
       if(lastName.isDisplayed()) 
       {
    	   count++;
       }
       if(emailId.isDisplayed()) 
       {
    	   count++;
       }
       if(passId.isDisplayed()) 
       {
    	   count++;
       }
       if(dobLable.isDisplayed()) 
       {
    	   count++;
       }
       if(birthText.isDisplayed()) 
       {
    	   count++;
       }
       if(monthText.isDisplayed()) 
       {
    	   count++;
       }
       if(yearText.isDisplayed()) 
       {
    	   count++;
       }
       if(genderLable.isDisplayed()) 
       {
    	   count++;
       }
       if(femaleBox.isDisplayed()) 
       {
    	   count++;
       }
       if(maleBox.isDisplayed()) 
       {
    	   count++;
       }
       if(costomBox.isDisplayed()) 
       {
    	   count++;
       }
       if(termsTextLabel.isDisplayed()) 
       {
    	   count++;
       }
       if(submitButton.isDisplayed()) 
       {
    	   count++;
       }
       if(allreadyText.isDisplayed()) 
       {
    	   count++;
       }
       System.out.println("Number of Element is = " +count);
       
       FileInputStream inputExcel = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Automation\\TestData\\FbData.xlsx");
       Sheet readExcel = WorkbookFactory.create(inputExcel).getSheet("Sheet1"); 
       nameText.sendKeys(readExcel.getRow(0).getCell(0).getStringCellValue()); 
       lastName.sendKeys(readExcel.getRow(0).getCell(1).getStringCellValue());
       emailId.sendKeys(readExcel.getRow(0).getCell(2).getStringCellValue());
       passId.sendKeys(readExcel.getRow(0).getCell(3).getStringCellValue());
       Select Birthdate = new Select(birthText);
       Birthdate.selectByVisibleText(readExcel.getRow(0).getCell(4).getStringCellValue());
       
       Select Birthmonth = new Select(monthText);
       Birthmonth.selectByVisibleText(readExcel.getRow(0).getCell(5).getStringCellValue());
       
       Select Birthyear = new Select(yearText);
       Birthyear.selectByVisibleText(readExcel.getRow(0).getCell(6).getStringCellValue());
       
       maleBox.click();
       
       Thread.sleep(3000);
       
       driver.close();
       driver.quit();
       
       
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
