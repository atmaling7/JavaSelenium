package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_26_11_2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.navigate().to("https://demoapps.qspiders.com/ui/button/buttonDisabled?sublist=4");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		
		driver.findElement(By.linkText("Disabled")).click();
		
		WebElement disabled_box = driver.findElement(By.xpath("//input[@id='submit']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", disabled_box);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.findElement(By.xpath("//a[contains(text(),'Apparel & Shoes')]")).click();
//		
//		List<WebElement> l1 = driver.findElements(By.xpath("//div[@class='product-grid']/div/div/div[2]/div[3]/div/span"));
//		
//		for (WebElement element : l1) {
//			
//			System.out.println(element.getText());
//		}
//		
//		driver.close();
	}
}
