package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_26_11 {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		String expected_url = "https://demowebshop.tricentis.com/";
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		String actual_url = driver.getCurrentUrl();
		
		if (expected_url.equals(actual_url)) {
			
			System.out.println("Iam in dws page...!");
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
			
			Thread.sleep(1000);
			
//			String price1 = driver.findElement(By.xpath("//a[text()='3rd Album']/../following-sibling::div[3]/div/span")).getText();
//			
//			System.out.println(price1);
//			
//			String price2 = driver.findElement(By.xpath("//a[text()='Music 2']/../following-sibling::div[3]/div/span")).getText();
//			
//			System.out.println(price2);
//			
//			String price3 = driver.findElement(By.xpath("(//a[text()='Music 2'])[2]/../following-sibling::div[3]/div/span")).getText();
//			
//			System.out.println(price3);
			
			List<WebElement> l1 = driver.findElements(By.xpath("//div[@class='product-grid']/div/div/div[2]/div[3]/div/span"));
			
			for (WebElement element : l1) {
				
				System.out.println(element.getText());
			}
			
		}else {
			System.out.println("Iam not in dws page...!");
		}
		
		
		driver.close();
		
	}
}
