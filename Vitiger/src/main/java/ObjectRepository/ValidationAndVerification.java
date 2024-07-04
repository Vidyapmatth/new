package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ValidationAndVerification {
public ValidationAndVerification(WebDriver driver) {
		
		PageFactory.initElements(driver, this);	
	}

public void Campdata(WebDriver driver,String campaginName)

{
	  
    String actData = driver.findElement(By.xpath("//span[@id=\"dtlview_Campaign Name\"]")).getText();
   if(campaginName.contains(actData))
   {
   	System.out.println("campaginData is matched");
   }
   else
   {
	   System.out.println("campaginData is not matched");
   }
   
   
}  
   public void CamPRoddata(WebDriver driver,String productData)

   {
   	  
       String actData = driver.findElement(By.xpath("//input[@name=\"search_text\"]")).getText();
      if(productData.contains(actData))
      {
      	System.out.println("productData is matched");
      }
      else
      {
      	System.out.println("productData is not matched");

      }
    
}
















}
