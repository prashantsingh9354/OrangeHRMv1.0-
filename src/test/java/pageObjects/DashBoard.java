package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoard extends BasePage{
	public DashBoard(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//h6[normalize-space()='Dashboard']")
	WebElement logo_dashboard;
	
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']")
	WebElement btn_PIM;
	
	public void PIM() {
		btn_PIM.click();
	}
	
	public boolean logoDisplayed() {
		try{
			return (logo_dashboard.isDisplayed());
		}catch(Exception e) {
			return false;
		}
	}
}
