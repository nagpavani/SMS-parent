package com.genericUtilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImpClass implements ITestListener {
     ExtentReports report;
     ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		String MethodName = result.getMethod().getMethodName();
		test = report.createTest(MethodName);
		Reporter.log(MethodName+"Execution started",true);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String MethodName = result.getMethod().getMethodName();
		test.log(Status.PASS,MethodName+" passed");
		Reporter.log(MethodName+" Executed successfully");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String MethodName = result.getMethod().getMethodName();
		try {
			String path = WebDriverUtility. screenShot(BaseClass.sdriver,result.getMethod().getMethodName());
			
			test.addScreenCaptureFromPath(path);
			test.log(Status.FAIL,MethodName+" Failed");
			test.log(Status.FAIL,result.getThrowable());
			Reporter.log(MethodName+"---->Failed");
			
		}
		catch(Throwable e) {
			e.printStackTrace();  
	}
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		String MethodName = result.getMethod().getMethodName();
		
		test.log(Status.SKIP,MethodName+" Skipped");
		test.log(Status.SKIP,result.getThrowable());
		Reporter.log(MethodName+"---->Skipped");
		
	}

	@Override
	public void onStart(ITestContext context) {
		ExtentSparkReporter spark = new ExtentSparkReporter(".\\Extend reports\\report.html");
		spark.config().setDocumentTitle("RMG");
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setReportName("SMS");
		
		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("Base platform","windows");
		report.setSystemInfo("Base Browser","chrome");
		report.setSystemInfo("Base-url ","http\\://rmgtestingserver/domain/Student_Management_System/view/login.php");
		report.setSystemInfo("ReportName", "pavani");
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
		
	}
	

}
