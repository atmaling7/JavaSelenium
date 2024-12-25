package pop_up;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AvoidNotification {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("disable-notifications");
		
		option.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
		ChromeDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.easemytrip.com/");
		Thread.sleep(3000);
		
//		driver.close();
	}
}
