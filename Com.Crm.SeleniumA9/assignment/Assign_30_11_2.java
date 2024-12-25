package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import UtilityClass.BaseClass;

public class Assign_30_11_2 extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
//		precondition("chrome", "www.facebook.com");
		
		ChromeDriver driver =new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("Create new account")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("amit");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("amit@gmail.com");
		Thread.sleep(1000);
		
		WebElement day = driver.findElement(By.name("birthday_day"));
		Thread.sleep(1000);
		
		Select sel1 = new Select(day);
		
		int i = 0;
		List<WebElement> day_options = sel1.getOptions();
		
		sel1.selectByValue("10");
		
		
		WebElement month = driver.findElement(By.cssSelector("#month"));
		Thread.sleep(1000);
		
		Select sel2 = new Select(month);
		Thread.sleep(1000);
		
		sel2.selectByValue("1");
		List<WebElement> options = sel2.getOptions();
		
		
		Thread.sleep(1000);
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		Thread.sleep(1000);
		
		Select sel3 = new Select(year);
		Thread.sleep(1000);
		
		sel3.selectByVisibleText("2002");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("reg_email__")).sendKeys("9663229326");
		Thread.sleep(1000);
		
		
		driver.findElement(By.cssSelector("#password_step_input")).sendKeys("Amit@2002");
		
	Thread.sleep(1000);
	
	driver.quit();
	}
}
