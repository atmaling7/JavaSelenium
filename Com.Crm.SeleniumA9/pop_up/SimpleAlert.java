package pop_up;

import java.awt.Robot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import UtilityClass.BaseClass;

public class SimpleAlert extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		precondition("chrome");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(100);
		
		//switch the controller to alert
		
		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());
		
		alt.accept();
		Thread.sleep(2000);
		
//		driver.close();
		
	}
}
