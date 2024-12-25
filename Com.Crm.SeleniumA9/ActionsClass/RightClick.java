package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Thread.sleep(1000);
		
		Actions act = new Actions(driver);
		
//		Thread.sleep(1000);
		
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
//		Thread.sleep(1000);
		act.contextClick(rightClick).perform();
		
		WebElement click = driver.findElement(By.xpath("//span[text()='Copy']"));
//		Thread.sleep(1000);
		
		act.moveToElement(rightClick).contextClick(click).perform();
//		act.contextClick(rightClick).contextClick(click).perform();
		
		try {
			rightClick.click();
			System.out.println("Popup is not displayed");
		} catch (Exception e) {
			System.out.println("pop-up is displayed");
		}
		Thread.sleep(2000);
		
		driver.close();
		
	}
}
