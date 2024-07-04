package TestNg;

import org.testng.annotations.Test;

public class SampleTest {
@Test(invocationCount = 3,priority = -1,enabled = true)
	public void CreatePrduct()
	{
		System.out.println("CreatePrduct is done ");
	}
	


@Test(dependsOnMethods = "CreatePrduct")
public void MOdifyPrduct()
{
	System.out.println("MOdifyPrduct is done ");
}
	
@Test(dependsOnMethods = "CreatePrduct")
public void DeletePrduct()
{
	System.out.println("DeletePrduct is done ");
}
	
	
	
}
