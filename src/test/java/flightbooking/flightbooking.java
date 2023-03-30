package flightbooking;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flightbooking {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		 WebDriver Driver= new ChromeDriver();
		 Driver.get("https://blazedemo.com/");
		 String exceptedtitle="BlazeDemo" ;
		 String actualtitle=Driver.getTitle();
		
		 if (exceptedtitle.equals(actualtitle)) {
				System.out.println("Page is correct");
			}
		
		else {
				System.out.println("Page is incorrect");
		}
		 
	       
		 String expectectedUrl = "https://blazedemo.com/";
		String actualUrl = Driver.getCurrentUrl();
		if (expectectedUrl.equals(actualUrl)) {
			System.out.println("correct Page");
		} else {
			System.out.println("incorrect Page");
		}
		
		// Dropdown
		WebElement web = Driver.findElement(By.xpath("/html/body/div[3]/form/select[1]"));
		Thread.sleep(1000);
	    Select dropvalue=new  Select(web);
		dropvalue.selectByValue("San Diego");
        Thread.sleep(1000);
          
                
        WebElement web1 = Driver.findElement(By.xpath("/html/body/div[3]/form/select[2]"));
		Thread.sleep(1000);
		Select dropvalue1 = new Select(web1);
		dropvalue1.selectByValue("London");
		Thread.sleep(1000);
		
		Driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		Thread.sleep(1000);
		
		Driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input")).click();
		Thread.sleep(1000);
		
		//choose this flight
		WebElement ele = Driver.findElement(By.id("inputName"));
		ele.sendKeys("Rahul");
		Thread.sleep(1000);
		
		WebElement ele1 = Driver.findElement(By.id ("address")) ;
		ele1.sendKeys("12345");
		Thread.sleep(1000);
		
		WebElement ele2 = Driver.findElement(By.id ("city")) ;
		ele2.sendKeys("Palampur");
		Thread.sleep(1000);
		
		WebElement ele3 = Driver.findElement(By.id ("state")) ;
		ele3.sendKeys("Himachal Pradesh");
		Thread.sleep(1000);
		
		WebElement ele4= Driver.findElement(By.id ("zipCode")) ;
		ele4.sendKeys("176095");
		Thread.sleep(1000);
		
		
		 WebElement ele5 = Driver.findElement(By.id("cardType"));
		 Thread.sleep(1000);
		 Select dropvalue2= new Select(ele5);
		 dropvalue2.selectByValue("amex");
		 Thread.sleep(1000);
			
		 WebElement ele6 = Driver.findElement(By.id("creditCardNumber"));
		 ele6.sendKeys("112233445566");
	     Thread.sleep(1000);
				
		 WebElement ele7 = Driver.findElement(By.id("creditCardMonth"));
		 ele7.clear();
		 ele7.sendKeys("12");
		 Thread.sleep(1000);
				 
		 WebElement ele8 = Driver.findElement(By.id("creditCardYear"));
		 ele8.clear();
		 ele8.sendKeys("2025");
		 Thread.sleep(1000);
				 
				 
		 WebElement ele9 = Driver.findElement(By.id("nameOnCard"));
		 ele9.sendKeys("Rahul Jasrotia");
	     Thread.sleep(1000);
				 

		 Driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/label")).click();
		 Thread.sleep(1000);
				 
		 Driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		 Thread.sleep(1000);
				 
		 TakesScreenshot sc = ((TakesScreenshot) Driver);

			File src = sc.getScreenshotAs(OutputType.FILE);
			File f2 = new File("C:\\screenshot\\image12.png");
			FileUtils.copyFile(src, f2);
			Driver.close();		 
				 
				
			
			
		
		
		
		
		
			
			
		
		
		
	}

}
