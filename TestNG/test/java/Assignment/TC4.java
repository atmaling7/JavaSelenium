//• Open the browser
//• Maximize
//• Enter into dws page
//• Verify the page by using url
//• login
//• Click digital download link
//• Select all the element inside sort By ,view as ,display drop down
//• logout
//• close


package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Utility.BaseClass;

public class TC4 extends BaseClass{
	
	public static Select sel = null;
	@Test
	public void tc4() throws EncryptedDocumentException, IOException, InterruptedException {
		
		preCondition("chrome");
		verifyByurl("https://demowebshop.tricentis.com/");
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\dws_login.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet2");
		String url = sheet.getRow(1).getCell(0).toString();
		String un = sheet.getRow(1).getCell(1).toString();
		String pass = sheet.getRow(1).getCell(2).toString();
		login(un, pass);
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		sel = new Select(driver.findElement(By.id("products-orderby")));
		List<WebElement> options1 = sel.getOptions();
		int i =0;
		for (WebElement web : options1) {
			try {
				sel.selectByIndex(i++);
			} catch (Exception e) {
				driver.navigate().back();
			}
		}
		sel = new Select(driver.findElement(By.id("products-pagesize")));
		List<WebElement> options2 = sel.getOptions();
		int j =0;
		for (WebElement web : options2) {
			try {
				sel.selectByIndex(j++);
			} catch (Exception e) {
				driver.navigate().back();
			}
		}
		sel = new Select(driver.findElement(By.id("products-viewmode")));
		List<WebElement> options3 = sel.getOptions();
		int k =0;
		for (WebElement web : options3) {
			try {
				sel.selectByIndex(k++);
			} catch (Exception e) {
				driver.navigate().back();
			}
		}
		logout();
		postCondition();
	}
}
