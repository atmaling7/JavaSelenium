package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import UtilityClass.BaseClass;

public class Myntra extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		Thread.sleep(1000);
		
		WebElement beauty = driver.findElement(By.xpath("//a[text()='Beauty']"));
		Thread.sleep(1000);
		
		act.moveToElement(beauty).perform();
		Thread.sleep(1000);
		act.click();
		
		driver.findElement(By.xpath("//a[text()='Face Wash']")).click();
		
		Thread.sleep(1000);
		
		driver.close();
	}
}
