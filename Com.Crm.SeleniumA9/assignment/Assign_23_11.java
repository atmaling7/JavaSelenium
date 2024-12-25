package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_23_11 {
	
	public static void main(String[] args) throws InterruptedException {
		
		String expected_title = "Facebook – log in or sign up";
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		String actual_title = driver.getTitle();
		System.out.println(actual_title);
		
		if (expected_title.equals(actual_title)) {
			
//			System.out.println("Iam in Faacebook page...!");
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Alaska");
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Jelina");
			
//			driver.findElement(By.xpath("//select[@id='day']")).click();
			driver.findElement(By.xpath("//option[@value='1']")).click();
			Thread.sleep(1000);
//			driver.findElement(By.xpath("//select[@id='month']")).click();
//			Thread.sleep(1000);
			driver.findElement(By.xpath("//select[@id='day']/option[9]]")).click();
//			driver.findElement(By.xpath("//select[@id='month']//option[@value='9']"));
			Thread.sleep(1000);
			driver.findElement(By.xpath("//option[@value='2002']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@value='2']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("jelina@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Alaska@2025");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
		}
		else {
			System.out.println("Iam not in facebook page...");
		}
		
		Thread.sleep(1000);
		
		driver.close();
		
		
	}
}
