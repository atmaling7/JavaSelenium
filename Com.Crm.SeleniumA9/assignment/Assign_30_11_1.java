package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;

import UtilityClass.BaseClass;

public class Assign_30_11_1 extends BaseClass {
	
	static public void main(String[] args) throws InterruptedException {
		

		if (verifyByTitle("Demo Web Shop")) {
			
			System.out.println("Iam in dws page...!");
			
			login();
			
			driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
			
			WebElement sort_by = driver.findElement(By.id("products-orderby"));
			
			Select sel = new Select(sort_by);
			
			if (sel.isMultiple()) {
				
				System.out.println("It is a multi-select dropdown");
			}
			else {
				
				System.out.println("It is not a multi select drop down");
				
				int i = 0;
				List<WebElement> elemets = sel.getOptions();
				
				for (WebElement web : elemets) {
					
					sort_by = driver.findElement(By.id("products-orderby"));
					
					sel = new Select(sort_by);
					
					sel.selectByIndex(i++);
					Thread.sleep(1000);
					
				}
				Thread.sleep(1000);
				
				WebElement products_pagesize = driver.findElement(By.cssSelector("select[id='products-pagesize']"));
				
				Select sel2 = new Select(products_pagesize);
				
				List<WebElement> options_2 = sel2.getOptions();
				
				 i = 0;
				
				for (WebElement web : options_2) {
					
					products_pagesize = driver.findElement(By.cssSelector("select[id='products-pagesize']"));
					
					sel = new Select(products_pagesize);
					
					sel.selectByIndex(i++);
					Thread.sleep(1000);
					
				}
				Thread.sleep(1000);
				
				WebElement products_viewmode = driver.findElement(By.cssSelector("select[id='products-viewmode']"));
				
				Select sel3 = new Select(products_viewmode);
				
				List<WebElement> options_3 = sel3.getOptions();
				i = 0;
				
				for (WebElement web : options_3) {
					
					products_viewmode = driver.findElement(By.cssSelector("select[id='products-viewmode']"));
					
					sel = new Select(products_viewmode);
					
					sel.selectByIndex(i++);
					Thread.sleep(1000);
					
				}	
				
			}
			
		}
		else
		{
			System.out.println("Iam not in dws page...!");
		}
		
		Thread.sleep(1000);
		
		driver.quit();
		
		}
	
		
	
}
