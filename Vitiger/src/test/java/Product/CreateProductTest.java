package Product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic_Utilities.BaseClass;
import Generic_Utilities.Excel_Utility;
import Generic_Utilities.File_Utility;
import Generic_Utilities.Java_Utility;
import Generic_Utilities.WebDriver_utility;
import ObjectRepository.CreateProductPage;
import ObjectRepository.HomePage;
import ObjectRepository.VtigerLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateProductTest extends BaseClass {
//@Test(groups ="smokeTest")
@Test(retryAnalyzer = Generic_Utilities.RetryImplementation.class)

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
			   Thread.sleep(5000);

		     
		  //     Assert.assertTrue(actData.contains(productData));
		    //   Assert.assertTrue(actData.contains(productData), productData +"product Name is not found");

		       
		       
		       
		       
		       
		       //driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
			   ProductPage.SaveProduct();  
Thread.sleep(5000);
String actData = driver.findElement(By.name("productname")).getText();
//Assert.assertEquals(productData, actData);
Assert.assertTrue(productData.contains(actData), actData +"actData Name is not found");

//SoftAssert sa = new SoftAssert();
//sa.assertEquals(productData, actData);
//driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]")).click();
///home.clickAdministratorImg();
//driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
Thread.sleep(2000);

//home.clickSignOutLink();

	}

}
