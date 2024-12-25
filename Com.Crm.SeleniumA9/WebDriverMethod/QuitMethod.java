package WebDriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
		
		if (facebook.isEnabled()) {
			
			Thread.sleep(2000);
			
			System.out.println("Facebook is enabled...!");
			
			facebook.click();
		}
		else {
			System.out.println("Facebook is disabled...!");
		}
		Thread.sleep(2000);
		
		driver.quit();
	}
}
