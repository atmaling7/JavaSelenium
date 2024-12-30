//• Open the browser
//• Maximize
//• Verify the page by using url
//• Enter into dws page
//• login
//• Scroll Down
//• Click facebook,rss,youtube,google,twitter which is present at the
//bottom of the page by using findelements
//• Click create new Account button in facebook
//• Fill all the details of facebook
//• Logout
//• Close

package Assignment;

import Utility.BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
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

public class TC2 extends BaseClass{
	
	@Test
	public void tc2() throws EncryptedDocumentException, IOException, InterruptedException{
		
		preCondition("chrome");
		verifyByurl("https://demowebshop.tricentis.com/");
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\dws_login.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet2");
		String url = sheet.getRow(1).getCell(0).toString();
		String un = sheet.getRow(1).getCell(1).toString();
		String pass = sheet.getRow(1).getCell(2).toString();
		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).perform();
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='footer']/div/div[4]/ul/li/a"));
		String rss="https://demowebshop.tricentis.com/news/rss/1";
		String parent_handle = driver.getWindowHandle();
		for(WebElement web: links) {
			web.click();
			if (driver.getCurrentUrl().equals(rss)) {
				driver.navigate().back();
			}
		}
		Set<String> handles = driver.getWindowHandles();
		String fb = "https://www.facebook.com/nopCommerce";
		Select sel = null;
		for (String str : handles) {
			driver.switchTo().window(str);
//			System.out.println("HI");
			Thread.sleep(1000);
			if (driver.getCurrentUrl().equals(fb)) {
//				System.out.println("Inside fb");
				driver.findElement(By.xpath("//span[text()='Create new account']")).click();
				Thread.sleep(1000);
				Set<String> fb_handles = driver.getWindowHandles();
				String fb_new="https://www.facebook.com/reg/?entry_point=logged_out_dialog&next=%2FnopCommerce";
				for (String string : fb_handles) {
//					System.out.println("Inside inner for");
					driver.switchTo().window(string);
					if (fb_new.equals(driver.getCurrentUrl())) {
//						System.out.println("In fresh");
						driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("amit");
						driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("patil");
						sel = new Select(driver.findElement(By.id("day")));
						sel.selectByIndex(0);
						sel = new Select(driver.findElement(By.id("month")));
						sel.selectByIndex(10);
						sel = new Select(driver.findElement(By.id("year")));
						sel.selectByValue("2002");
						driver.findElement(By.xpath("//span[@data-name='gender_wrapper']/span[2]/label")).click();
						driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8660387175");
						driver.findElement(By.id("password_step_input")).sendKeys("zgkfcvlsuzd");
						Thread.sleep(1000);
					}
				}
			}
		}
		driver.switchTo().window(parent_handle);
		logout();
		postCondition();
	}
}
