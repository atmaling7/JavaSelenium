package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckElementIsSelected {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement very_bad = driver.findElement(By.id("pollanswers-4"));
		
		very_bad.click();
		
		if (very_bad.isSelected()) {
			
			System.out.println("very_bad is selected successfully..");
		}
		else {
			System.out.println("very bad is not selected...");
		}
		
		Thread.sleep(2000);
		
		driver.close();
	}
}
