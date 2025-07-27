package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEmployee extends BasePage{
	public AddEmployee(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement input_Firstname;
	

	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement input_LastName;
		
	@FindBy(xpath="//input[@placeholder='Middle Name']")
	WebElement input_MiddleName;
		
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement btn_Save;
	
	public void FirstName(String Fname) {
		input_Firstname.sendKeys(Fname);
	}
	
	public void LastName(String Lname) {
		input_LastName.sendKeys(Lname);
	}
	
	public void MiddleName(String Mname) {
		input_MiddleName.sendKeys(Mname);
	}
	
	public void Save() {
		btn_Save.click();
	}
	

}
