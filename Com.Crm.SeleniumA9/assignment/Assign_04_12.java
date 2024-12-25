package assignment;

import java.util.List;

import org.checkerframework.framework.qual.PostconditionAnnotation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign_04_12 {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.myntra.com/");
		Thread.sleep(1000);
		
		Actions act = new Actions(driver);
		
		List<WebElement> options = driver.findElements(By.className("desktop-navLink"));
		
		for (WebElement web : options) {
			
			act.moveToElement(web).perform();
			Thread.sleep(1000);
		}
		
		driver.close();
	}
}
