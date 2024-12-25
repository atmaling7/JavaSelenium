package WebDriverMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
//		List<WebElement> links = driver.findElements(By.xpath("//input[@type='radio']"));
//		
//		for (WebElement web : links) {
//			
//			web.click();
//			Thread.sleep(1000);
//		}
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='header-links']/ul/li/a"));
		
		for (WebElement web: links) {
			
			web.click();
			
			Thread.sleep(2000);
			
			driver.navigate().back();
		}
	}
}
