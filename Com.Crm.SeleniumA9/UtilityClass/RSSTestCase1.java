package UtilityClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RSSTestCase1 extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		String expected_rss_url = "https://demowebshop.tricentis.com/news/rss/1";
		
		precondition("edge");
		login();
		
		Thread.sleep(1000);
		
		 List<WebElement> social_links = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
		
		 for (WebElement web : social_links) {
			
			 web.click();
			 
			 String actual_rss_url = driver.getCurrentUrl();
			 Thread.sleep(1000);
			 if (expected_rss_url.equals(actual_rss_url)) {
				
				 driver.navigate().back();
			}	 
		}
		
		 Thread.sleep(1000);
		 postCondition();
	}
}