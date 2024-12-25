package Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato_2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		String expected_url = "https://www.zomato.com/";
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.zomato.com/");
		Thread.sleep(2000);
		
		String actual_url = driver.getCurrentUrl();
		
		if (expected_url.equals(actual_url)) {
			
			System.out.println("Order something fast...");
			
			WebElement login = driver.findElement(By.xpath("//a[text()='Log in']"));
			
			login.click();Thread.sleep(5000);
			
			WebElement mobile = driver.findElement(By.xpath("//input[@placeholder='Phone']"));
			
			mobile.sendKeys("8766904950");
			
			
			
		}
		else {
			System.out.println("Bro make it fast. Iam very hungry...");
		}
		
	}
}
