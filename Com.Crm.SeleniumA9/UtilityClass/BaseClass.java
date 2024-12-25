package UtilityClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseClass {
	
	public static WebDriver driver = null;
	
	public static void precondition(String browser) throws InterruptedException {
		
		String expexcted_url = "https://demowebshop.tricentis.com/";
		
		//CrossBrowser compatability
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("edge")) {
			
			driver = new EdgeDriver();
		}
		else if (browser.equalsIgnoreCase("InternetExplorer")) {
			driver = new InternetExplorerDriver();
		}
		else if (browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
		else {
			driver = new ChromeDriver();
		}
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
//		String actual_url = driver.getCurrentUrl();
		
//		if (expexcted_url.equals(actual_url)) {
//			
//			System.out.println("iam in dws page...!");
//		}
//		else {
//			System.out.println("Iam not in dws page...!");
//		}
	}
	
public static void precondition(String browser,String website) throws InterruptedException {
		
		String expexcted_url = website;
		
		//CrossBrowser compatability
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("edge")) {
			
			driver = new EdgeDriver();
		}
		else if (browser.equalsIgnoreCase("InternetExplorer")) {
			driver = new InternetExplorerDriver();
		}
		else if (browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
		else {
			driver = new ChromeDriver();
		}
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.navigate().to("\""+website+"\"");
		Thread.sleep(1000);
		

	}
	
	public static boolean verifyByUrl(String url) throws InterruptedException
	{
		precondition("chrome");
		
		String actual_url = driver.getCurrentUrl();
		
		return url.equals(actual_url);
	}
	
	public static boolean verifyByTitle(String title) throws InterruptedException
	{
		precondition("chrome");
		
		String actual_title = driver.getTitle();
		
		return title.equals(actual_title);
	}
	
	public static void login() throws InterruptedException
	{
//		driver = new ChromeDriver();
		
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.id("Password")).sendKeys("admin01");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[id='RememberMe']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
		Thread.sleep(1000);
	}
	
	public static void logout()
	{
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
	}
	
	public static void postCondition()
	{
		driver.quit();
	}
	
	
}
