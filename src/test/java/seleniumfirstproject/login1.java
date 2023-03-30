package seleniumfirstproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
	
				WebDriverManager.chromedriver().setup();

				WebDriver driver = new ChromeDriver();

				driver.get("https://www.saucedemo.com/");

				String excpectedTitle = "Swag Labs";

				String actualtile = driver.getTitle();

				if (excpectedTitle.equals(actualtile)) {
					System.out.println("Page is correct");
				} else {
					System.out.println("Page is incorrect");
				}

				String expectectedUrl = "https://www.saucedemo.com/";

				String actualUrl = driver.getCurrentUrl();

				if (expectectedUrl.equals(actualUrl)) {
					System.out.println("correct Page");
				} else {
					System.out.println("incorrect Page");
				}

				Thread.sleep(2000);
				WebElement ele = driver.findElement(By.id("user-name"));

				ele.sendKeys("standard_user");
				Thread.sleep(2000);

				WebElement ele1 = driver.findElement(By.id("password"));

				ele1.sendKeys("secret_sauce");
				Thread.sleep(2000);

				driver.findElement(By.id("login-button")).click();

				Thread.sleep(2000);

				// Navigation Of Driver

				driver.navigate().back();

				Thread.sleep(2000);

				driver.navigate().forward();

				Thread.sleep(2000);

				driver.navigate().refresh();

				Thread.sleep(2000);
				
				TakesScreenshot sc = ((TakesScreenshot) driver);

				File src = sc.getScreenshotAs(OutputType.FILE);
				File f2 = new File("C:\\screenshot\\image.png");
				FileUtils.copyFile(src, f2);
				driver.close();
				
				
				
		 /*driver.Get()   :- you have to pass a String value i.e URL and it will open that


		driver.Getitle()  :- driver will return the title of the current page

		driver.getCurrentUrl() :- driver will return the Url of the current page


		thread.sleep()- it indicate the driver to hold for the given fraction of time

		driver.close():- it terminates the driver*/
				
				
		//--------------------------------------------------------------------------------------------------------------------------------//
				
				
				
				/*xpath:- css locator

				it is a  xml expression

				heps to navigate in html structre 



				Relative Xpath

				//*[@id="user-name"]

				:- this xpath identify the element through the attributes not with the root node

				:- there will be no change on the xpath if Dom is manipulated.

				:- //



				Absolute Xpath:-

				/  , position of the webelement from the root node

				:- if position of the webelement is changed your xpath will expire

				/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input


				: /  */

			}

		

	}


