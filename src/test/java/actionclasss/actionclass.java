package actionclasss;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionclass {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	     WebDriver driver = new ChromeDriver();	
	     driver.get("https://the-internet.herokuapp.com/key_presses");
	     
	     
	     Actions act = new Actions(driver);
	     act.sendKeys(Keys.ENTER).perform();

			Thread.sleep(2000);

			act.sendKeys(Keys.TAB).perform();

			Thread.sleep(2000);

			act.sendKeys(Keys.CONTROL).perform();
			Thread.sleep(2000);
			
			act.sendKeys(Keys.ARROW_LEFT).perform();
			Thread.sleep(2000);
			driver.close();
		
	     

	}

}
