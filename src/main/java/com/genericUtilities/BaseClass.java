 package com.genericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseClass {
	public DatabaseUtility dLib = new DatabaseUtility();
	public FileUtils fLib = new FileUtils();
	public WebDriverUtility wLib = new WebDriverUtility();
	public WebDriver driver;
	
	public static WebDriver sdriver;
	
	/*@Parameters("BROWSER")*/
	
	@BeforeSuite(alwaysRun  = true )
	public void Config_Bs() {
		System.out.println("connect to DataBase");
	}
	@BeforeClass(alwaysRun  = true )
	public void config_Bc() throws Exception {
		driver = new ChromeDriver();
		String URL = fLib.readDataFromPropertyFile("irtcurl");
		driver.get(URL);
		/*if(BROWSER.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("---Invalid Browser--");
		}*/ 
		sdriver = driver;
			
		wLib.maximizeWindow(driver);
		wLib.waitForPageLoad(driver, 10);
		System.out.println("lunaching the browser");
	}
	
	@AfterClass(alwaysRun  = true )
	public void config_Ac() {
		driver.quit();
		System.out.println("closing the browser");
	}
	
	@AfterSuite(alwaysRun  = true )
	public void config_As() {
		System.out.println("close the DataBaseConnection");
	}
	

}
