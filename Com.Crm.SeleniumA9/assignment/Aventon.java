package assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Aventon {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.aventon.com/");
		
		driver.quit();
	}
}
