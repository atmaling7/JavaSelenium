package TestCase1;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Nike {
	
	@Test(groups="shoes")
	public void nike() throws InterruptedException {
		WebDriver driver  = new ChromeDriver();
		driver.navigate().to("https://www.nike.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1000);
		System.out.println("Iam in Nike...");
		driver.quit();
	}
}
