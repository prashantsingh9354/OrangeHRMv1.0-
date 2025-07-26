package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_LoginTest extends BaseClass {
	
	@Test
	public void Login() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		Thread.sleep(1000);
		hp.Username("Admin");
		Thread.sleep(1000);
		hp.Password("admin123");
	}

}
