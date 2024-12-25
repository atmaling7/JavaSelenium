//⦁	Open
//⦁	Maxmize
//⦁	Enter
//⦁	Verify the Page(URL)
//Login
//⦁	Click the add to cart of 25$ ritual gift card (home page)
//⦁	Fill all the details gift card
//⦁	Change the quantity to 2
//⦁	Add the product to shopping cart
//⦁	After adding verify the product whether it is added inside the shopping cart or not
//⦁	After verfication remove the product from shopping cart
//⦁	Logout 
//⦁	Close the browser

package assignment;

import org.openqa.selenium.By;

import UtilityClass.BaseClass;

public class Assign_27_11_2 extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		precondition("chrome");
		
		login();
		
		driver.findElement(By.xpath("//input[@value='Add to cart'][1]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys("admin02@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("giftcard_2_Message")).sendKeys("Enjoy..!");
		Thread.sleep(1000);
		driver.findElement(By.className("qty-input")).clear();
		driver.findElement(By.className("qty-input")).sendKeys("2");
		Thread.sleep(1000);
		driver.findElement(By.id("add-to-cart-button-2")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Thread.sleep(1000);
		
		String expected_giftCard = "$25 Virtual Gift Card";
		
		String actual_giftCard = driver.findElement(By.xpath("//tbody/tr/td[@class='product']/a")).getText();
		
		if (expected_giftCard.equals(actual_giftCard)) {
			
			System.out.println("Item added to Shopping Cart...!");
			Thread.sleep(1000);
			
			
			
			if (expected_giftCard.equals(actual_giftCard)) {
				
				
			}
		}
		else {
			System.out.println("Item not added to Shopping Cart...!");
		}
		
		driver.findElement(By.name("removefromcart")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("updatecart")).click();
		
		logout();
		
		Thread.sleep(1000);
		
		postCondition();
	}
}
