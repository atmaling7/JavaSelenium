package assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Yamaha {
	
	public static void main(String[] args) {
		
		//create an instance of 1chromeDriver
		//1.launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//maximixe the browser
		driver.manage().window().maximize();
		
		//enter the url
		driver.get("https://www.yamaha-motor-india.com/");
		
		//close the browser
		driver.close();
	}
}
