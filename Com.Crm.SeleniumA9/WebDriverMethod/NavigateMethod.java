package WebDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		//open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//enter into dws page
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		
		driver.get("https://www.redbus.in/");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
	}
}
