package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

public class LaunchTheBrowser {
	
	@Test(priority = ' ')
	public void csk() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.chennaisuperkings.com/");
		Thread.sleep(2000);
		driver.close();
	}
	
	@Test(priority = '0')
	public void rcb() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.royalchallengers.com/");
		Thread.sleep(2000);
		driver.close();
		
	}
	@Test(priority = 0, invocationCount = 1, threadPoolSize = 0, enabled = false)
	public void dws() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https:/demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.close();
	}
	
}
