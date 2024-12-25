package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class assign_21_2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		String expected_url = "https://demowebshop.tricentis.com/";
		
		String expected_title = "Demo Web Shop. Register";
		
		//open the browser
		ChromeDriver driver = new ChromeDriver();
		
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//enter into dws site
		driver.get("https://demowebshop.tricentis.com/");
		
		//verify the page using url
		String actual_url = driver.getCurrentUrl();
		
		if (expected_url.equals(actual_url)) {
			
			System.out.println("Iam in dws page");
			
			driver.findElement(By.partialLinkText("Register")).click();
			
			String actual_title = driver.getTitle();
			
			if (expected_title.equals(actual_title)) {
				
				System.out.println("Iam in register page");
				
				Thread.sleep(2000);
				
				//click on male using css selector
				driver.findElement(By.cssSelector("input[id='gender-male']")).click();
				
				driver.findElement(By.cssSelector("input[id='FirstName']")).sendKeys("Amit");
				
				driver.findElement(By.cssSelector("input[id='LastName']")).sendKeys("Patil");
				
				driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("amithunaje@gmail.com");
				
				driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("AmitHunaje@2200");
				
				driver.findElement(By.cssSelector("input[id='ConfirmPassword']")).sendKeys("AmitHunaje@2200");
			}
			else {
				System.out.println("Iam not in register page");
			}
			
		}
		
		Thread.sleep(2000);
		
		driver.close();
		
		
	}
}
