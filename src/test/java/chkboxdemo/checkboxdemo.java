package chkboxdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkboxdemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver Driver = new ChromeDriver();
		Driver.get ("https://itera-qa.azurewebsites.net/home/automation");
		
		
		
		String expectedtitle = ("- Testautomation practice page");
		String actualtitle = Driver.getTitle();
		
		if (expectedtitle.equals(actualtitle))        // cntrl+F= Univeralcheckbox
		{
		System.out.println("page is correct");
		}
		
		else {
     		System.out.println("page is incorrect");
     		
     	}
	   
		String expectedurl = ("https://itera-qa.azurewebsites.net/home/automation");
		String actualurl = Driver.getCurrentUrl();
		if (expectedurl.equals(actualurl))
		{ 
			System.out.println ("correct page");
			
		}
		
		else { System.out.println("incorrect page");
			
		}
		  
		List<WebElement> checkboxes= Driver	.findElements(By.xpath("//input[@type='checkbox'  and contains(@id ,'day')]"));
		
		System.out.println(checkboxes.size());// 7
		for (WebElement box : checkboxes)
		{
			
			String chkn = box.getAttribute("id");
			System.out.println(chkn);
			if (chkn.equals("monday") || chkn.equals("tuesday")) {
		box.click();
		
		
		
		}

		
		
		

	}}}


