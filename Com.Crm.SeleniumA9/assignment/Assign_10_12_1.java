package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_10_12_1 {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.easemytrip.com/");
		
		Thread.sleep(1000);
		
		Robot bot = new Robot();
		
		bot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		bot.keyRelease(KeyEvent.VK_TAB);
		bot.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//DIV[@id='dvfarecal']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//li[@id='snd_2_10/12/2024']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("rdatelbl")).click();
		Thread.sleep(1000);
		
		while(true)
		{
			try {
				driver.findElement(By.xpath("//li[@id='trd_1_10/03/2025']")).click();
				break;
			} catch (Exception e) {
				driver.findElement(By.id("img2Nex")).click();
				Thread.sleep(1000);
			}
		}
		Thread.sleep(1000);
		driver.close();
		
	}
}
