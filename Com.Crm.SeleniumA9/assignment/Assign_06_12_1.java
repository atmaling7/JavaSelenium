package assignment;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import UtilityClass.BaseClass;

public class Assign_06_12_1 extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		String expected_url = "https://demowebshop.tricentis.com/";
		
		precondition("chrome");
		
		String actual_url = driver.getCurrentUrl();
		
		Actions act = new Actions(driver);
		
		List<WebElement> l1 = new ArrayList<WebElement>();
		
		if (expected_url.equals(actual_url)) {
			
			System.out.println("Iam in dws page...!");
			
			l1.add(driver.findElement(By.xpath("//a[text()='Register']")));
			
			act.keyDown(Keys.TAB).perform();
			act.keyDown(Keys.TAB).perform();
			act.keyDown(Keys.ENTER).perform();
			
//			l1.add(driver.findElement(By.id("gender-male")));
//			l1.add(driver.findElement(By.id("FirstName")));
//			l1.add(driver.findElement(By.id("LastName")));
//			l1.add(driver.findElement(By.id("Email")));
//			l1.add(driver.findElement(By.id("Password")));
//			l1.add(driver.findElement(By.id("ConfirmPassword")));
			
			WebElement male = driver.findElement(By.id("gender-male"));
			
			WebElement firstName = driver.findElement(By.id("FirstName"));
			
			WebElement lastName = driver.findElement(By.id("LastName"));
			
			WebElement email = driver.findElement(By.id("Email"));
			
			WebElement pass = driver.findElement(By.id("Password"));
			
			WebElement cnf = driver.findElement(By.id("ConfirmPassword"));
			
//			for (WebElement web : l1) {
//				
//				act.sendKeys(web, "heloo").perform();
//				Thread.sleep(1000);
//			}		
			act.sendKeys(male, "").perform();
			Thread.sleep(1000);
			act.sendKeys(firstName, "Amit").perform();
			Thread.sleep(1000);
			act.sendKeys(lastName, "Hunaje").perform();		
			Thread.sleep(1000);
			act.sendKeys(email, "hunajeamit").perform();	
			Thread.sleep(1000);
			act.sendKeys(pass, "qwertyu").perform();		
			Thread.sleep(1000);
			act.sendKeys(cnf, "wertyyrew").perform();			
					
		}
		else {
			
			System.out.println("Iam not in dws page...!");
		
		}
		
		driver.close();
		
	}
}
