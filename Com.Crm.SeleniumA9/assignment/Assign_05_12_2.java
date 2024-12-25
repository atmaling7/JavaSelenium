package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign_05_12_2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		String expected_url = "https://demo.guru99.com/test/simple_context_menu.html";
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		
		String actual_url = driver.getCurrentUrl();
		
		WebElement dblClick = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		
		Actions act = new Actions(driver);
		
		if (expected_url.equals(actual_url)) {
			
			System.out.println("I am in Guru99...!");
			
			act.moveToElement(dblClick).perform();
			
			try {
				act.doubleClick(dblClick).perform();
				driver.close();
				
				System.out.println("pop-up not displayed...!");
			} catch (Exception e) {
				System.out.println("pop-up displayed...!");
			}
			
			
		}
		else {
			System.out.println("Iam not in Guru99...!");
		}
		
		Thread.sleep(2000);
		
		driver.close();
		
	}
}
