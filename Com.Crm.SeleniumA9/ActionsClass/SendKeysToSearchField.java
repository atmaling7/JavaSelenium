package ActionsClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import UtilityClass.BaseClass;

public class SendKeysToSearchField extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		precondition("chrome");
		
		Actions act = new Actions(driver);
		
		for (int i = 0; i < 6; i++) {
			
			act.keyDown(Keys.TAB).perform();
			Thread.sleep(1000);
		}
		act.sendKeys("PS5").perform();
		
		act.keyDown(Keys.TAB).perform();
		
		act.keyDown(Keys.ENTER).perform();
		
		Thread.sleep(1000);
		
		driver.close();
	}
}
