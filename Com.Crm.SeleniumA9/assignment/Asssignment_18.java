package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asssignment_18 {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		String expected_url = "https://demowebshop.tricentis.com/";
		
		String expected_title = "Demo Web Shop. Register";
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		String actual_url = driver.getCurrentUrl();
		
		if (expected_url.equals(actual_url)) {
			
			System.out.println("DWS Papage verified by url");
			
			driver.findElement(By.className("ico-register")).click();
			
			String actual_title= driver.getTitle();
			
			if (expected_title.equals(actual_title)) {
				
				System.out.println("Register page verified by title");
				
				driver.findElement(By.id("gender-male")).click();
				
				driver.findElement(By.id("FirstName")).sendKeys("Amit");
				
				driver.findElement(By.id("LastName")).sendKeys("Hunaje");
				
				driver.findElement(By.id("Email")).sendKeys("hunajeamit@gmail.com");
				
				driver.findElement(By.id("Password")).sendKeys("AmitHunaje*7");
				
				driver.findElement(By.id("ConfirmPassword")).sendKeys("AmitHunaje*7");
				
				driver.findElement(By.id("register-button")).click();
				
				driver.findElement(By.className("register-continue-button")).click();
			}
			else {
				System.out.println("Register page verification failed");
			}
			
			
		}
		else {
			System.out.println("Web page verification failed");
		}
				
	}
}
