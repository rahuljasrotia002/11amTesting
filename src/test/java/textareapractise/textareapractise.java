package textareapractise;

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

public class textareapractise {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver Driver =new ChromeDriver();
		Driver.get ("https://itera-qa.azurewebsites.net/home/automation");
		
		String expectedtitle ="- Testautomation practice page";
		String actualtitle= Driver.getTitle();
		if (expectedtitle.equals(actualtitle)) {
			System.out.println("Page is correct");
		}
	
	else {
			System.out.println("Page is incorrect");
	}
		
		
		String expectectedUrl = "https://itera-qa.azurewebsites.net/home/automation";
			String actualUrl = Driver.getCurrentUrl();
			if (expectectedUrl.equals(actualUrl)) {
				System.out.println("correct Page");
			} else {
				System.out.println("incorrect Page");
			}
			
			
			WebElement ele = Driver.findElement(By.id("name"));
			ele.sendKeys("Rahul Jasrotia");
			Thread.sleep(1000);
			
			WebElement ele2 = Driver.findElement(By.id("phone"));
			ele2.sendKeys("1234567890");
			Thread.sleep(1000);
			
			WebElement ele3 = Driver.findElement(By.id("email"));
			ele3.sendKeys("abc@gmail.com");
			Thread.sleep(1000);
			
			WebElement ele4 = Driver.findElement(By.id("password"));
			ele4.sendKeys("abc@gmail.com");
			Thread.sleep(1000);
			
			

			WebElement ele5 = Driver.findElement(By.id("address"));
			ele5.sendKeys("Himachal Pradesh");
			Thread.sleep(1000);
			
			
			Driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/button")).click();
			Thread.sleep(1000);
			
			 TakesScreenshot sc = ((TakesScreenshot) Driver);

				File src = sc.getScreenshotAs(OutputType.FILE);
				File f2 = new File("C:\\screenshot\\image2.png");
				FileUtils.copyFile(src, f2);
				Driver.close();		 
					 
			
			
			
			
			
		
		

	}

}
