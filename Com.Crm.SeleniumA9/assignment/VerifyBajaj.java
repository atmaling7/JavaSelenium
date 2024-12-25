package assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyBajaj {
	
	public static void main(String[] args) {
		
		String expected_url = "https://www.bajajauto.com/";
		
		String expected_title = "Leading manufacturer of bikes & 3-wheelers | Bajaj Auto";
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.bajajauto.com");
		
		String actual_url = driver.getCurrentUrl();
		
		if (expected_url.equals(actual_url)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		String acutal_title = driver.getTitle();
		
		if (expected_title.equals(acutal_title)) {
			System.out.println("Pass");
		} else {
			System.out.println("fail");
		}
		
		driver.close();
	}
}
