package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/hp/OneDrive/Desktop/Jspiders/JavaSelenium/demo.html");
		Thread.sleep(2000);
		
		WebElement cars = driver.findElement(By.id("multiple_cars"));
		
		Select sel = new Select(cars);
		
		System.out.println(sel.isMultiple());
		
		List<WebElement> options = sel.getOptions();
		
		int i = 0;
		for(WebElement web: options)
		{
			sel.selectByIndex(i++);
			Thread.sleep(2000);
		}
		
		int j=0;
		for (WebElement web : options) {
			
			sel.deselectByIndex(j++);
		}
	}
}
