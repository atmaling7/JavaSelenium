package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledElement {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement jdk = driver.findElement(By.linkText("jdk-17.0.13_linux-x64_bin.deb"));
		
		js.executeScript("arguments[0].scrollIntoView(false);", jdk);
		
		jdk.click();
		Thread.sleep(1000);
		WebElement disabled_ele = driver.findElement(By.linkText("Download jdk-17.0.13_linux-x64_bin.deb"));
		
		js.executeScript("arguments[0].click()", disabled_ele);
		Thread.sleep(2000);
		
		driver.quit();
	}
}
