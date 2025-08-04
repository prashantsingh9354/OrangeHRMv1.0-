package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.DashBoard;
import pageObjects.EmployeeList;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC004_DeleteEmployeeTest extends BaseClass {
	
	@Test
	public void deleteEmployeeTest() throws InterruptedException {
		
		try
		{HomePage hp=new HomePage(driver);
		Thread.sleep(1000);
		hp.Username("Admin");
		Thread.sleep(1000);
		hp.Password("admin123");
		hp.login();
		
		DashBoard db=new DashBoard(driver);
		db.PIM();
		
		EmployeeList el= new EmployeeList(driver);
		el.SearchEmployee("John M");
		Thread.sleep(4000);
		
		if(!el.isEmployeeFound("John M")) {
			System.out.println("Employee with said Don't exist");
		}
		if(el.isEmployeeFound("John M")){
			Thread.sleep(2000);
			el.DeleteEmployee();
			Thread.sleep(2000);
		}
		Assert.assertFalse(el.isEmployeeFound("John M"), "Employee Deletion Success");
		}catch(Exception e ) {
			Assert.fail();
			System.out.println("Failed");
		}
	}
	

}
