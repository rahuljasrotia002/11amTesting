package flightbooking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flightbooking2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://blazedemo.com/reserve.php");
		
		Thread.sleep(2000);
		
		
		 WebElement web2 = driver.findElement(By.id("cardType"));
			Thread.sleep(2000);
			Select dropvalue2 = new Select(web2);
			dropvalue2.selectByValue("American Express");
		
		driver.close();
		 
		 
		 
		 
		 
		 

	}

}
