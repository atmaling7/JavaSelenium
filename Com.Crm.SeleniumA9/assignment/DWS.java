package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
//		WebElement community = driver.findElement(By.linkText("Commuity poll"));
		WebElement community = driver.findElement(By.className("title"));
		
		String data = community.getText();
		
		System.out.println(data);
		
		Thread.sleep(5000);
		
		driver.close();
	}
}
