package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependantAndDependantXpath {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		
//		String price = driver.findElement(By.xpath("//span[text()='1.00']")).getText();
		
		String price = driver.findElement(By.xpath("//a[text()='3rd Album']/../following-sibling::div[3]/div/span")).getText();
		Thread.sleep(2000);
		System.out.println(price);
		
		driver.close();
	}
}
