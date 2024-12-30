
package Utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseClass {
	
	public static WebDriver driver = null;
	
	public static void preCondition(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			
			driver =new ChromeDriver();
			
		}
		else if (browser.equalsIgnoreCase("edge")) {
			
			driver =new EdgeDriver(); 
			
		}
		else if (browser.equalsIgnoreCase("internetexplorer")) {
			
			driver =new InternetExplorerDriver();
			
		}
		else if (browser.equalsIgnoreCase("safari")) {
			
			driver =new SafariDriver(); 
			
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			
			driver =new FirefoxDriver();
		}
			
		else {
			System.out.println("Invalid input");
		}
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public static void verifyByurl(String url) {
		if (driver.getCurrentUrl().equals(url)) {
			System.out.println("Iam in dwspage...!");
		}else {
			System.out.println("Iam not in dws page...!");
		}
	}
	
	public static void login(String userName,String password)
	{
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys(userName);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	
	public static void logout() throws InterruptedException
	{
		try {
			driver.findElement(By.className("ico-logout")).click();
			
			driver.quit();
		} catch (Exception e) {
			System.out.println("Please login...");
			Thread.sleep(1000);
		}
	}
	
	public static void postCondition()
	{
		driver.quit();
	}
}	
