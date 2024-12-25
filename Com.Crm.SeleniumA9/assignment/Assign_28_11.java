package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UtilityClass.BaseClass;

public class Assign_28_11 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		precondition("chrome");
		
		login();
		
//		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
		
//		List<WebElement> buttons = driver.findElements(By.xpath("//input[@value='Add to cart']"));
//		List<WebElement> buttons = driver.findElements(By.xpath("//div[@class='item-box']/div/div[2]/div[3]/div[2]/input"));
		List<WebElement> buttons = driver.findElements(By.xpath("//input[@value='Add to cart']"));
		
		Thread.sleep(1000);
		
		for (WebElement web : buttons) {
	
			web.click();
			
			Thread.sleep(2000);
		}
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='shopping cart']")).click();
		
		Thread.sleep(1000);
		
		List<WebElement> price = driver.findElements(By.xpath("//tr[@class='cart-item-row']/td[4]/span[2]"));
		
		int[] ar = new int[price.size()];
		

		int i = 0;
		for (WebElement web : price) {
			System.out.println(web.getText());
			int val = (int)(Double.parseDouble(web.getText()));
			ar[i++] = val;
			
		}
		System.out.println(Arrays.toString(ar));

		
		int max = findMax(ar);
		System.out.println(max);
		
		int j = 1;
		for (WebElement web : price) {
			Thread.sleep(1000);
			if (max == (int)(Double.parseDouble(web.getText()))) {
				System.out.println((int)(Double.parseDouble(web.getText())));
				Thread.sleep(1000);
				driver.findElement(By.xpath("(//input[@name='removefromcart'])["+j+"]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@name='updatecart']")).click();
			}
			j++;
		}	
		
		Thread.sleep(1000);
		
		logout();
		Thread.sleep(1000);
		
		postCondition();
	
	}
	
	public static int findMax(int[] ar)
	{
		
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < ar.length; i++) {
			
			if (ar[i] > max) {
				max = ar[i];
			}
		}return max;
	}
	
}
