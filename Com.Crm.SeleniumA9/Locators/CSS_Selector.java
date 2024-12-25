package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {
	
	public static void main(String[] args) throws InterruptedException {
		
		String expected_title = "Demo Web Shop";
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com");
		
		String actual_title = driver.getTitle();
		
		System.out.println(actual_title);
		
		if (expected_title.equals(actual_title)) {
			
			System.out.println("iam in dws page...!");
			
//			driver.findElement(By.id("small-searchterms")).sendKeys("mobile");
			
			driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("mobile");
			
			//use CSS SELECTOR to click on search button
//			driver.findElement(By.cssSelector("input[type='submit']")).click();
			driver.findElement(By.cssSelector(".button-1.search-box-button")).click();
			
			
		}
		else {
			System.out.println("Iam lost");
		}
		
		Thread.sleep(2000);
		
		driver.close();
	}
}
