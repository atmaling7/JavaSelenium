package assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign_09_12_1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//get into url
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		
		Thread.sleep(2000);
		
		//find the first alert element
		 WebElement alert1 = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
		
		 //create an object of action class and assign driver as parameter
		Actions act = new Actions(driver);
		
//		act.moveToElement(alert1).keyDown(Keys.ENTER).perform();
		
		driver.findElement(By.id("OKTab")).click();
		
		//handle the popup to alert class variable
		Alert alt = driver.switchTo().alert();
		
		//display the first alert content
		System.out.println(alt.getText());
		Thread.sleep(2000);
		
		//accept the popup
		alt.accept();
		
		Thread.sleep(2000);
		
		WebElement alert2 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		
//		act.moveToElement(alert2).keyDown(Keys.ENTER).perform();
		alert2.click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@id='CancelTab']/button")).click();
		Thread.sleep(2000);
		
		Alert alt2 = driver.switchTo().alert();
		
		System.out.println(alt2.getText());
		
		alt2.dismiss();
		Thread.sleep(1000);
		
		WebElement alert3 = driver.findElement(By.linkText("Alert with Textbox"));
		
		alert3.click();
		
		driver.findElement(By.xpath("//div[@id='Textbox']")).click();
		
		Alert alt3 = driver.switchTo().alert();
		Thread.sleep(1000);
		
		System.out.println(alt3.getText());
		
		alt3.sendKeys("Automated boy...!");
		Thread.sleep(2000);
		
		alt3.accept();
		Thread.sleep(1000);
		
		driver.close();
		
	}
}
