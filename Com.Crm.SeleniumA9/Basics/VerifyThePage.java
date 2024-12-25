package Basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class VerifyThePage {
	
	public static void main(String[] amit) {
		
		
		String expected_Url = "https://demowebshop.tricentis.com/";
		//1open the browser
		ChromiumDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//enter into url
		driver.get("https://demowebshop.tricentis.com/");
		
		//get actual url
		String actual_Url = driver.getCurrentUrl();
		
		if (expected_Url.equals(actual_Url)) {
			
			System.out.println("Iam in dws page");
			
		} else {

			System.out.println("Iam not in dws page");
			
		}
		
		driver.close();
		
	}
}
