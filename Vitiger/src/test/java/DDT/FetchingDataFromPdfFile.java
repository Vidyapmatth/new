package DDT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class FetchingDataFromPdfFile {

	public static void main(String[] args) throws Throwable {
		File file = new File("./src\\test\\resources\\WATERFALL MODEL.pdf");
		 		  
        PDDocument doc = PDDocument.load(file);
	
        int pages = doc.getNumberOfPages();
	       System.out.println(pages);
	       
	       PDFTextStripper pdfData = new PDFTextStripper();
	    //   String Data = pdfData.getText(doc);
	    //   System.out.println(Data);
	
	       pdfData.setStartPage(4);
	       String pageData = pdfData.getText(doc);
	       System.out.println(pageData);
		
		
		
	}

}
