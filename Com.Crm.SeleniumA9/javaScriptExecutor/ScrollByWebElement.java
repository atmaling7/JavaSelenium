package javaScriptExecutor;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollByWebElement {
	
	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
			
			driver.get("https://www.myntra.com/");
			
			Thread.sleep(2000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			WebElement customer_policies = driver.findElement(By.xpath("//p[text()=' CUSTOMER POLICIES ']"));
			Thread.sleep(2000);
			js.executeScript("arguments[0].scrollIntoView(true);", customer_policies);
//			js.executeScript("arguments[0].scrollIntoView(false);", customer_policies);
			Thread.sleep(2000);
			
			driver.close();
	}
}
