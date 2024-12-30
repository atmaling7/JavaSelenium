package TestCase1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Adidas {
	
	@Test(groups="shoes")
	public void adidas() throws InterruptedException {
		WebDriver driver  = new ChromeDriver();
		driver.navigate().to("https://www.adidas.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1000);
		System.out.println("Iam in Adidas...");
		driver.quit();
	}
}
