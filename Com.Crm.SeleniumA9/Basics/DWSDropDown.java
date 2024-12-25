package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import UtilityClass.BaseClass;

public class DWSDropDown extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		precondition("chrome");
		
		login();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		
		WebElement sort_by = driver.findElement(By.id("products-orderby"));
		
		Select sel = new Select(sort_by);
		
		List<WebElement> options = sel.getOptions();
		
		int i = 0;
		
		for (WebElement web : options) {
			
			sort_by = driver.findElement(By.id("products-orderby"));
			
			 sel = new Select(sort_by);
			 
			 sel.selectByIndex(i++);
			 Thread.sleep(1000);
		}
		logout();
		
		postCondition();
	}
}
