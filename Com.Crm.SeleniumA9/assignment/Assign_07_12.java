package assignment;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import UtilityClass.BaseClass;

public class Assign_07_12 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		String expected_url = "https://demowebshop.tricentis.com/";
		String rss = "https://demowebshop.tricentis.com/news/rss/1";
		String fb = "https://www.facebook.com/nopCommerce";
		String twitter = "https://x.com/nopCommerce";
		String youtube = "https://www.youtube.com/user/nopCommerce";
		String gplus = "https://workspaceupdates.googleblog.com/2023/04/new-community-features-for-google-chat-and-an-update-currents%20.html";
		
		
		if (verifyByUrl(expected_url)) {
			
			String parent = driver.getWindowHandle();
			
			System.out.println("Iam in dws page...!");
			Thread.sleep(1000);
			
			Actions act = new Actions(driver);
			
			act.keyDown(Keys.PAGE_DOWN).perform();
			act.keyDown(Keys.PAGE_DOWN).perform();
			
			Thread.sleep(1000);
			
			List<WebElement> social_links = driver.findElements(By.xpath("//div[@class='footer']/div/div[4]/ul/li/a"));
			
			for (WebElement web : social_links) {
				
				web.click();
				String rss_url = driver.getCurrentUrl();
				
				if (rss.equals(rss_url)) {
					driver.navigate().back();
				}
				
			}
			
			Set<String> childs = driver.getWindowHandles();
			
			for (String str: childs) {
				
				driver.switchTo().window(str);
				
				String cur_url = driver.getCurrentUrl();
				
				if (cur_url.equals(fb)) {
					
					Thread.sleep(2000);
					driver.findElement(By.xpath("//span[text()='Create new account']")).click();
					Thread.sleep(2000);
				}
				else if (cur_url.equals(twitter)) {
					
					Thread.sleep(2000);
					driver.findElement(By.xpath("//span[text()='Create account']")).click();
					Thread.sleep(2000);			}
				else if (cur_url.equals(youtube)) {
					
					Thread.sleep(2000);
					WebElement yt = driver.findElement(By.xpath("//input[@id='search']"));
					Thread.sleep(1000);
					yt.click();
					yt.sendKeys("indias got latent");
					Thread.sleep(2000);
				}
				else if (cur_url.equals(gplus)) {
					
					Thread.sleep(2000);
					driver.findElement(By.id("mce-EMAIL")).sendKeys("Happy...!");
					Thread.sleep(2000);
				}
			}
			
			driver.switchTo().window(parent);
			
			act.keyDown(Keys.PAGE_UP);
			act.keyDown(Keys.PAGE_UP);
			driver.findElement(By.className("ico-register")).click();
			Thread.sleep(3000);
			
		}else {
			System.out.println("Iam not in dws page...!");
		}
		
		driver.quit();
	}
}
