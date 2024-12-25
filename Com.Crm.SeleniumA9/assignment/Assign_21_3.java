package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_21_3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//enter into dws page
		driver.get("https://demowebshop.tricentis.com/");
		
		//verify the page by using web element
		WebElement radio = driver.findElement(By.id("pollanswers-2"));
		
		if (radio.isDisplayed()) {
			
			System.out.println("Good btn is diplayed...!");
			
			driver.findElement(By.cssSelector("a[class='ico-login']")).click();
			
			driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("amithunaje@gmail.com");
			
			driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("AmitHunaje@2200");
			
			driver.findElement(By.cssSelector("input[id='RememberMe']")).click();
			
			WebElement login = driver.findElement(By.cssSelector("input[value='Log in']"));
			
			if (login.isEnabled()) {
				
				System.out.println("Login button is Enabled...!");
				
				login.click();
			}
		}
		
		Thread.sleep(2000);
		
		driver.close();
	}
}	
