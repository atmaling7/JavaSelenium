package assignment;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign_05_12 {
	
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Thread.sleep(1000);
		
		List<WebElement> sources1 = new ArrayList<WebElement>();
		
		List<WebElement> sources = driver.findElements(By.xpath("//div[@id='dropContent']/div"));
		
		List<WebElement> targets = driver.findElements(By.xpath("//div[@class='dragableBoxRight']"));
		
		for (int i =0 ; i < sources.size(); i++) {
			
			if (i%2 != 0) {
				
				sources1.add(sources.get(i));
			}
		}
		
		Actions act = new Actions(driver);
		
		int i = 1;
		 for (WebElement web: sources1) {
			
			 WebElement target = driver.findElement(By.id("box10"+(i++)));
			
//			 System.out.println(web.getText());
//			 System.out.println(target.getText());
			 
			 act.dragAndDrop(web, target).perform();
			 Thread.sleep(1000);
		}
		
		
		
	
		
		driver.close();		

	}
//sources.add(driver.findElement(By.xpath("//div[@class='dragableBox'])["+i+"]")));
}

