package TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.crm.BaseClass.DwsBase;

public class TestConfigurationAnno extends DwsBase{

	@Test
	public void main() throws InterruptedException {
		driver.findElement(By.id("small-searchterms")).sendKeys("mobile");
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		Thread.sleep(1000);
	}
}
