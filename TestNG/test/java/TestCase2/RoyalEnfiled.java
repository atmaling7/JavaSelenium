package TestCase2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RoyalEnfiled {
	
	@Test(groups = "bike")
	public void re() throws InterruptedException {
		WebDriver driver  = new ChromeDriver();
		driver.navigate().to("https://www.royalenfield.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1000);
		System.out.println("Iam in RoyalEnfield...");
		driver.quit();
	}
}
