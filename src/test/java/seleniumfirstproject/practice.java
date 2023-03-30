package seleniumfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
	
		driver.get("https://www.saucedemo.com/");
		
		String expectedTitle = "Swag Labs";

		String actualtitle = driver.getTitle();
		
		
		if (expectedTitle.equals(actualtitle)) {
		System.out.println("page is correct");
		} else {
			System.out.println("page is incorrect");
		}
		String expectedurl =  "https://www.saucedemo.com/";
		String actualurl = driver.getTitle();
		
		if (expectedurl.equals(actualurl));
		{
			System.out.println("");
		}
		
		}
		
				
				
		
		

	}

	

