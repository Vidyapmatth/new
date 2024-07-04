package DDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertSingleDataToExcel {

	public static void main(String[] args) throws Throwable, Throwable {
		//step1:- path connections
				FileInputStream fis = new FileInputStream("./src\\test\\resources\\Excel.xlsx");
					   
				       //step2:-open workbook in read mode
					Workbook book = WorkbookFactory.create(fis);
					
					  //step3:-get the control of the Sheet
					Sheet sheet = book.getSheet("Sheet1");
					  
					//step4:-
					Row row = sheet.createRow(5);
					
					Cell cell = row.createCell(5);
					
					cell.setCellValue("WelCome");
					
					FileOutputStream fos = new FileOutputStream("./src\\test\\resources\\Excel.xlsx");
					book.write(fos);
					book.close();
	}

}
