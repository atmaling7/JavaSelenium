package ActionsClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Thread.sleep(1000);
		
		Actions act = new Actions(driver);
		
		WebElement source = driver.findElement(By.id("box6"));
		Thread.sleep(1000);
		WebElement target = driver.findElement(By.xpath("//div[@id='box106']"));
		
		List<WebElement> sources = driver.findElements(By.className("dragableBox"));
		
		List<WebElement> targets = driver.findElements(By.className("//div[@class='dragableBoxRight']"));
		
		for (WebElement web : sources) {
			
			System.out.println(web);
		}
		
		act.dragAndDrop(source, target).perform();
		
		Thread.sleep(2000);
		

	}
}
