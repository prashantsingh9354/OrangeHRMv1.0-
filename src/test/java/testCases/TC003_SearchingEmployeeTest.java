package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageObjects.DashBoard;
import pageObjects.EmployeeList;
import pageObjects.HomePage;
import pageObjects.PIMDash;
import testBase.BaseClass;

public class TC003_SearchingEmployeeTest extends BaseClass{
	
	@Test
	public void SearchingEmployee() throws InterruptedException {
		
		HomePage hp=new HomePage(driver);
		hp.Username("Admin");
		hp.Password("admin123");
		hp.login();
		
		DashBoard db=new DashBoard(driver);
		db.PIM();
		
		PIMDash pd=new PIMDash(driver);
		pd.EmployeeList();
		
		EmployeeList empl=new EmployeeList(driver);
		empl.SearchEmployee("John");
		
		Assert.assertTrue(empl.isEmployeeFound("John"),"Employee not found!");
		
		
	}
	
	

}
