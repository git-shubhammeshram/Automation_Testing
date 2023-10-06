package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ProgramApr29_2 {

	public static void main(String[] args) throws IOException{
		System.setProperty("WebDriver.chrome.driver", "ChromeDriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File dst = new File("C:\\Users\\HP\\eclipse-workspace\\Automation\\ScreenShots/Photo.jpeg");
	
	FileHandler.copy(src, dst);
	
	driver.quit();
	
	}

}
