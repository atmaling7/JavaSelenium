package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeIndex {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.navigate().to("https://www.dream11.com/");
		
//		driver.switchTo().frame(0);
		
		driver.switchTo().frame("send-sms-iframe");
		
		driver.findElement(By.xpath("//input[@id='regEmail']")).sendKeys("8766904950");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("hamburger")).click();
		
		Thread.sleep(1000);
		
		driver.close();
	}
}
