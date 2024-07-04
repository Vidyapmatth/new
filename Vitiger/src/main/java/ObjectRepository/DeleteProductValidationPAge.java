package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DeleteProductValidationPAge {

	public  DeleteProductValidationPAge(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void DeleteProduct(WebDriver driver,String productData ) {
		 driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr//td//a[text()='"+productData+"']/../preceding-sibling::td//input[@type='checkbox']")).click();

	}
	
	public void ValidateDeletedProduct(WebDriver driver,String productData ) {
		List<WebElement> productList = driver.findElements(By.xpath("(//table[@class='lvt small']/tbody/tr/td[3])[position()>1]")); 
    	
		boolean flag = false;
		
		for (WebElement prdName : productList)
		{
			String actData = prdName.getText();
			if(actData.contains(productData))
			{
				flag=true;
			   break;
			}}
		if(flag)
		{
			System.out.println("product data is deleted");
		}
		else
		{
			System.out.println("product data is not deleted");
		}
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
