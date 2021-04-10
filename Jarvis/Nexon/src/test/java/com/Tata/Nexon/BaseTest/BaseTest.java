package com.Tata.Nexon.BaseTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITest;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import com.Tata.Nexon.utilityClasses.GenericFunctions;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class BaseTest {
	public static WebDriver obj;
public static ExtentTest testname;
public static ExtentReports Report;
public static ExtentHtmlReporter Reporter;
static ITestContext testContext;
		@BeforeMethod (alwaysRun= true)
		public void LaunchBrowser() throws IOException {
			System.out.println(GenericFunctions.GetCurrentMethodName() + "has invoked");
			System.setProperty(GenericFunctions.ReadProperty("driverName"),GenericFunctions.ReadProperty("driverPath"));
			obj = new FirefoxDriver();
			obj.manage().window().maximize();
			String LoginUrl = GenericFunctions.ReadProperty("url");
			obj.get(LoginUrl);

		}
		@BeforeMethod
		public  static void ReportStart() {
			Reporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"\\Report\\"+ITest.class.getName()+".html");
			
			Report = new ExtentReports();
			Report.attachReporter(Reporter);
			testname= Report.createTest("TestReports");
		}
		
		@AfterMethod
		public void getResult(ITestResult result) throws Exception{
			 String screenshotPath = GenericFunctions.getScreenshot(obj, result.getName());
		
			if (result.getStatus() == ITestResult.FAILURE) {
				testname.fail(result.getThrowable().getMessage(),
						MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
			} 
			else if (result.getStatus() == ITestResult.SUCCESS) {
				testname.pass("Test passed",
						MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
			}
			Report.flush();
			System.out.println("Test Closed");
			obj.quit();
		}
		@AfterTest
		public void OpenReport() throws IOException
		{
			Runtime.getRuntime().exec("C:\\Program Files\\Internet Explorer\\iexplore.exe "+"C:\\Users\\Dhananjay\\eclipse-workspace\\Jarvis\\Nexon\\Report\\org.testng.ITest.html");
		}

}
