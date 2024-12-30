package TestCase1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Puma {
	
	@Test(groups="shoes")
	public void puma() throws InterruptedException {
		WebDriver driver  = new ChromeDriver();
		driver.navigate().to("https://www.puma.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1000);
		System.out.println("Iam in Puma...");
		driver.quit();
	}
}
