package Projects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato_1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		String expected_url = "https://www.zomato.com/";
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.zomato.com/");
		Thread.sleep(2000);
		
		String actual_url = driver.getCurrentUrl();
		
		if (expected_url.equals(actual_url)) {
			
			System.out.println("Yes i got the page...!");
			System.out.println("**************");
			
			List<WebElement> navbar = driver.findElements(By.xpath("//li[@tabindex='0']/a"));
			
			for(WebElement web: navbar)
			{	
				System.out.println(web.isDisplayed());
				System.out.println(web.isEnabled());
				System.out.println("**************");
				System.out.println(web.getText());
				
//				if (web.isEnabled()) {
//					
//					web.click();
//					Thread.sleep(2000);
//					driver.navigate().back();
//					Thread.sleep(1000);
//				}
				
			}
		}
		else {
			System.out.println("Iam hungry amit...!");
		}
		
		
		driver.quit();
	}
}
