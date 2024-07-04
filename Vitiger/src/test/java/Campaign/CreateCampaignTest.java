package Campaign;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
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
import ObjectRepository.HomePage;
import ObjectRepository.ValidationAndVerification;
import ObjectRepository.VtigerLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;


public class CreateCampaignTest extends BaseClass {

	//hi first pull
//@Test(groups ="SystemTesting")
//@Test(retryAnalyzer = Generic_Utilities.RetryImplementation.class)
@Test
	public  void CreateCampaignTest() throws Throwable {
	/*	File_Utility flib = new File_Utility();
		 WebDriver_utility wlib = new WebDriver_utility();
		 Java_Utility jlib = new Java_Utility();
		 Excel_Utility elib = new Excel_Utility();
		
		//WebDriver driver=new ChromeDriver();
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
		 wlib.elementsToGetLoaded(driver);*/
      
	//	driver.get(URL);
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
	
		
		
		
   //    driver.findElement(By.linkText("More")).click();
		 HomePage home = new HomePage(driver);
		 home.clickMoresLink();
    //   driver.findElement(By.linkText("Campaigns")).click();
      
       home.clickCampaignsLink();
       driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();
       CampaignPage CampaignPage = new  CampaignPage(driver);
       CampaignPage.ClickCampaignplusSign();
     
       int ranNum = jlib.getRandomNumber();
       String campaginName = elib.readExcelDataUsingDataFormatter("Campaign", 0, 0)+ranNum;
       
  //     driver.findElement(By.name("campaignname")).sendKeys(campaginName);
       CampaignPage.SendToCampaignnametextfield(campaginName);
       
       TakesScreenshot tss = (TakesScreenshot)driver;
     		File src = tss.getScreenshotAs(OutputType.FILE);
     	//	File dest = new File("./ScreenShot.png");
     		File dst = new File("./ScreenShots/"+"pic6"+".png");
     			try {
     				FileUtils.copyFile(src, dst);
     			} catch (IOException e) {
     				e.printStackTrace();
     			}
             
     		//	 Assert.assertEquals(false, true);	
     			CampaignPage.clickSaveButton();
       
       
       
    //   driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
       CampaignPage.clickSaveButton();
       Thread.sleep(2000);
       
       
 /*      
     String actData = driver.findElement(By.xpath("//span[@id="dtlview_Campaign Name"]")).getText();
    if(campaginName.contains(actData))
    {
    	System.out.println("Data is matched");
    }
    else
    {
    	System.out.println("Data is not matched");

    }
   */
       
   /*   ValidationAndVerification Campvalidn = new ValidationAndVerification(driver);
      Campvalidn.Campdata(driver, campaginName);*/
     //  driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
     //  driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
      //    home.clickAdministratorImg();
       String actData = driver.findElement(By.xpath("//span[@id=\"dtlview_Campaign Name\"]")).getText();
/*Assert.assertEquals(campaginName, actData);
Assert.assertTrue(actData.contains(campaginName));*/
// Assert.assertTrue(actData.contains(campaginName), campaginName +"campagin Name is not found");
      
       Thread.sleep(2000);

       // home.clickSignOutLink();	
       }
		
	
	}


