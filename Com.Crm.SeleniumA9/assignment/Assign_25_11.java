package assignment;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_25_11 {
	
	public static void main(String[] args) throws InterruptedException {
		
		String expected_url = "https://demowebshop.tricentis.com/";
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		String actual_url = driver.getCurrentUrl();
		
		if (expected_url.equals(actual_url)) {
			
			System.out.println("Iam in dws page...!");
			
			List<WebElement> links = driver.findElements(By.xpath("//div[@class='footer-menu-wrapper']/div[4]/ul/li/a"));
			
			for (WebElement web : links) {
				
				try {
					web.click();
				} catch (Exception e) {
					// TODO: handle exception
//			
					driver.navigate().back();
					
					web.click();
					
				}
				
				Thread.sleep(2000);
			}
			
//			List<WebElement> links = driver.findElements(By.xpath("//a[@target='_blank']"));
			
//			List<WebElement> links = driver.findElements(By.xpath("//div[@class='footer-menu-wrapper']/div[4]/ul/li/a"));
//			
//			Iterator<WebElement> i = links.iterator();
//			
//			while (i.hasNext()) {
//				
//				try {
//					i.next().click();
//					
//				} catch (Exception e) {
//					// TODO: handle exception
//					
//					i.next().click();
//					driver.navigate().back();
//					i.next().click();
//				}
//			}
			
		}
		else {
			System.out.println("Iam not in dws page...!");
		}
	}
}


