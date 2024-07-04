package Campaign;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

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
import ObjectRepository.CampaignPage;
import ObjectRepository.CampaignToProductWinPage;
import ObjectRepository.CreateProductPage;
import ObjectRepository.HomePage;
import ObjectRepository.ValidationAndVerification;
import ObjectRepository.VtigerLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateCampaignWithProduct1Test extends BaseClass  {
//	@Test(groups ="SystemTesting")
	@Test(retryAnalyzer = Generic_Utilities.RetryImplementation.class)


public void CreateCampaignWithProduct1Test()throws Throwable {
/*		
	File_Utility flib = new File_Utility();
	 WebDriver_utility wlib = new WebDriver_utility();
	 Java_Utility jlib = new Java_Utility();
	 Excel_Utility elib = new Excel_Utility();
	
	WebDriver driver=new ChromeDriver();
	/* WebDriver driver;
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
	 } */
	 
/*	 String URL = flib.getKeyAndValueData("url");
	 String USERNAME = flib.getKeyAndValueData("username");
	 String PASSWORD = flib.getKeyAndValueData("password");
	
	 wlib.maximizeWindow(driver);
	 wlib.elementsToGetLoaded(driver);
 
	driver.get(URL);*/
//	driver.findElement(By.name("user_name")).sendKeys(USERNAME);
//   driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
//   driver.findElement(By.id("submitButton")).click();
 
//Vtiger  VtigerLoginPage implementation	
/*	VtigerLoginPage Login = new VtigerLoginPage(driver);
	Login.getUsertextField().sendKeys(USERNAME);
	Login.getPasswordusertextField().sendKeys(PASSWORD);
	Login.getLoginButton().click();
*/	
//	VtigerLoginPage Login = new VtigerLoginPage(driver);
//	Login.LoginToPage(USERNAME, PASSWORD);

			
   int ranNumber = jlib.getRandomNumber();
 
   
   
  
//   driver.findElement(By.linkText("Products")).click();
   HomePage home = new HomePage(driver);
   home.clickProductsLink();
//   driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
  CreateProductPage ProductPage = new CreateProductPage(driver);
  
  ProductPage.clickproductplusSign();
String productData = elib.getExcelData("Product", 0, 0)+ranNumber;
//driver.findElement(By.name("productname")).sendKeys(productData);
ProductPage.SendToproductnametextfield(productData);
//driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
ProductPage.SaveProduct();
  // driver.findElement(By.linkText("More")).click();
home.clickMoresLink();

   
 //  driver.findElement(By.linkText("Campaigns")).click();
   home.clickCampaignsLink();
 //  driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();
   CampaignPage Campaign= new CampaignPage(driver);
   Campaign.ClickCampaignplusSign();
   String campaignData = elib.getExcelData("Campaign", 0, 0)+ranNumber;
 //   driver.findElement(By.name("campaignname")).sendKeys(campaignData);
   Campaign.SendToCampaignnametextfield(campaignData);
 //  driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
   Campaign.CampaignProductplusSign();
   
   wlib.switchingWindows(driver, "Products&action");
  CampaignToProductWinPage CampToProWin = new CampaignToProductWinPage(driver);
 //  driver.findElement(By.xpath("//input[@id='search_txt']")).sendKeys(productData);
  CampToProWin.ProductTextField(productData);
  ValidationAndVerification ProductValdn = new ValidationAndVerification(driver);
  ProductValdn.CamPRoddata(driver, productData);
 //  driver.findElement(By.xpath("//input[@name='search']")).click();
  CampToProWin.clickSearch();
 
   //Dynamic Xpath
 //  driver.findElement(By.xpath("//a[text()='"+productData+"']")).click(); 
  CampToProWin.SearchProd(driver, productData);
  String actData = driver.findElement(By.xpath("//input[@name=\"search_text\"]")).getText();
  Assert.assertEquals(productData, actData);
   wlib.switchingWindows(driver, "Campaigns&action");
   
//   driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
   CampaignPage CampaignPage = new CampaignPage(driver);
   CampaignPage.clickSaveButton();
   Thread.sleep(2000);
  
//   driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
// driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
//	home.clickAdministratorImg();
    
 //  home.clickSignOutLink();
     }
}
