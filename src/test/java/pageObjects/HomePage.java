package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver1) {
		super(driver1);		
	}
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement input_username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement input_password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btn_login;
	
	public void Username(String user) {
		input_username.sendKeys(user);
	}
	
	public void Password(String pass) {
		input_password.sendKeys(pass);
	}
	
	public void login() {
		btn_login.click();
	}

}
