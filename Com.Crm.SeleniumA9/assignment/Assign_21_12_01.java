package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign_21_12_01 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String parent = driver.getWindowHandle();
		
		WebElement feedback = driver.findElement(By.linkText("FEEDBACK"));
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.SHIFT).click(feedback).perform();
		
		Set<String> handles = driver.getWindowHandles();
		
		String feedback_title = "SkillRary Courses";
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		for(String str: handles)
		{
			driver.switchTo().window(str);
			
			if (feedback_title.equals(driver.getTitle())) {
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				WebElement disabled_ele = driver.findElement(By.xpath("//input[@class='form-control']"));
				
				Thread.sleep(2000);
				
				js.executeScript("arguments[0].value='subscribed'", disabled_ele);
				
			}
		}
		driver.quit();
	}
}
