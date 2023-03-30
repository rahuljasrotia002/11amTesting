package frstlogintestng;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//difference b/w local variable and global variable
//Local variable:-Local variables can only be accessed within the function or module in which they are defined
//Global variable:-in contrast to global variables, which can be used throughout the entire program.
public class login {
	
	WebDriver driver;
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}

	@Test
	public void veryUrl() {

		String expectedUrl = "https://www.saucedemo.com/";

		String actualUrl = driver.getCurrentUrl();

		assertEquals(expectedUrl, actualUrl);
		assertTrue(true);

	}
	@Test(priority = 2)
	public void verifyTitle() {
		String expectedtitle = "Swag Labs";

		String actualTilte = driver.getTitle();

		assertEquals(expectedtitle, actualTilte);
		assertTrue(true);

	}

	@Test(priority = 3)
	public void login1() throws InterruptedException {
		Thread.sleep(2000);

		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		Thread.sleep(2000);

		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
	}

	@AfterTest
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
}
	
	
	}
