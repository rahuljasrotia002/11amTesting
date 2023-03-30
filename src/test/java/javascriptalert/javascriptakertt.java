package javascriptalert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascriptakertt {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		// how to handle diffrent types of popup's
		 Driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(2000);
		Driver.switchTo().alert().accept();
        Thread.sleep(2000);
        
        Driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(2000);

		Driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		Driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();

		Thread.sleep(2000);

		Alert alert = Driver.switchTo().alert();
		Thread.sleep(2000);

		alert.sendKeys("Hey");
		alert.accept();
		
		Thread.sleep(2000);
		Driver.close();
		
		
		
		
		
		

	}

}

