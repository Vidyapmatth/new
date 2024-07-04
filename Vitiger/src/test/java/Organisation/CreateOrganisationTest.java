package Organisation;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.Excel_Utility;
import Generic_Utilities.File_Utility;
import Generic_Utilities.Java_Utility;
import Generic_Utilities.WebDriver_utility;
import ObjectRepository.CreateProductPage;
import ObjectRepository.HomePage;
import ObjectRepository.OrganisationPage;
import ObjectRepository.VtigerLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(Generic_Utilities.ListenerImplementation.class)
//@Listeners(Generic_Utilities.List.class)
public class CreateOrganisationTest extends BaseClass  {
	
	
	
	//@Test//(groups ="SystemTesting")
//	@Test(retryAnalyzer = Generic_Utilities.RetryImplementation.class)
	
	@Test
	public  void CreateOrganisation()  throws Throwable {
		
	
        
    	HomePage home = new HomePage(driver);
			   home.clickOrganisationLink();
			   OrganisationPage OrganisationPage = new  OrganisationPage(driver);
			   OrganisationPage.clickOrgplusSign();
     //   driver.findElement(By.cssSelector("[alt='Create Organization...']")).click();
      
        int ranNum = jlib.getRandomNumber();
     
   //   String organizationData = elib.getExcelData("Organization", 0, 0)+ranNum;
        String organizationData = elib.readExcelDataUsingDataFormatter("Organisation", 0, 0)+ranNum;
        /*Assert.assertEquals(organizationData, actData);
	       Assert.assertTrue(actData.contains(organizationData));
	       Assert.assertTrue(organizationData.contains(organizationData), organizationData +"organization Name is not found");
     */
      //  Assert.assertEquals(false, true);
     //   driver.findElement(By.name("accountname")).sendKeys(organizationData);
        OrganisationPage.SendToOrganisationNametextfield(organizationData);
        
        String phoneNum = elib.readExcelDataUsingDataFormatter("Organisation", 0, 1);
    //    driver.findElement(By.id("phone")).sendKeys(phoneNum);
        OrganisationPage.SendToPhoneNoTextField(phoneNum);
        
        String emailId = elib.readExcelDataUsingDataFormatter("Organisation", 0, 2);
  //      driver.findElement(By.id("email1")).sendKeys(emailId);
        OrganisationPage.SendToEmailTextField(emailId);
  //      driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
        OrganisationPage.clickSaveButton();
        Thread.sleep(2000);
     //   driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
    //  driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
        //	home.clickAdministratorImg();
        // home.clickSignOutLink();	
        
	
	}
	@Test(enabled = false)
	public void CreateProductTest() throws Throwable {
		
		//	WebDriver driver = new ChromeDriver();
			File_Utility flib = new File_Utility();
			 WebDriver_utility wlib = new WebDriver_utility();
			 Java_Utility jlib = new Java_Utility();
			 Excel_Utility elib = new Excel_Utility();
			
			// WebDriver driver=new ChromeDriver();
			
		/*	 WebDriver driver;
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
			 }*/
		//	driver.manage().window().maximize();
		//	driver.get("http://localhost:8888/");
			
	/*driver.findElement(By.name("user_name")).sendKeys("admin");

	driver.findElement(By.name("user_password")).sendKeys("admin");

	driver.findElement(By.id("submitButton")).click();
	*/
		//	String URL = flib.getKeyAndValueData("url");
		//	 String USERNAME = flib.getKeyAndValueData("username");
		//	 String PASSWORD = flib.getKeyAndValueData("password");
			 
		//	 wlib.maximizeWindow(driver);
		//	 wlib.elementsToGetLoaded(driver);
			//Vtiger  VtigerLoginPage implementation	
			/*	VtigerLoginPage Login = new VtigerLoginPage(driver);
				Login.getUsertextField().sendKeys(USERNAME);
				Login.getPasswordusertextField().sendKeys(PASSWORD);
				Login.getLoginButton().click();
			*/	
			//	VtigerLoginPage Login = new VtigerLoginPage(driver);
			//	Login.LoginToPage(USERNAME, PASSWORD);
				
	//driver.findElement(By.xpath("//a[text()='Products']")).click();
				 HomePage home = new HomePage(driver);
				   home.clickProductsLink();
				//driver.findElement(By.xpath("//img[@alt=\"Create Product...\"]")).click();
				   CreateProductPage ProductPage = new	   CreateProductPage(driver);
				   ProductPage.clickproductplusSign();
	//driver.findElement(By.xpath("//input[@name=\"productname\"]")).sendKeys("iphone");
				   int ranNumber = jlib.getRandomNumber();

				   String productData = elib.getExcelData("Product", 0, 0)+ranNumber;
				   ProductPage.SendToproductnametextfield(productData);
				   
	//driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
				   ProductPage.SaveProduct();  
	Thread.sleep(5000);
	//driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]")).click();
	///home.clickAdministratorImg();
	//driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	Thread.sleep(2000);

	//home.clickSignOutLink();

		}
	
		
		
		
		
		
	}


