package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign_10_12_2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		String expected_url = "https://www.naukri.com/";
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.naukri.com/");
		
		String actual_url = driver.getCurrentUrl();
		
		Actions act = new Actions(driver);
		
		if (expected_url.equals(actual_url)) {
			
			System.out.println("Iam in naukri's page...!");
			
			driver.findElement(By.id("register_Layer")).click();
			Thread.sleep(1000);
			
			WebElement name = driver.findElement(By.id("name"));
			
			act.sendKeys(name, "Amit Hunaje").perform();
			Thread.sleep(1000);
			
			WebElement email = driver.findElement(By.id("email"));
			act.sendKeys(email, "hunajeamit@gmail.com").perform();
			Thread.sleep(1000);
			
			driver.findElement(By.id("password")).sendKeys("Amit@123");
			Thread.sleep(1000);
			
			driver.findElement(By.id("mobile")).sendKeys("9663229326");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("(//div[@class='radioWrap']/div)[1]")).click();
			Thread.sleep(1000);
			
			
			//for fileuploading it should be enclosed in input tag...
			driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\hp\\OneDrive\\Desktop\\resume\\Atmaling_Hunaje_Java.pdf");
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@class='checkbox-wrap   ']/i")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(2000);
			
		}
		else {
			System.out.println("Iam not in naukri's page...!");
		}
		
		driver.close();
	}
}
