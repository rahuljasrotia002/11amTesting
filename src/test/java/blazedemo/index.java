package blazedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class index {

public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver;
		driver= new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
