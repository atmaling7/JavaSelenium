package assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAventon {

	public static void main(String[] args) {

		String expected_url = "https://www.aventon.com/";
		String expected_title = "Aventon Bikes: Electric Bikes Redefining Adventure";

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.aventon.com/");

		String actual_url = driver.getCurrentUrl();

		if (expected_url.equals(actual_url)) {

			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		String actual_title = driver.getTitle();

		if (expected_title.equals(actual_title)) {

			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		driver.close();

	}
}
