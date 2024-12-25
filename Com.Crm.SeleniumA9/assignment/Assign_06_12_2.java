package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign_06_12_2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demoapps.qspiders.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//main[@data-aos='zoom-in'])[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//form/div/input)[1]")).sendKeys("Amit");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//form/div/input)[2]")).sendKeys("hunajeamit@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[name=\"password\"]")).sendKeys("Amit@2002");
		Thread.sleep(1000);
		
		driver.close();
//		Actions act = new Actions(driver);
		
//		act.keyDown(Keys.TAB).perform();
//		Thread.sleep(1000);
		
//		act.keyDown(ui, "").perform();
		
	}
}
