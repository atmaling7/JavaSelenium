package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByTitle {
	
	public static void main(String[] args) {
		
		String expected_title = "Demo Web Shop";
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		String actual_title = driver.getTitle();
		
		if (expected_title.equals(actual_title)) {
			
			System.out.println("Iam in dws page...");
			
		} else {

			System.out.println("Iam not in dws page...");
			
		}
		
		driver.close();
		
	}
	
}
