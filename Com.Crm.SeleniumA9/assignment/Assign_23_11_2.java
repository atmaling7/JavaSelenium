package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_23_11_2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		String expexted_url = "https://demowebshop.tricentis.com/";
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com");
		
		String actual_driver = driver.getCurrentUrl();
		
		if (expexted_url.equals(actual_driver)) {
			
			System.out.println("Iam in dws page...!");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@id='pollanswers-1']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@id='pollanswers-2']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@id='pollanswers-3']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@id='pollanswers-4']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@id=\"vote-poll-1\"]")).click();
			Thread.sleep(2000);
		}
		else {
			System.out.println("Iam not in dws page...!");
		}
		
		driver.close();
	}
}
