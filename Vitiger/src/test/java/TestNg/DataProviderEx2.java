package TestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DataProviderEx2 {
	
	@Test(dataProvider = "DataProviderForbookTickets")
	public void bookTicketTest(String src,String dest,int noOfPeople )
	{
		System.out.println("book Tickets from "+src+" to " +dest+" , "+noOfPeople+"");
	}
	
	@DataProvider
	public Object[][] DataProviderForbookTickets()
	{
		Object[][] objArr = new Object[3][3];
		
		objArr[0][0]="Banglore";
		objArr[0][1]="Tripura";
		objArr[0][2]=2;

		objArr[1][0]="Banglore";
		objArr[1][1]="Kulu Manali";
		objArr[1][2]=2;

		objArr[2][0]="Banglore";
		objArr[2][1]="Bali";
		objArr[2][2]=2;

		return objArr;
		
		
	}
}
