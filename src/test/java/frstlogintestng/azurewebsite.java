package frstlogintestng;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class azurewebsite {
	
	WebDriver driver;

	@BeforeTest
	public void beforesetup() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
	}

	@Test(priority = 5)
	public void fileupload() {
		driver.findElement(By.id("inputGroupFile02")).sendKeys("C:\\Users\\Rahul Jasrotia\\Downloads\\unesmp.jpg");
	}

	@Test(priority = 2)
	public void radio() throws InterruptedException {

		Thread.sleep(2000);
		List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio'  and contains(@id ,'ale')]"));
		System.out.println("The size of the radio is=:" + radio.size());
		for (WebElement btn : radio) {
			Thread.sleep(2000);
			btn.click();
		}

	}
     @Test(priority=1)
     public void textareapractise() throws InterruptedException {
    	 Thread.sleep(2000);
    	 WebElement ele = driver.findElement(By.id("name"));
			ele.sendKeys("Rahul Jasrotia");
			Thread.sleep(1000);
			
			WebElement ele2 = driver.findElement(By.id("phone"));
			ele2.sendKeys("1234567890");
			Thread.sleep(1000);
			
			WebElement ele3 = driver.findElement(By.id("email"));
			ele3.sendKeys("abc@gmail.com");
			Thread.sleep(1000);
			
			WebElement ele4 = driver.findElement(By.id("password"));
			ele4.sendKeys("abc@gmail.com");
			Thread.sleep(1000);
			
			

			WebElement ele5 = driver.findElement(By.id("address"));
			ele5.sendKeys("Himachal Pradesh");
			Thread.sleep(1000);
		  }
     @Test(priority=3)
     public void weekdays() throws InterruptedException {
     Thread.sleep(2000);
     List<WebElement> checkboxes= driver	.findElements(By.xpath("//input[@type='checkbox'  and contains(@id ,'day')]"));
		
		System.out.println(checkboxes.size());// 7
		for (WebElement box : checkboxes)
		{
			
			String chkn = box.getAttribute("id");
			System.out.println(chkn);
			if (chkn.equals("monday") || chkn.equals("tuesday")) {
		box.click();
			}}}
     
     @Test(priority=4)
		public void dropdown()  {
    	 
    	WebElement web = driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/select"));
 		Select dropdown=new  Select(web);
 		dropdown.selectByValue("Norway");
         
    	 
    	 
     }
	@AfterTest
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}

}
