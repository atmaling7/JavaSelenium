package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UtilityClass.BaseClass;

public class Assign_27_11_2_2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		precondition("chrome");

		login();

		driver.findElement(By.xpath("//input[@value='Add to cart'][1]")).click();
		Thread.sleep(1000);

		String[] input = { "admin", "admin02@gmail.com", "admin01", "admin01@gmail.com" };
		int i = 0;

		List<WebElement> textFields = driver.findElements(By.xpath("//div[@class='giftcard']/div/input"));

		for (WebElement web : textFields) {

			web.clear();
			web.sendKeys(input[i++]);
		}

		driver.findElement(By.id("giftcard_2_Message")).sendKeys("Enjoy..!");
		Thread.sleep(1000);
		driver.findElement(By.className("qty-input")).clear();
		driver.findElement(By.className("qty-input")).sendKeys("2");
		Thread.sleep(1000);
		driver.findElement(By.id("add-to-cart-button-2")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Thread.sleep(1000);
		

		WebElement giftCard = driver.findElement(By.xpath("(//a[text()='$25 Virtual Gift Card'])[2]"));
		Thread.sleep(1000);

		if (giftCard.isDisplayed()) {

			System.out.println("Product added to cart...!");
			driver.findElement(By.xpath("(//a[text()='$25 Virtual Gift Card'])[2]/../../td/input")).click();
			Thread.sleep(1000);
//			driver.findElement(By.name("removefromcart")).click();
//			Thread.sleep(1000);
			driver.findElement(By.name("updatecart")).click();
		} else {
			System.out.println("Product not added to cart...!");
		}
		logout();

		Thread.sleep(1000);

		postCondition();
	}

}
