package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextToHiddenField {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement custom_gender = driver.findElement(By.id("custom_gender"));
		
		js.executeScript("arguments[0].value='manjulika'", custom_gender);
		Thread.sleep(2000);
		

	}
}
