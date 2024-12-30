package TestCase2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Bajaj {
	
	@Test(groups = "bike")
	public void bajaj() throws InterruptedException {
		WebDriver driver  = new ChromeDriver();
		driver.navigate().to("https://www.bajaj.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1000);
		System.out.println("Iam in Bajaj...");
		driver.quit();
	}
}
