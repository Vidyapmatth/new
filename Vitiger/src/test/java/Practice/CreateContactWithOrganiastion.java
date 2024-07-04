package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

import Generic_Utilities.Java_Utility;

public class CreateContactWithOrganiastion {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
		driver.findElement(By.name("user_name")).sendKeys("admin");
        driver.findElement(By.name("user_password")).sendKeys("admin");
        driver.findElement(By.id("submitButton")).click();
    //    Random ranNum = new Random();
     //   int ranNumber = ranNum.nextInt(1000);
        
        
       Java_Utility jlib = new Java_Utility();
      int ranNum= jlib.getRandomNumber();
        
        
        driver.findElement(By.linkText("Contacts")).click();
        driver.findElement(By.xpath("//img[@alt=\"Create Contact...\"]")).click();
        
        FileInputStream fis = new FileInputStream("C:\\Users\\LENOVO\\OneDrive\\Documents\\ExcelTestData.xlsx");
 	   
        //step2:-open workbook in read mode
 	Workbook book = WorkbookFactory.create(fis);
 	
 	  //step3:-get the control of the Sheet
 	Sheet sheet = book.getSheet("Sheet1");
 	
 	//step4:- get control of the row
 	Row row = sheet.getRow(0);
 	
 	//step5:- get control of the cell
 	Cell cell = row.getCell(1);
 	
 	String lastnameExcelData = cell.getStringCellValue()+ranNum;
 	System.out.println(lastnameExcelData);
     WebElement COntactLName = driver.findElement(By.name("lastname"));
     COntactLName.sendKeys(lastnameExcelData);
     
   String ContactWinId = driver.getWindowHandle();
   System.out.println(ContactWinId);
   
     driver.findElement(By.xpath("//img[@src=\"themes/softed/images/select.gif\"][1]")).click();
    
        FileInputStream fis1 = new FileInputStream("C:\\Users\\LENOVO\\OneDrive\\Documents\\ExcelTestData.xlsx");

        //step2:-open workbook in read mode
 	Workbook book1 = WorkbookFactory.create(fis1);
 	
 	  //step3:-get the control of the Sheet
 	Sheet sheet1 = book1.getSheet("Sheet1");
 	
 	//step4:- get control of the row
 	Row row1 = sheet1.getRow(0);
 	
 	//step5:- get control of the cell
 	Cell cell1 = row1.getCell(2);
 	
 	
 	String ORGExcelData = cell1.getStringCellValue();
 	System.out.println(ORGExcelData);
 /*	 Set<String> wins = driver.getWindowHandles();
     Iterator<String> it = wins.iterator();
        while(it.hasNext())
      {
   	   String win = it.next();
   	   driver.switchTo().window(win);
   	   String currentTitle = driver.getTitle();
   	   if(currentTitle.contains("Accounts&action"))
   	   {
   		   break;
   	   }
      }
      */
 	 WebElement ORG = driver.findElement(By.xpath("//input[@name=\"search_text\"]"));
     
     ORG.sendKeys(ORGExcelData);
     
   /*  FileInputStream fis2 = new FileInputStream("C:\\Users\\LENOVO\\OneDrive\\Documents\\ExcelTestData.xlsx");

     //step2:-open workbook in read mode
  	Workbook book2 = WorkbookFactory.create(fis2);
  	
  	  //step3:-get the control of the Sheet
  	Sheet sheet2 = book2.getSheet("Sheet1");
  	
  	//step4:- get control of the row
  	Row row2 = sheet2.getRow(0);
  	
  	//step5:- get control of the cell
  	Cell cell2 = row2.getCell(3);
  	String ORGExcelData = cell2.getStringCellValue();
 	System.out.println(ORGExcelData);
     WebElement OrganisationLName = driver.findElement(By.name("search_text"));
     OrganisationLName.sendKeys(ORGExcelData);
     
     */
     
     
     driver.findElement(By.name("search_text")).click();
     driver.findElement(By.xpath("//a[text()='"+ORGExcelData+"']")).click();
     driver.switchTo().window(ContactWinId);
     driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
     

     Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]")).click();

	//	driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
     
     
     
     
     
     
     
     
     
     
     
     
     
	}

}
