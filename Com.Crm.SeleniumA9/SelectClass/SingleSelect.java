package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/hp/OneDrive/Desktop/Jspiders/JavaSelenium/demo.html");
		
		Thread.sleep(1000);
		
		WebElement single = driver.findElement(By.id("standard_cars"));
		
		Thread.sleep(1000);
		
		Select sel = new Select(single);
		
		List<WebElement> elements = sel.getOptions();
		
		int i = 0;
		for(WebElement web: elements)
		{
			sel.selectByIndex(i++);
			Thread.sleep(1000);
		}
		
		
//		sel.selectByValue("jgr");
//		Thread.sleep(1000);
//		sel.deselectByIndex(8);
		Thread.sleep(1000);
		driver.close();
	}
}
