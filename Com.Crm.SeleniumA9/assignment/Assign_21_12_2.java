package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assign_21_12_2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		
		option.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		
//		driver.findElement(By.xpath("//section[text()='Text Field']")).click();
//		
//		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
//		Thread.sleep(2000);
//		
//		WebElement name = driver.findElement(By.id("name"));
//		WebElement email = driver.findElement(By.id("email"));
//		WebElement pass = driver.findElement(By.id("password"));
//		
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		js.executeScript("arguments[0].value='amit'", name);
//		js.executeScript("arguments[0].value='hunajeait@gmail.com'", email);
//		js.executeScript("arguments[0].value='amit@2025'", pass);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		
		driver.findElement(By.linkText("Disabled")).click();
//		Thread.sleep(2000);
		
		WebElement disabled_box = driver.findElement(By.xpath("//input[@id='submit']"));
		
//		js.executeScript("arguments[0].click();", disabled_box);
//		js.executeScript("arguments[0].removeAttribute('disabled');", disabled_box);
		
		
		driver.findElement(By.id("btn10")).click();
		driver.findElement(By.id("btn13")).click();
		driver.findElement(By.id("btn19")).click();
		
		
		Thread.sleep(2000);
		
		
		WebElement submit = driver.findElement(By.id("submitButton"));
//		WebElement submit1 = driver.findElement(By.xpath("//button[@id='submitButton']"));
		
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", submit);
//		js.executeScript("arguments[0].click();", submit);)
		
//		disabled_box.click();
		
		
	}
}
