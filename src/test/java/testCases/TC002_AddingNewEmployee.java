package testCases;

import org.testng.annotations.Test;

import pageObjects.AddEmployee;
import pageObjects.DashBoard;
import pageObjects.HomePage;
import pageObjects.PIMDash;
import testBase.BaseClass;

public class TC002_AddingNewEmployee extends BaseClass{
	
	@Test
	public void AddingNewEmployee() throws InterruptedException {
		
		HomePage hp=new HomePage(driver);
		hp.Username("Admin");
		hp.Password("admin123");
		hp.login();
		
		DashBoard db=new DashBoard(driver);
		db.PIM();
		
		PIMDash pd=new PIMDash(driver);
		//Thread.sleep(1000);
		pd.AddEmployee();
		
		AddEmployee addemp=new AddEmployee(driver);
		addemp.FirstName("John");
		//Thread.sleep(1000);
		addemp.MiddleName("micheal");
		//Thread.sleep(1000);
		addemp.LastName("kennedy");
		//Thread.sleep(1000);
		addemp.Save();
		//Thread.sleep(1000);
		addemp.confirm();
		
		
		
			
	}
}
