//• Open the browser
//• Maximize
//• Verify the page by using url
//• Enter into dws page
//• login
//• Scroll Down
//• Click facebook,rss,youtube,google,twitter which is present at the
//bottom of the page by using findelements
//• Click create new Account button in twitter
//• Fill all the details of twitter
//• Logout
//• Close

package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Utility.BaseClass;

@Test
public class TC6 extends BaseClass{
	
	public void tc6() throws EncryptedDocumentException, IOException, InterruptedException {

		preCondition("chrome");
		verifyByurl("https://demowebshop.tricentis.com/");
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\dws_login.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet2");
		String url = sheet.getRow(1).getCell(0).toString();
		String un = sheet.getRow(1).getCell(1).toString();
		String pass = sheet.getRow(1).getCell(2).toString();
		String parent = driver.getWindowHandle();
		login(un, pass);
			Actions act = new Actions(driver);
			act.keyDown(Keys.END);
			String rss = "https://demowebshop.tricentis.com/news/rss/1";
			List<WebElement> links = driver.findElements(By.xpath("//div[@class='footer']/div/div[4]/ul/li/a"));
			for (WebElement web : links) {
				web.click();
				Thread.sleep(1000);
				if (driver.getCurrentUrl().equals(rss)) {		
					driver.navigate().back();
				}
			}
			Set<String> handles = driver.getWindowHandles();
			String fburl = "https://www.facebook.com/nopCommerce";
			String twitter = "https://x.com/nopCommerce?mx=2";
			String yt = "https://www.youtube.com/user/nopCommerce";
			for (String string : handles) {
				driver.switchTo().window(string);
//				System.out.println(string);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				if(driver.getCurrentUrl().equals(fburl))
				{
					System.out.println("FaceBook");
					driver.findElement(By.xpath("//span[contains(text(),'Create new account')]")).click();
				}
				else if(driver.getCurrentUrl().equals(twitter)) {
					System.out.println("twitter");
					driver.findElement(By.xpath("//span[text()='Create account']")).click();
					driver.findElement(By.xpath("//input[@name='name']")).sendKeys("amit");
					driver.findElement(By.xpath("//input[@name='email']")).sendKeys("amithunaje@gmail.com");
					Select sel = new Select(driver.findElement(By.id("SELECTOR_1")));
					sel.selectByIndex(11);
					sel = new Select(driver.findElement(By.id("SELECTOR_2")));
					sel.selectByIndex(1);
					sel = new Select(driver.findElement(By.id("SELECTOR_3")));
					sel.selectByValue("2002");
					
				}
				else if (driver.getCurrentUrl().equals(yt)) {
					System.out.println("Youtube");
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					WebElement search = driver.findElement(By.xpath("//input[@name='search_query']"));					
					search.click();		
					search.sendKeys("India's got latent");
				}
			}
			driver.switchTo().window(parent);
			logout();
			postCondition();

	}
}
