package actionclasss;





import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionclass2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(2000);
		
		
		act.sendKeys(Keys.HOME).perform();
	    Thread.sleep(2000);
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
