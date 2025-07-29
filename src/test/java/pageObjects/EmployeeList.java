package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeList extends BasePage {
	public EmployeeList(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="(//input[@placeholder='Type for hints...'])[1]")
	WebElement input_employeename;
	
	@FindBy(xpath="//button[normalize-space()='Search']")
	WebElement btn_search;
		
	@FindBy(xpath="//div[@class='oxd-table-body']//div[@role='row']")
	List<WebElement> EmployeeNames;
	
	public void SearchEmployee(String Ename) {
		input_employeename.sendKeys(Ename);
		btn_search.click();
	}
		
	public boolean isEmployeeFound(String EName) {
        for (WebElement row : EmployeeNames) {
            if (row.getText().contains(EName)) {
                return true;
            }
        }
        return false;
    }
	
	
	

}
