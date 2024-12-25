package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Temp {
	
public static void main(String[] args) throws InterruptedException {
		
		String expected_url = "https://demowebshop.tricentis.com/";
		
		String rss_expected_url = "https://demowebshop.tricentis.com/news/rss/1";
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		String actual_url = driver.getCurrentUrl();
		
		if (expected_url.equals(actual_url)) {
			
			System.out.println("Iam in dws page...!");
			
			List<WebElement> links = driver.findElements(By.xpath("//div[@class='footer-menu-wrapper']/div[4]/ul/li/a"));
			
			for (WebElement web : links) {
				
				web.click();
				
				Thread.sleep(2000);
			
				String rss_actual_url = driver.getCurrentUrl();
				
				if (rss_expected_url.equals(rss_actual_url)) {
					
					System.out.println("Iam in RSS page..reflecting back to dws homepage");
					driver.navigate().back();
				}
			}
			
		}
		else {
			System.out.println("Iam not in dws page...!");
		}
		
		Thread.sleep(2000);
		
//		driver.close();
		driver.quit();
	}
}
