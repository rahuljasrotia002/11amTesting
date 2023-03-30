package fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fileuploadd {

	public static void main(String[] args) throws InterruptedException {
	 
		WebDriverManager.chromedriver().setup();
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://the-internet.herokuapp.com/upload");
		
		Thread.sleep(4000);
		
		Driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Rahul Jasrotia\\Downloads\\unesmp.jpg");
		Thread.sleep(5000);
		Driver.close();
		
		

	}

}
