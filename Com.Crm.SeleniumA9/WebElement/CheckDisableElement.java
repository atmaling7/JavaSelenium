package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckDisableElement {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement register = driver.findElement(By.linkText("Register"));
		
		if (register.isEnabled()) {
			
			System.out.println("Register element is enabled...");
			register.click();
		}
		else {
			System.out.println("register element is disabled...");
		}
		
		Thread.sleep(2000);
		
		
		driver.close();
	}
}
