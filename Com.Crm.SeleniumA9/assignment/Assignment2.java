package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		String expected_title = "Demo Web Shop";
		
		//open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//enter into the dws url
		driver.get("https://demowebshop.tricentis.com/");
		
		//get titlte
		String actual_title = driver.getTitle();
		
		if (expected_title.equals(actual_title)) {
			
			System.out.println("Pass");
			
			WebElement search = driver.findElement(By.tagName("input"));
			
			search.sendKeys("Amit");
			//click register link
			driver.findElement(By.className("ico-register")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.className("ico-login")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.className("ico-cart")).click();
			
			//click on wishlist
			driver.findElement(By.className("ico-wishlist")).click();
		}
		else {
			System.out.println("fail");
		}
		Thread.sleep(2000);
		driver.close();
	}
}
