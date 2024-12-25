//WS for DWS web site
//⦁	Open the Browser
//⦁	Maximize
//⦁	Waiting Condition
//⦁	Enter into DWS
//⦁	Login
//⦁	Send some value inside the search field
//⦁	Clcik the search button
//⦁	Log out
//⦁	Close the brow

package assignment;

import org.openqa.selenium.By;

import UtilityClass.BaseClass;

public class Assign_27_11_1 extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		precondition("chrome");
		
		login();
				
		driver.findElement(By.id("small-searchterms")).sendKeys("mobile");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("ico-logout")).click();
		Thread.sleep(1000);
		
		postCondition();
	}
}
