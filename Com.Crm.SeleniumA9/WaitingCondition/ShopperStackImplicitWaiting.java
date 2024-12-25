package WaitingCondition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopperStackImplicitWaiting {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/");
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		Thread.sleep(2000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn")));
		
		driver.findElement(By.xpath("//button[text()=\"Login\"]")).click();
		
		driver.findElement(By.xpath("//span[text()=\"Create Account\"]")).click();
		
		driver.close();
	}
}
