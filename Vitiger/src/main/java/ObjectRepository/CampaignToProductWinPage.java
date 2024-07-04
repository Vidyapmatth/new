package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignToProductWinPage {
public CampaignToProductWinPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath = "//input[@id='search_txt']")
	private WebElement ProductTextField;

/*
	public void enterproductData( WebDriver driver,String productData) {
		enterproductData.sendKeys(productData);
	}
*/	
	public void ProductTextField( String productData) {
		ProductTextField.sendKeys(productData);
	}
	
	public void SearchProd( WebDriver driver,String productData) {
		driver.findElement(By.xpath("//a[text()='"+productData+"']")).click(); 
		   
	}
	@FindBy(xpath = "//input[@name='search']")
	private WebElement clickSearch;


	public void clickSearch() {
		clickSearch.click();
	}


	public WebElement getProductTextField() {
		return ProductTextField;
	}


	public WebElement getClickSearch() {
		return clickSearch;
	}

	
	
	
	
	
	
	
	
}
