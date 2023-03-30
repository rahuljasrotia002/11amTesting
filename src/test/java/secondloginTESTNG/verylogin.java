package secondloginTESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verylogin {
WebDriver driver;
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("executing before the method");
	}

	@BeforeClass
	public void beforeclass() {
		System.out.println("Executing before the class");
	}

	@BeforeTest
	public void beforetest() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

	}

	@Test
	public void login() throws InterruptedException {

		WebElement ele = driver.findElement(By.id("user-name"));
		ele.sendKeys("standard_user");
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.id("password"));
		ele1.sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();

	}

	
	
	@AfterTest
	public void teardwon() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}


	@AfterClass
	public void afterclass() {
		System.out.println("executing after the class");
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("executing after the method");
	}

}


