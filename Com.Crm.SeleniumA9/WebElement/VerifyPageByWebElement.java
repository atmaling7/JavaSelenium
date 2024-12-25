package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPageByWebElement {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement poor = driver.findElement(By.id("pollanswers-3"));
		
		poor.click();
		
		if (poor.isDisplayed()) {
			
			System.out.println("iam in the targeted page...");
		}
		else {
			System.out.println("Iam not in the targeted page...");
		}
		
		Thread.sleep(2000);
		
		driver.close();
		
	}
}
