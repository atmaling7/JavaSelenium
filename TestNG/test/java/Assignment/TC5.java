//• Open the browser
//• Maximize
//• Verify the page by using url
//• Enter into dws page
//• login
//• Scroll Down
//• Click facebook,rss,youtube,google,twitter which is present at the
//bottom of the page by using findelements
//• Click create new Account button in facebook
//• Click create new Account button in twitter
//• Logout
//• Close

package Assignment;

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

import Utility.BaseClass;

public class TC5 extends BaseClass{
	@Test
	public void tc5() throws InterruptedException, EncryptedDocumentException, IOException {
		
		preCondition("chrome");
		verifyByurl("https://demowebshop.tricentis.com/");
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\dws_login.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet2");
		String url = sheet.getRow(1).getCell(0).toString();
		String un = sheet.getRow(1).getCell(1).toString();
		String pass = sheet.getRow(1).getCell(2).toString();
		
		login(un, pass);	
		String parent = driver.getWindowHandle();
			//for each click on social links
			List<WebElement> social_links = driver.findElements(By.xpath("//div[@class='footer']/div/div[4]/ul/li/a"));
			String rss = "https://demowebshop.tricentis.com/news/rss/1";
			for (WebElement web : social_links) {
				web.click();
				String cur_url = driver.getCurrentUrl();		
				if (rss.equals(cur_url)) {
					driver.navigate().back();
					Thread.sleep(1000);
				}
			}
			driver.switchTo().window(parent);
			String twitter = "https://x.com/nopCommerce";
			Set<String> handles = driver.getWindowHandles();
			for (String string : handles) {
				driver.switchTo().window(string);
				String curr_url = driver.getCurrentUrl();
				if (curr_url.equals(twitter)) {
					Thread.sleep(2000);
					driver.findElement(By.xpath("//span[contains(text(),'Create account')]")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//div[@class='css-146c3p1 r-bcqeeo r-1ttztb7 r-qvutc0 r-37j5jr r-135wba7 r-16dba41 r-1awozwy r-6koalj r-1inkyih r-13qz1uu']/input")).sendKeys("Amit");
					Thread.sleep(1000);
					driver.findElement(By.xpath("(//div[@class='css-146c3p1 r-bcqeeo r-1ttztb7 r-qvutc0 r-37j5jr r-135wba7 r-16dba41 r-1awozwy r-6koalj r-1inkyih r-13qz1uu']/input)[2]")).sendKeys("amit1@gmail.com");
					Thread.sleep(1000);
					WebElement month = driver.findElement(By.id("SELECTOR_1"));
					Select sel = new Select(month);
					sel.selectByValue("11");	
					Thread.sleep(1000);
					WebElement day = driver.findElement(By.id("SELECTOR_2"));
					Select sel1 = new Select(day);
					sel1.selectByValue("1");
					Thread.sleep(1000);
					WebElement year = driver.findElement(By.id("SELECTOR_3"));
					Select sel2 = new Select(year);
					sel2.selectByValue("2002");
					Thread.sleep(1000);
					driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
				}
			}
			driver.switchTo().window(parent);
			Thread.sleep(1000);
			driver.findElement(By.className("ico-logout")).click();
			postCondition();
	}
}
