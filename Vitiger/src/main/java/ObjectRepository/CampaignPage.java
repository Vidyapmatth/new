package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignPage {
public CampaignPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);	
	}

@FindBy(xpath = "//img[@title='Create Campaign...']")
private WebElement CampaignplusSign;


public void ClickCampaignplusSign() {
	CampaignplusSign.click();
}


@FindBy(xpath = "//img[@src='themes/softed/images/select.gif']")
private WebElement CampaignProductplusSign;


public WebElement getCampaignplusSign() {
	return CampaignplusSign;
}



public WebElement getCampaignProductplusSign() {
	return CampaignProductplusSign;
}




public void CampaignProductplusSign() {
	CampaignProductplusSign.click();
}
@FindBy(name = "campaignname")
private WebElement campaignnametextfield;


public void SendToCampaignnametextfield( String campaginName) {
	campaignnametextfield.sendKeys(campaginName);
}


public WebElement getCampaignnametextfield() {
	return campaignnametextfield;
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
