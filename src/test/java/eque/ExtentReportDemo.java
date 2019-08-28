package eque;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//1Create The HTML Reprt
		ExtentHtmlReporter report = new ExtentHtmlReporter(new File("C:\\Users\\Admin\\Desktop\\extendreport\\report1.html"));
		
		//2. Create the Object of ExtentReport Class
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(report);
		
		//3.Start the Test
		ExtentTest test = extent.createTest("extendreport");
		driver.get("https://www.seleniumhq.org/");
		
		String title=driver.getTitle();
		
		if(title.equalsIgnoreCase("Selenium - we"))
		{
			test.log(Status.PASS, "The title is verified");
		}
		else
		{
			test.log(Status.FAIL, "The Title did not match");
		}
		extent.flush();

	}

}
