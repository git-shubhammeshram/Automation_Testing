package SanityTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SwagLabsSanity {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.chrome.driver", "Chromedirver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		userName.sendKeys("standard_user");
		WebElement userPass = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		userPass.sendKeys("secret_sauce");
		WebElement submitButton = driver.findElement(By.xpath("//input[@id='login-button']"));
		submitButton.click();
		Thread.sleep(2000);
		WebElement sortButton = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		Select sortMenu = new Select(sortButton);
		sortMenu.selectByVisibleText("Price (low to high)");
		Thread.sleep(3000);
		WebElement addToCart = driver.findElement(By.xpath("//button[@data-test='add-to-cart-sauce-labs-onesie']"));
		addToCart.click();
		Thread.sleep(3000);
		WebElement cartButton = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		cartButton.click();
		Thread.sleep(3000);
////		WebElement removeCart = driver.findElement(By.xpath("//div[@class='removed_cart_item']"));
////		removeCart.click();
		WebElement removeButton = driver.findElement(By.xpath("//button[text()='Remove']"));
		removeButton.click();
		Thread.sleep(3000);

		WebElement continueShop = driver.findElement(By.xpath("//button[@id='continue-shopping']"));
		continueShop.click();
		Thread.sleep(3000);

		WebElement addCart2 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
		addCart2.click();
		Thread.sleep(3000);

		WebElement cartButton2 = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		cartButton2.click();
		Thread.sleep(3000);

		WebElement checkOutTab = driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium checkout_button']"));
		checkOutTab.click();
		Thread.sleep(3000);

		WebElement nameCheckout = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		nameCheckout.sendKeys("Shubham");
		Thread.sleep(3000);

		WebElement lastNameCheckout = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastNameCheckout.sendKeys("Meshram");
		Thread.sleep(3000);

		WebElement pinCheckout = driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']"));
		pinCheckout.sendKeys("444901");
		Thread.sleep(3000);

		WebElement continueTab = driver.findElement(By.xpath("//input[@name='continue']"));
		continueTab.click();
		Thread.sleep(3000);

		WebElement finishButton = driver.findElement(By.xpath("//button[@name='finish']"));
		finishButton.click();
		
		WebElement backToHome = driver.findElement(By.xpath("//button[@id='back-to-products']"));
		backToHome.click();
		Thread.sleep(3000);

		WebElement menuTab = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
		menuTab.click();
		Thread.sleep(3000);

		WebElement logoutTab = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
		logoutTab.click();
		Thread.sleep(3000);

		WebElement userName2 = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		userName2.sendKeys("locked_out_user");
		Thread.sleep(3000);

		WebElement userPass2 = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		userPass2.sendKeys("secret_sauce");
		Thread.sleep(3000);

		WebElement submitButton2 = driver.findElement(By.xpath("//input[@id='login-button']"));
		submitButton2.click();
		Thread.sleep(3000);

		
		WebElement errorShow = driver.findElement(By.xpath("//h3[@data-test='error']"));
	    System.out.println(errorShow.getText());
	    
	    driver.close();
	    driver.quit();
	
	
	
	
	}

}
