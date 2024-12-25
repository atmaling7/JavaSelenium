package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

//ScreenShot with dynamic date...
public class SSWithDate {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeDriver driver = new ChromeDriver();
		
		LocalDateTime date = LocalDateTime.now();
		System.out.println(date);//file not found exception(:)
		
		String time = date.toString().replace(':', '-');

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		
		driver.get("https://demowebshop.tricentis.com/books");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File from = driver.getScreenshotAs(OutputType.FILE);
		
		File to = new File("C:\\Users\\hp\\OneDrive\\Desktop\\Jspiders\\JavaSelenium\\ScreenShots\\dws"+time+".png");
		
		FileHandler.copy(from, to);
		
		Thread.sleep(2000);
		
//		driver.close();
		
		
	}
}
