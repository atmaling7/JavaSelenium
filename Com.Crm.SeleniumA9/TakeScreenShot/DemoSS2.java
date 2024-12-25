package TakeScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DemoSS2 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://twitter.com/");
		
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("//span[text()='Happening now']"));
		
		File from = element.getScreenshotAs(OutputType.FILE);
		
		File to = new File("C:\\Users\\hp\\OneDrive\\Desktop\\Jspiders\\JavaSelenium\\ScreenShots\\twit.png");
		
		FileHandler.copy(from, to);
	}
}
