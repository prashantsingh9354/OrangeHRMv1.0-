package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PIMDash extends BasePage{
	public PIMDash(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[normalize-space()='Add Employee']")
	WebElement btn_AddEmployee;
	
	@FindBy(xpath="//a[normalize-space()='Employee List']")	
	WebElement btn_employeelist;
	
	public void AddEmployee() {
		btn_AddEmployee.click();
	}
	
	public void EmployeeList() {
		btn_employeelist.click();
	}

}
