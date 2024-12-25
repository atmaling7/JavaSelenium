package pop_up;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import UtilityClass.BaseClass;

public class ChildBrowser extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		precondition("chrome");
		
		String parent = driver.getWindowHandle();
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		
//		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//a[text()='Twitter']")).click();
//		Thread.sleep(1000);
		
		String rss = "https://demowebshop.tricentis.com/news/rss/1";
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='footer']/div/div[4]/ul/li/a"));
		
		for (WebElement web : links) {
			
			web.click();
			
			if (driver.getCurrentUrl().equals(rss)) {
				
				driver.navigate().back();
			}
		}
		
		String fb_url = "https://www.facebook.com/nopCommerce";
		
		Set<String> childs = driver.getWindowHandles();
		
		driver.switchTo().window(parent);
		
		for (String str: childs) {
			
			driver.switchTo().window(str);
			
			String actual_url = driver.getCurrentUrl();
			
			if (fb_url.equals(actual_url)) {
				
				driver.findElement(By.xpath("//span[text()='Create new account']")).click();
			}
			Thread.sleep(2000);
		}
		
		driver.switchTo().window(parent);
		
		driver.findElement(By.id("small-searchterms")).sendKeys("mobile.");
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}
}
