package ActionsClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import UtilityClass.BaseClass;

public class Scrolling extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		precondition("chrome");
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		
		act.keyDown(Keys.PAGE_UP).perform();
		Thread.sleep(1000);
		
		driver.close();
	}
}
