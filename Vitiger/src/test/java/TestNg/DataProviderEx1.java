package TestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx1 {
	@Test(dataProvider = "DataProviderForbookTickets")
	public void bookTicketTest(String src,String dest)
	{
		System.out.println("book Tickets from "+src+" to " +dest+"");
	}
	
	@DataProvider
	public Object[][] DataProviderForbookTickets()
	{
		Object[][] objArr = new Object[3][2];
		
		objArr[0][0]="Banglore";
		objArr[0][1]="Tripura";
		
		objArr[1][0]="Banglore";
		objArr[1][1]="Kulu Manali";
		
		objArr[2][0]="Banglore";
		objArr[2][1]="Bali";
		
		return objArr;
		
	//hi editing from repo	
		//hello editing from eclipse
	}
}
