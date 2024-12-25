package Waiting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaiting {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.shoppersstack.com/");
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement login = driver.findElement(By.xpath("//button[@id='loginBtn']"));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		
		wait.until(ExpectedConditions.elementToBeClickable(login));
		
		
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Create Account']")));
		
		driver.findElement(By.xpath("//span[text()='Create Account']")).click();
	}
}
