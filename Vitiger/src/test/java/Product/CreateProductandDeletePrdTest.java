package Product;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Random;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.Excel_Utility;
import Generic_Utilities.File_Utility;
import Generic_Utilities.Java_Utility;
import Generic_Utilities.WebDriver_utility;
import ObjectRepository.CreateProductPage;
import ObjectRepository.DeleteProductValidationPAge;
import ObjectRepository.HomePage;
import ObjectRepository.VtigerLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;



public class CreateProductandDeletePrdTest extends BaseClass {
//	@Test(groups ="smokeTest")
	@Test(retryAnalyzer = Generic_Utilities.RetryImplementation.class)

	public  void CreateProductandDeletePrd() throws Throwable {
/*
		 File_Utility flib = new File_Utility();
		 WebDriver_utility wlib = new WebDriver_utility();
		 Java_Utility jlib = new Java_Utility();
		 Excel_Utility elib = new Excel_Utility();
		 
	//	WebDriver driver=new ChromeDriver();
		 WebDriver driver;
		 String BROWSER = flib.getKeyAndValueData("browser");
		 if(BROWSER.equalsIgnoreCase("chrome"))
		 {
			 WebDriverManager.chromedriver().setup();
			  driver=new ChromeDriver();
		 }
		 else if(BROWSER.equalsIgnoreCase("fireFox"))
		 {
			 WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
		 }
		 else
		 {
			 driver=new ChromeDriver();
		 }
	     String URL = flib.getKeyAndValueData("url");
		 String USERNAME = flib.getKeyAndValueData("username");
		 String PASSWORD = flib.getKeyAndValueData("password");
		
		 wlib.maximizeWindow(driver);
		 wlib.elementsToGetLoaded(driver);
		 driver.get(URL);
/*		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
      driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
      driver.findElement(By.id("submitButton")).click();
	*/    
		//Vtiger  VtigerLoginPage implementation	
			/*	VtigerLoginPage Login = new VtigerLoginPage(driver);
				Login.getUsertextField().sendKeys(USERNAME);
				Login.getPasswordusertextField().sendKeys(PASSWORD);
				Login.getLoginButton().click();
			*/	
			//	VtigerLoginPage Login = new VtigerLoginPage(driver);
			//	Login.LoginToPage(USERNAME, PASSWORD); 
				
	//    driver.findElement(By.linkText("Products")).click();
				                                                
				 HomePage home = new HomePage(driver);
				 CreateProductPage ProductPage = new	 CreateProductPage(driver);
				   home.clickProductsLink();
	 //   driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
				   ProductPage.clickproductplusSign();
	   int ranNumber = jlib.getRandomNumber();
	
	  String productData = elib.readExcelDataUsingDataFormatter("Product", 1, 1)+ranNumber;
	
	  // driver.findElement(By.name("productname")).sendKeys(productData);
	  ProductPage.SendToproductnametextfield(productData);
	// driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();    
	  ProductPage.SaveProduct();
	  String actData = driver.findElement(By.name("productname")).getText();
 //     Assert.assertEquals(actData, productData);
      Assert.assertTrue(productData.contains(actData), actData +"actData Name is not found");

	// driver.findElement(By.linkText("Products")).click(); 
	   home.clickProductsLink();
	 DeleteProductValidationPAge ValDelProd = new  DeleteProductValidationPAge(driver);	 
//	 driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr//td//a[text()='Product Name']/../preceding-sibling::td//input[@type='checkbox']")).click();
	    
	// driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr//td//a[text()='"+productData+"']/../preceding-sibling::td//input[@type='checkbox']")).click();
	    
//	 driver.findElement(By.xpath("//input[@value='Delete']")).click();
	 ValDelProd.DeleteProduct(driver, productData);
	  ProductPage.Deleteproduct();
	   wlib.alertAccept(driver);
	    
/*	List<WebElement> productList = driver.findElements(By.xpath("(//table[@class='lvt small']/tbody/tr/td[3])[position()>1]")); 
	    	
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
		*/
	  
	   ValDelProd.ValidateDeletedProduct(driver, productData);
  //    driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
  //  driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	   
	   //  home.clickAdministratorImg();
      Thread.sleep(2000);
      //	home.clickSignOutLink();
	
	
	}

}
