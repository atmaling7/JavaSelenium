package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NestedIframe1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demoapps.qspiders.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		
		WebElement sec = driver.findElement(By.xpath("//section[text()='Web Elements']"));
		
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		
		driver.findElement(By.xpath("//a[text()='Multiple iframe']")).click();
		
		WebElement sib1 = driver.findElement(By.xpath("//div[@class='w-1/2']/iframe"));
		
		driver.switchTo().frame(sib1);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("amit");
		
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(1000);
		
		WebElement sib2 = driver.findElement(By.xpath("(//div[@class='w-1/2']/iframe)[2]"));
		
		driver.findElement(By.xpath("//section[text()='Web Elements']")).click();
		
		driver.switchTo().frame(sib2);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("amit");
		
		Thread.sleep(2000);
		
		driver.close();
	}
}
