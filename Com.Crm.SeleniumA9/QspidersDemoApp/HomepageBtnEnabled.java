package QspidersDemoApp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import QspidersUtility.QspidersUtility;

public class HomepageBtnEnabled extends QspidersUtility{

		public static void main(String[] args) throws InterruptedException {
			
			String expected_url = "https://demoapps.qspiders.com/";
			
			precondition("edge");
			
			String actual_url = driver.getCurrentUrl();
			Thread.sleep(1000);
			
			if (expected_url.equals(actual_url)) {
				
				System.out.println("Iam in Qpsiders page...!");
				
				List<WebElement> top = driver.findElements(By.xpath("//main/section[@id='optionsBody']/a/div/main/p"));

				List<WebElement> bottom = driver.findElements(By.xpath("//main/section[2]/a"));
				
				top.addAll(bottom);
				
				for (WebElement web : top) {
					
					if (web.isDisplayed() && web.isEnabled()) {
						
						System.out.println(web.getText() + " is displayed...! and enabled...!" );
						System.out.println("*********************************************************");
					}
				}
				
			}
			else {
				System.out.println("Iam not in Qspiders page...!");
			}
			
			driver.close();
			
			
		}
}
