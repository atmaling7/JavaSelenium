package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/hp/OneDrive/Desktop/Jspiders/JavaSelenium/demo.html");
		
		Thread.sleep(1000);
		
		WebElement multiDropDown = driver.findElement(By.id("multiple_cars"));
		
		Select sel = new Select(multiDropDown);
		
		List<WebElement> options = sel.getOptions();
		
		if (sel.isMultiple()) {
			
			System.out.println("It is a multi select drop-down");
			int i = 0;
			
			for (WebElement web : options) {
				sel.selectByIndex(i++);
				Thread.sleep(1000);
			}
		}
		else {
			System.out.println("It is not a multiselect drop-down");
		}
		
		
//		sel.selectByIndex(8);
//		Thread.sleep(1000);
//		
//		sel.selectByValue("merc");
//		Thread.sleep(1000);
//		
//		sel.selectByVisibleText("Land Rover");
//		Thread.sleep(1000);
//		
//		sel.selectByVisibleText("Jaguar");
//		Thread.sleep(1000);
		
		sel.deselectAll();
		
		
		
//		sel.deselectByIndex(8);
//		Thread.sleep(1000);
//		
//		sel.deselectByValue("merc");
//		Thread.sleep(1000);
//		
//		sel.deselectByVisibleText("Land Rover");
//		Thread.sleep(1000);
//		
//		sel.deselectByVisibleText("Jaguar");
//		Thread.sleep(1000);
		

	}
}
