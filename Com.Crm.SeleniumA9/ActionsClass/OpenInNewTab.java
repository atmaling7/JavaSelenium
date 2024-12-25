package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import UtilityClass.BaseClass;

public class OpenInNewTab extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		precondition("chrome");
		
		Actions act = new Actions(driver);
		
		WebElement book = driver.findElement(By.xpath("//a[contains(text(),'Books')]"));
		Thread.sleep(1000);
		
		act.keyDown(Keys.CONTROL).click(book).perform();
		
		driver.close();
	}
}
