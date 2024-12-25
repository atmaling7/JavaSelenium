package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByTextFunction {
	
	public static void main(String[] args) {
		String ex_title = "Demo Web Shop";
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		String actual_title = driver.getTitle();
		
		if (ex_title.equals(actual_title)) {
			
			System.out.println("Iam in dws page...!");
			
		WebElement poll = driver.findElement(By.xpath("//strong[text()='Community poll']"));
		
		System.out.println(poll);//ADDRESS

		System.out.println(poll.getText());//COMMUNITY POLL
		
//		WebElement a = driver.findElement(By.xpath("//strong[text()='Do you like nopCommerce?']"));
		driver.findElement(By.xpath("//a[contains(text(),'Electronics')]")).click();
		
		driver.navigate().back();
		
		//!By using Xpath by contains
		driver.findElement(By.xpath("//a[contains(text(),'Computers')]")).click();
		
		
		}
		else {
			System.out.println("iam not in dws page...!");
		}
		
//		driver.close();
	}
}
