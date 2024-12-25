package pop_up;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopup {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.agoda.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='check-in-box']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@data-selenium-date='2024-12-10']")).click();
		Thread.sleep(2000);
		
//		for (int i = 0; i < 3; i++) {
//			
//			driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
//		}
//		
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//span[@data-selenium-date='2025-03-10']")).click();
//		
//		Thread.sleep(2000);
//		
//		driver.close();
		
		for (;;) {
			
			try {
				driver.findElement(By.xpath("//span[@data-selenium-date='2025-03-10']")).click();
				break;
				
			} catch (Exception e) {
				driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
			}
		}
	}
}
