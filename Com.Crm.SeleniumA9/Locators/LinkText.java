package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
//		driver.findElement(By.id("small-searchterms")).sendKeys("mobile");
		driver.findElement(By.name("q")).sendKeys("keys");
		driver.findElement(By.className("button-1")).click();
		
		Thread.sleep(5000);
		
		driver.close();
	}
}
