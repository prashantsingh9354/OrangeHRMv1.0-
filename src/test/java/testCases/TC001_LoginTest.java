package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.DashBoard;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_LoginTest extends BaseClass {
	
	@Test
	public void Login() throws InterruptedException {
		try{
			HomePage hp=new HomePage(driver);
			Thread.sleep(1000);
			hp.Username("Admin");
			Thread.sleep(1000);
			hp.Password("admin");
			hp.login();
			
			DashBoard db=new DashBoard(driver);
			boolean target=db.logoDisplayed();
									
			 Assert.assertTrue(target); //Assert.assertEquals(target, true,"Login failed");
			}
		catch(Exception e){
				Assert.fail();
			}
		}

}
