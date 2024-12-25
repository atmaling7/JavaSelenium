package assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Hero_MotorCorp {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.heromotocorp.com/en-in.html");
		
		driver.close();
	}
}
