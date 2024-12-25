package QspidersDemoApp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement target = driver.findElement(By.xpath("//section[text()='Web Elements']"));
		
		Actions act = new Actions(driver);
	
//		act.moveToElement(target).click().perform();
		act.click(target).perform();
		
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Click & Hold']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		act.clickAndHold(driver.findElement(By.id("circle"))).perform();
		act.contextClick(driver.findElement(By.id("circle"))).perform();
		
		
	}
}
