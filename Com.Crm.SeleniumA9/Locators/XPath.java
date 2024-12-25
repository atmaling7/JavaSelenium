package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[1]/a")).click();
		
		driver.findElement(By.xpath("html/body/div[4]/div/div/div[3]/form/input")).sendKeys("mobile");
		
		driver.findElement(By.xpath("html/body/div[4]/div/div/div[3]/form/input[2]")).click();
		
		Thread.sleep(2000);
		
		driver.close();
	}
}
