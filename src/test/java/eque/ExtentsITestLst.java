package eque;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentsITestLst implements ITestListener{
	
	ExtentHtmlReporter reporter;
	ExtentReports extent;
	ExtentTest test;
	
	public void onFinish(ITestContext result) {
		extent.flush();
		
	}
	public void onStart(ITestContext result) {
	
		//1Create The HTML Reprt
			 reporter = new ExtentHtmlReporter(new File("C:\\Users\\Admin\\Desktop\\extendreport\\report5.html"));
				
				//2. Create the Object of ExtentReport Class
			 extent = new ExtentReports();
				extent.attachReporter(reporter);
				
				//3.Start the Test
				 test = extent.createTest("extendreport");
				
		
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
		
	}
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Test Case failed");
		
	}
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "Test Case skipped");
		
	}
	public void onTestStart(ITestResult result) {
		test.log(Status.INFO, "Test Case Has Started");
		
	}
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Case passed");
		
	}
	
	
	

}
