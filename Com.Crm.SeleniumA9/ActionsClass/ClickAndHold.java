package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Actions act = new Actions(driver);
		
		WebElement rome = driver.findElement(By.id("box6"));
		
		Thread.sleep(1000);
		
		WebElement italy = driver.findElement(By.xpath("//div[@id='box106']"));
		
		act.clickAndHold(rome).release(italy).perform();
		
		Thread.sleep(2000);
		
		driver.close();
		
	}
}
