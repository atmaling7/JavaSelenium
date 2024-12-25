package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement createAcc = driver.findElement(By.partialLinkText("C"));
//		WebElement createAcc = driver.findElement(By.linkText("Create new account"));
		
		String data = createAcc.getText();//to get the linktext
		
		System.out.println(data);
		
		Thread.sleep(5000);
		
		driver.close();
	}
}
