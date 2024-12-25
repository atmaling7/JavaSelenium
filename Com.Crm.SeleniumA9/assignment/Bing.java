package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Bing {
	
	public static void main(String[] args) throws InterruptedException {
		
		String expected_title = "Sign in to Bing";
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://bing.com/");
		
//		WebElement sign_in = driver.findElement(By.className("id_button "));
		Thread.sleep(5000);
		
		WebElement id = driver.findElement(By.id("id_l"));
		
//		System.out.println(id.isDisplayed());
		
		id.click();
		
		Thread.sleep(2000);
		
		WebElement sign_in = driver.findElement(By.className("b_toggle"));
		
		System.out.println(sign_in.isDisplayed());
		
		sign_in.click();
		
		String actual_title = driver.getTitle();
		
		//verifying the login page
		if (expected_title.equals(actual_title)) {
			
			Thread.sleep(2000);
			
		WebElement email = driver.findElement(By.id("i0116"));
		
		System.out.println(email.isDisplayed());
		
			if (email.isDisplayed()) {
				
				email.sendKeys("hunajeamit@gmail.com");
				
//				Thread.sleep(1000);
				
				driver.findElement(By.id("idSIButton9")).click();
				
				//verify the email
				
//				Thread.sleep(2000);
//				System.out.println(driver.findElement(By.id("userDisplayName")));
				Thread.sleep(1000);
				
				WebElement pass =  driver.findElement(By.id("i0118"));
				
				System.out.println(pass.isDisplayed());
				
				driver.findElement(By.id("i0118")).sendKeys("Amit@123");
				
				WebElement sign_pass= driver.findElement(By.id("idSIButton9"));
				
//				System.out.println(sign_pass.isDisplayed());
				
				sign_pass.click();
			}
		}
//		name="passwd"
		
		
		
//		System.out.println(sign_in.isDisplayed());
		
//		driver.findElement(By.className("id_button"));

	}
}
