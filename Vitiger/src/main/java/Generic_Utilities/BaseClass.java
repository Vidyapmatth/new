package Generic_Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import ObjectRepository.HomePage;
import ObjectRepository.VtigerLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass {

	public 	static WebDriver sdriver;

public 	 WebDriver driver;
public File_Utility flib = new File_Utility();
public WebDriver_utility wlib = new WebDriver_utility();
public Java_Utility jlib = new Java_Utility();
public Excel_Utility elib = new Excel_Utility();
public VtigerLoginPage Login = new VtigerLoginPage(driver);
public HomePage home = new HomePage(driver);

	@BeforeSuite(groups ={"smokeTest","SystemTesting"})
	public void bs()
	{
		System.out.println("DataBase Connection");
	}
	@BeforeTest(groups ={"smokeTest","SystemTesting"})
	public void bt()
	{
		System.out.println("parallel execution");
	}
//	@Parameters("BROWSER")
	@BeforeClass(groups ={"smokeTest","SystemTesting"})
	public void bc() throws Throwable
	{
		
		File_Utility flib = new File_Utility();
		 WebDriver_utility wlib = new WebDriver_utility();

	String BROWSER = flib.getKeyAndValueData("browser");
		 if(BROWSER.equalsIgnoreCase("chrome"))
		 {
			 WebDriverManager.chromedriver().setup();
			  driver=new ChromeDriver();
		 }
		 else if(BROWSER.equalsIgnoreCase("edge"))
		 {
			 WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
		 }
		 else
		 {
			 driver=new ChromeDriver();
		 }
		 System.out.println("Browser lauched ");
		 sdriver = driver;
	}
	@BeforeMethod(groups ={"smokeTest","SystemTesting"})
	public void bm() throws Throwable
	{
		File_Utility flib = new File_Utility();
		 String URL = flib.getKeyAndValueData("url");
		 String USERNAME = flib.getKeyAndValueData("username");
		 String PASSWORD = flib.getKeyAndValueData("password");
		
		wlib.maximizeWindow(driver);
		 wlib.waitForElementToLoad(driver);
		
        driver.get(URL);
		VtigerLoginPage Login = new VtigerLoginPage(driver);

		Login.LoginToPage(USERNAME, PASSWORD);
		System.out.println("login to Application");
	}
	@AfterMethod(groups ={"smokeTest","SystemTesting"})
	public void am()
	{
		HomePage home = new HomePage(driver);
		 home.clickAdministratorImg();
		 home.clickSignOutLink();
		System.out.println("logout from application");
	}
	@AfterClass(groups ={"smokeTest","SystemTesting"})
	public void ac()
	{
		driver.quit();
		System.out.println("close browser");
	}
	@AfterTest(groups ={"smokeTest","SystemTesting"})
	public void at()
	{
		System.out.println("parallel execution done");
	}
	@AfterSuite(groups ={"smokeTest","SystemTesting"})
	public void as()
	{
		System.out.println("close database");
	}
	
}
