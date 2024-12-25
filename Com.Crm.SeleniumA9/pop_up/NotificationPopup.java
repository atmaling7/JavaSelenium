package pop_up;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NotificationPopup {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.easemytrip.com/");
		Thread.sleep(3000);
		
		Robot bot = new Robot();
		
		bot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_ENTER);
		
//		bot.keyRelease(KeyEvent.VK_TAB);
//		bot.keyRelease(KeyEvent.VK_ENTER);
	
		Thread.sleep(2000);
		
		driver.close();
	}
}
