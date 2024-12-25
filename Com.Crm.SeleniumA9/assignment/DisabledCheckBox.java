package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledCheckBox {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		
		driver.findElement(By.xpath("//section[text()='Text Field']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//section[text()='Check Box']")).click();
		driver.findElement(By.xpath("//section[text()='Web Table']")).click();
		
//		driver.findElement(By.xpath("//a[text()='Disabled']")).click();
		driver.findElement(By.xpath("//a[text()='Table With Checkbox']")).click();
		Thread.sleep(2000);
		
//		WebElement whatsapp = driver.findElement(By.xpath("(//input[@name='Domain'])[2]"));
		 WebElement disabled = driver.findElement(By.id("deleteButton"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		driver.findElement(By.id("subm")).click();
//		js.executeScript("arguments[0].click();", whatsapp);
		
		Thread.sleep(2000);
		js.executeScript("arguments[0].click()", disabled);
	}
}
