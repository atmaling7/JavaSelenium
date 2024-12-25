package pop_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.ilovepdf.com/word_to_pdf");
		Thread.sleep(2000);
		
		WebElement file = driver.findElement(By.xpath("//input[@type='file']"));
		
		file.sendKeys("C:\\Users\\hp\\OneDrive\\Documents\\sagar.docx");
		
		
	}
}
