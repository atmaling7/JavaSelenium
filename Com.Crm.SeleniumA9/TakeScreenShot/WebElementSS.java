package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElementSS {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		
		WebElement icon = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
		
		File from = icon.getScreenshotAs(OutputType.FILE);
		
		File to = new File("C:\\Users\\hp\\OneDrive\\Desktop\\Jspiders\\JavaSelenium\\ScreenShots\\dws1.png");
		
		FileHandler.copy(from, to);
		
		Thread.sleep(2000);
		
		driver.close();
		
	
	}
}
