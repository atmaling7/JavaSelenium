package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Thalapthy {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://x.com/KapilSharmaK9?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor");
		
		Thread.sleep(3000);
		
		WebElement icon = driver.findElement(By.xpath("(//div[@class='css-175oi2r r-172uzmj r-1pi2tsx r-13qz1uu r-o7ynqc r-6416eg r-1ny4l3l'])[1]"));
		
		File from  = icon.getScreenshotAs(OutputType.FILE);
		
		File to = new File("C:\\Users\\hp\\OneDrive\\Desktop\\Jspiders\\JavaSelenium\\ScreenShots\\kapil.png");
		
		FileHandler.copy(from, to);
		
		Thread.sleep(2000);
		
		driver.close();
		
		
	}
}
