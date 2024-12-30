package com.crm.BaseClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class DwsBase {
	
	public static WebDriver driver = null;
	public static String browser = "chrome";
	
	@BeforeClass
	public void preCondiion() {
		
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
	
	@BeforeMethod
	public void login() {
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("admin01");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	@AfterMethod
	public void logout() {
		driver.findElement(By.className("ico-logout")).click();
	}
	@AfterClass
	public void postCondition() {
		
		driver.quit();
	}
}
























