package BasicProgram;
       //Selenium webdriver and its methods

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ProgramApr19_1 {

	public static void main(String[] args) {
//		1) Get method
//	It is use to enter URL or to open an application

		System.setProperty("Webdriver.chrome.driver", "Chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
//		2) Close method
//		It is used to close the browser or current tab of browser
		driver.close();
	}

}
