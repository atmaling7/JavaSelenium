//• Open the browser
//• Maximize
//• Enter into dws page
//• Verify the page by using url
//• login
//• Scroll down
//• Click 25$ gift cart
//• Fill all the gift cart details
//• Change the quantity to 2
//• Click add to cart
//• Verify the 25$ gift cart which is added successfully in shopping cart .
//• Logout
//• Close

package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.checkerframework.framework.qual.PostconditionAnnotation;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Utility.BaseClass;

public class TC1 extends BaseClass{
	
	@Test
	public void testCase1() throws EncryptedDocumentException, IOException, InterruptedException {
		
		preCondition("chrome");
		verifyByurl("https://demowebshop.tricentis.com/");
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\dws_login.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet2");
//		int row = sheet.getPhysicalNumberOfRows();
//		int column = sheet.getRow(0).getPhysicalNumberOfCells();
		
		String url = sheet.getRow(1).getCell(0).toString();
		String un = sheet.getRow(1).getCell(1).toString();
		String pass = sheet.getRow(1).getCell(2).toString();
		String recepientName = sheet.getRow(1).getCell(3).toString();
		String recepientMail = sheet.getRow(1).getCell(4).toString();
		
		System.out.println(url);
		System.out.println(un);
		System.out.println(pass);
		System.out.println(recepientName);
		System.out.println(recepientMail);
		
		login(un, pass);
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).perform();
		
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys(recepientName);
		driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys(recepientMail);
		driver.findElement(By.id("giftcard_2_Message")).sendKeys(recepientMail);
		WebElement qty = driver.findElement(By.id("addtocart_2_EnteredQuantity"));
		qty.clear();
		qty.sendKeys("2");
		driver.findElement(By.id("add-to-cart-button-2")).click();
		String expected_name = "$25 Virtual Gift Card";
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String name = driver.findElement(By.xpath("//td[@class='product']/a")).getText();
		if (expected_name.equals(name)) {
			System.out.println("Item is present");
			driver.findElement(By.className("ico-logout")).click();
		}
		else {
			System.out.println("Item is not present");
		}
		logout();
		postCondition();
		
		
	}
}
