package radiobutton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class radiobuttonn {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		Thread.sleep(2000);
		List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio'  and contains(@id ,'ale')]"));

		System.out.println("The size of the radio is=:" + radio.size());
		for (WebElement btn : radio) {
			Thread.sleep(2000);
			btn.click();
		}
		driver.close();
		

	}

}
