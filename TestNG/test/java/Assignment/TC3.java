//• Open the browser
//• Maximize
//• Enter into dws page
//• Verify the page by using url
//• login
//• open digital download in different window
//• Add all the product by using findElements
//• Remove the product which is having highest price (dynamic way)
//• Logout
//• Close the dws home page

package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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
import org.testng.annotations.Test;

import Utility.BaseClass;

public class TC3 extends BaseClass{
	
	@Test
	public void tc3() throws EncryptedDocumentException, IOException, InterruptedException {
		
		preCondition("chrome");
		verifyByurl("https://demowebshop.tricentis.com/");
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\dws_login.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet2");
		String url = sheet.getRow(1).getCell(0).toString();
		String un = sheet.getRow(1).getCell(1).toString();
		String pass = sheet.getRow(1).getCell(2).toString();
		
		login(un, pass);
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.SHIFT).click(driver.findElement(By.xpath("(//a[contains(text(),'Digital downloads')])[1]"))).perform();
		Thread.sleep(1000);
		act.keyUp(Keys.SHIFT).perform();
		Set<String> handles = driver.getWindowHandles();
		for (String string : handles) {
			driver.switchTo().window(string);
			String title ="Demo Web Shop. Digital downloads";
			if (title.equals(driver.getTitle())) {
				Thread.sleep(1000);
				List<WebElement> cart = driver.findElements(By.xpath("//input[@value='Add to cart']"));
				for(WebElement web: cart) {
					web.click();
					Thread.sleep(1000);
				}
				driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				List<WebElement> price = driver.findElements(By.xpath("//span[@class='product-unit-price']"));
				int[] ar = new int[price.size()];
				int i = 0;
				for(WebElement web : price) {
					int val= (int)(Double.parseDouble(web.getText()));
					ar[i++] = val;
					System.out.println(web.getText());
				}
				System.out.println(Arrays.toString(ar));
				int max = max(ar);
				System.out.println(max);
				int j=1;
				for(WebElement web : price) {
					try {
						if (max == (int)(Double.parseDouble(web.getText()))) {
							System.out.println(max);
							Thread.sleep(1000);
							driver.findElement(By.xpath("(//input[@name='removefromcart'])["+j+"]")).click();
							Thread.sleep(1000);
							driver.findElement(By.xpath("//input[@name='updatecart']")).click();
							Thread.sleep(1000);
						}
						j++;
					} catch (Exception e) {
						driver.navigate().back();
					}
				}
			}
		}
		logout();
		postCondition();
	}
	public static int max(int[] ar)
	{
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < ar.length; i++) {
			if (ar[i]>max) {
				max = ar[i];
			}
		}return max;
	}
}
