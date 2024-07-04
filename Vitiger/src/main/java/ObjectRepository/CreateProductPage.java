package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProductPage {
public CreateProductPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);	
	}
@FindBy(xpath =  "//img[@alt='Create Product...']")
private WebElement CreateproductplusSign;
public void clickproductplusSign() {
	CreateproductplusSign.click();
}



@FindBy(xpath =  "//input[@value='Delete']")
private WebElement Deleteproduct;
public void Deleteproduct() {
	Deleteproduct.click();
}


public WebElement getDeleteproduct() {
	return Deleteproduct;
}


@FindBy(xpath =  "//input[@title='Save [Alt+S]']")
private WebElement SaveProduct;


public void SaveProduct() {
	SaveProduct.click();
}

public WebElement getSaveProduct() {
	return SaveProduct;
}






@FindBy(name = "productname")
private WebElement productnametextfield;


public void SendToproductnametextfield( String productData) {
	productnametextfield.sendKeys(productData);
}





public WebElement getCreateproductplusSign() {
	return CreateproductplusSign;
}


public WebElement getProductnametextfield() {
	return productnametextfield;
}

















}
