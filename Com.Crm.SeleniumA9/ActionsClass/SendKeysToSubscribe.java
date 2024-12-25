package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import UtilityClass.BaseClass;

public class SendKeysToSubscribe extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		precondition("chrome");
		
		Actions act = new Actions(driver);
		
		WebElement subscribe = driver.findElement(By.id("newsletter-email"));
		
		act.sendKeys(subscribe, "Mr Beast").perform();
		
		Thread.sleep(1000);
		
		driver.close();
	}
}
