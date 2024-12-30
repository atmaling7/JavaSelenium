package TestNG;

import org.testng.annotations.Test;

public class CreatingDependency {
	
	@Test(timeOut = 000,enabled = false)
	public void createAccount() throws InterruptedException {
//		Thread.sleep(1000);
		System.out.println("create account");
	}
	
	
	@Test(dependsOnMethods = "createAccount")
	public void ModifyAccount() {
		System.out.println("Modify account");
	}
	
	
	@Test(dependsOnMethods = "createAccount")
	public void DeleteAccount() {
		System.out.println("Delete account");
	}
	
	
}
