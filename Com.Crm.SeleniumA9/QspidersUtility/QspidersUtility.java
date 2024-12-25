package QspidersUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class QspidersUtility {
	
	public static WebDriver driver = null;
	
	public static void precondition(String browser) throws InterruptedException
	{
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("edge")) {
			
			driver = new EdgeDriver();
		}
		else if (browser.equalsIgnoreCase("InternetExplorer")) {
			driver = new InternetExplorerDriver();
		}
		else if (browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
		else {
			driver = new ChromeDriver();
		}
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.navigate().to("https://demoapps.qspiders.com/");
		Thread.sleep(1000);
		
	}
}
