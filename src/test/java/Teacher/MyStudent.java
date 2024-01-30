package Teacher;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.genericUtilities.FileUtils;
import com.genericUtilities.WebDriverUtility;

public class MyStudent {


		
		public static void main(String[] args) throws Exception {
			FileUtils fLib = new FileUtils();
			WebDriverUtility wLib = new WebDriverUtility();
		
			String URL2 = fLib.readDataFromPropertyFile("url1");
			 String EMAIL2 = fLib.readDataFromPropertyFile("email1");
			String PASSWORD2 =fLib.readDataFromPropertyFile("password1");
			
	
	           
	           WebDriver driver = new ChromeDriver();
	           
	           driver.get(URL2);
	           //maximizing Browser
	           wLib.maximizeWindow(driver);
	           
	           //implicit wait
	           wLib.waitForPageLoad(driver, 10);
	           
	           //login to admin page
	           
	           driver.findElement(By.id("email")).sendKeys(EMAIL2);
	           driver.findElement(By.id("password")).sendKeys(PASSWORD2);
	           driver.findElement(By.id("btnSubmit")).click();
	           
	           driver.findElement(By.linkText("My Student")).click();
	           
	}

}
