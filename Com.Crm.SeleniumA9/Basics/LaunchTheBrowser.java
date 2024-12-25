package Basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchTheBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		// Launch the browser
		//using instace of ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		//2 Using upcasting ChromeDriver to WebDriver
//		WebDriver driver = new ChromeDriver();
		
		//to maximize the browser
		driver.manage().window().maximize();
		
		//to minimize the browser
//		driver.manage().window().minimize();
		
		//Enter the url
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.id("small-searchterms")).sendKeys("mobile");
		
		//using navigate().to("url");
//		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//close the browser
		driver.close();
		//driver.quit();
		
	}
}
