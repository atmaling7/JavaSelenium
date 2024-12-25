package ActionsClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import UtilityClass.BaseClass;

public class NewTab extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		precondition("chrome");
		
		Actions act = new Actions(driver);
		
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@class='top-menu']/li/a"));
		
		for (WebElement web: elements) {
			
			act.keyDown(Keys.CONTROL).click(web).perform();
		}
		
		driver.quit();
	}
}
