package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledCheckB {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demoapps.qspiders.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		
//		driver.findElement(By.xpath("//section[text()='Radio Button']")).click();
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		
		driver.findElement(By.xpath("//a[text()='Disabled']")).click();
		Thread.sleep(2000);
		
//		WebElement name = driver.findElement(By.id("name"));
//		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		
		WebElement submit = driver.findElement(By.xpath("//button[@id='submitButton']"));
		
		js.executeScript("arguments[0].click()", submit);
		
		driver.findElement(By.id("btn11")).click();
		
//		WebElement upi = driver.findElement(By.xpath("//input[@id='attended31']"));
		
//		js.executeScript("arguments[0].click();", upi);
		
//		js.executeScript("arguments[0].removeAttribute('disabled')", upi);
		
//		upi.click();
//		
//		js.executeScript("arguments[0].value='amit'", name);
//		
//		WebElement email = driver.findElement(By.id("email"));
//		
//		js.executeScript("arguments[0].value='hunajeatmaling@gmail.com'", email);
//		
//		WebElement pass = driver.findElement(By.id("password"));
//		
//		js.executeScript("arguments[0].value='amit@2025'", pass);
//		
//		driver.findElement(By.xpath("//input[@id='password']/../span/span")).click();
		
		
	}
}
