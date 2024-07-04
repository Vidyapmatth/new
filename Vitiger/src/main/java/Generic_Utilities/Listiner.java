package Generic_Utilities;

import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.internal.annotations.IListeners;

public class Listiner  implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		   System.out.println("<--------I am Listening----------->");
	        
			TakesScreenshot takesSceenShot = (TakesScreenshot)BaseClass.sdriver;
			File src = takesSceenShot.getScreenshotAs(OutputType.FILE);
			LocalDateTime dateTime = LocalDateTime.now();
			String currentDateTime = dateTime.toString().replace(":", "_").replace(" ", "_");
			File dst = new File("./ScreenShots/" +"screenShotName"+ currentDateTime+".png");
			try {
				FileUtils.copyFile(src, dst);
			} catch (IOException e) {
				
				e.printStackTrace();
		
	}	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
	
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
}
