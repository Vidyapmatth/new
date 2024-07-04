package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(linkText = "Organizations")
	private WebElement OrganizationLink;
	
	
	@FindBy(linkText = "Products")
	private WebElement ProductsLink;

	@FindBy(linkText = "Campaigns")
	private WebElement CampaignsLink;
	
	@FindBy(linkText = "More")
	private WebElement MoreLink;
	
	@FindBy(linkText = "Sign Out")
	private WebElement SignOutLink;

	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement Administrator;
	
	public WebElement getOrganizationLink() {
		return OrganizationLink;
	}


	public WebElement getAdministrator() {
		return Administrator;
	}


	public WebElement getProductsLink() {
		return ProductsLink;
	}

	public WebElement getCampaignsLink() {
		return CampaignsLink;
	}

	public WebElement getMoreLink() {
		return MoreLink;
	}
	public WebElement getSignOutLink() {
		return SignOutLink;
	}

	public void clickOrganisationLink() {
		OrganizationLink.click();
	}
	
	

	public void clickCampaignsLink() {
		CampaignsLink.click();
	}
	
	public void clickProductsLink() {
		ProductsLink.click();
	}
	
	
	public void clickMoresLink() {
		MoreLink.click();
	}

	public void clickAdministratorImg() {
		Administrator.click();
	}
	public void clickSignOutLink() {
		SignOutLink.click();
	}


	





	



	
	
	
	
}
