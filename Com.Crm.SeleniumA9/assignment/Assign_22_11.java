package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_22_11 {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("html/body/div[4]/div/div/div[2]/div/ul/li[1]")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("html/body/div[4]/div/div/div[2]/div/ul/li[2]")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("html/body/div[4]/div/div/div[2]/div/ul/li[3]")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("html/body/div[4]/div/div/div[2]/div/ul/li[4]")).click();
		Thread.sleep(2000);
		
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("html/body/div[4]/div/div/div[2]/div/ul/li[1]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div/div[2]/div/div/input")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div/div[2]/div[2]/input[1]")).sendKeys("Alaska");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div/div[2]/div[3]/input[1]")).sendKeys("Jelina");
		Thread.sleep(1000);

		driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div/div[2]/div[4]/input[1]")).sendKeys("alaska@gmail.com");
		Thread.sleep(1000);

//		driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div/div[2]/div[4]/input[1]")).sendKeys("alaska@gmail.com");
//		Thread.sleep(1000);

		driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div/input")).sendKeys("alaska@2025");
		Thread.sleep(1000);

		driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[2]/input")).sendKeys("alaska@2025");
		Thread.sleep(1000);

		driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[4]/input")).click();
		
		
		
		
		Thread.sleep(2000);
		
		driver.close();
		
	}
}
