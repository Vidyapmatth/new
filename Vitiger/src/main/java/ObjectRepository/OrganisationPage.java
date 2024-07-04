package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationPage {
public OrganisationPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);	
	}

@FindBy(css = "[alt='Create Organization...']")
private WebElement OrgplusSign;

@FindBy(name = "accountname")
private WebElement Organisationnametextfield;
@FindBy(id = "phone")
private WebElement PhoneNoTextField;

public void clickOrgplusSign() {
	OrgplusSign.click();
}
public WebElement getOrgplusSign() {
	return OrgplusSign;
}

public void SendToOrganisationNametextfield(String organizationData) {
	Organisationnametextfield.sendKeys(organizationData);
}

public void SendToPhoneNoTextField(String phoneNum) {
	PhoneNoTextField.sendKeys(phoneNum);
}
public WebElement getPhoneNoTextField() {
	return PhoneNoTextField;
}
public WebElement getOrganisationnametextfield() {
	return Organisationnametextfield;
}

@FindBy(id = "email1")
private WebElement EmailTextField;

public void SendToEmailTextField(String emailId) {
	EmailTextField.sendKeys(emailId);
}
public WebElement getEmailTextField() {
	return EmailTextField;
}
@FindBy(xpath = "//input[@title='Save [Alt+S]']")
private WebElement SaveButton;

public void clickSaveButton() {
	SaveButton.click();
}


public WebElement getSaveButton() {
	return SaveButton;
}
}
