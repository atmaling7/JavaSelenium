package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByCoordinates {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,2000);");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-1000);");
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,5000);");
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,-1000);");
		Thread.sleep(2000);
		driver.close();
	}
}
