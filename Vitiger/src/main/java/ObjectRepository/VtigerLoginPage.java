package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VtigerLoginPage {

	
	public VtigerLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	
//Declaration	
@FindBy(name="user_name")
private WebElement usertextField;

@FindBy(name="user_password")
private WebElement passwordusertextField;


@FindBy(id="submitButton")
private WebElement loginButton;


public WebElement getUsertextField() {
	return usertextField;
}


public WebElement getPasswordusertextField() {
	return passwordusertextField;
}


public WebElement getLoginButton() {
	return loginButton;
}

public void LoginToPage(String username  , String password)
{
	usertextField.sendKeys(username);
	passwordusertextField.sendKeys(password);
	loginButton.click();
}











}
