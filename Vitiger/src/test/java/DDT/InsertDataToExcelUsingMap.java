package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertDataToExcelUsingMap {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("C:\\Users\\LENOVO\\OneDrive\\Documents\\ExcelTestData.xlsx");
		
	Workbook book = WorkbookFactory.create(fis);
		
		Sheet sheet = book.getSheet("Sheet2");
		
	/*	 LinkedHashMap<String, String> map = new LinkedHashMap<String,String>();
	        map.put("10", "hyd");
	        map.put("20", "Bangalore");
	        map.put("30", "Goa");
	        map.put("40", "pune");
	        
	        int rowNo=0;
	        for(Entry<String, String> m:map.entrySet())//10,pune
	        {         //10,pune
	        	Row row = sheet.createRow(rowNo++);
	        	row.createCell(0).setCellValue((String)m.getKey());//10
	        	row.createCell(1).setCellValue((String)m.getValue());//pune
	        	}
	        FileOutputStream fos = new FileOutputStream("C:\\Users\\LENOVO\\OneDrive\\Documents\\ExcelTestData.xlsx");
	        book.write(fos);
	        book.close();
		*/
	        
		
	        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
	        map.put(10, "hyd");
	        map.put(20, "Bangalore");
	        map.put(30, "Goa");
	        map.put(40, "pune");
	        
	        int rowNo=0;
	        
	        for (Entry<Integer, String> m : map.entrySet()) {
			Row row = sheet.createRow(rowNo++);
			row.createCell(0).setCellValue((Integer)m.getKey());
			row.createCell(1).setCellValue((String)m.getValue());
			
		}
		
	        FileOutputStream fos = new FileOutputStream("C:\\Users\\LENOVO\\OneDrive\\Documents\\ExcelTestData.xlsx");
	        book.write(fos);
	        book.close();
	        System.out.println("data added succesfuly");
		
		
		
		
		
		
		
		
		
	}

}
