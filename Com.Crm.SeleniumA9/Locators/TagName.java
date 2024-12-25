package Locators;

import java.io.Serial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
	
	public static void main(String[] args) throws InterruptedException {
		
		String expected_url = "https://demowebshop.tricentis.com/";
		//open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//maximize the brwoser
		driver.manage().window().maximize();
		
		//enter into url
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);//wait for 2 seconds
		
		String actual_url = driver.getCurrentUrl();
		
		//verify the page by using url
		if (expected_url.equals(actual_url)) {
			
			System.out.println("Pass");
			
			//extract the web element using findElement that will return the WebElement type and store it for further use(target is search_field)
			
			WebElement search_field = driver.findElement(By.tagName("input"));
			
			//using search_field(returned webElement) send some value to that respective field
			search_field.sendKeys("Atmaling...");
			
			//driver.findElement(By.tagName("a")).click(); it will not work as it is finding more than one tags of same name..
			driver.findElement(By.className("ico-register")).click();
			
		} else {
			System.out.println("fail");
		}
		Thread.sleep(2000);
		driver.close();
	}
}
