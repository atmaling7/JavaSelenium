package assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAprilia {
	
	public static void main(String[] args) {
		
		String expected_url = "https://www.aprilia.com/us_EN/";
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.aprilia.com/us_EN/");
		
		String actual_url = driver.getCurrentUrl();	
		
		
		//!Verify the browser by url
//		if (expected_url.equals(actual_url)) {
//			System.out.println("Pass");
//		}
//		else {
//			System.out.println("fail");
//		}
		
		//!Verify the browser by title
		
		String expected_title = "Aprilia Motorcycles #BeARacer";
		
		String actual_title = driver.getTitle();
		
		if (expected_title.equals(actual_title)) {
			
			System.out.println("Pass");
			
		} else {
				
			System.out.println("fail");
		}
		
		driver.close();
		
	}
	
}	
