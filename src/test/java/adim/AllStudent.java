package adim;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.genericUtilities.ExcelUtils;
import com.genericUtilities.FileUtils;
import com.genericUtilities.JavaUtils;
import com.genericUtilities.WebDriverUtility;

public class AllStudent {

	private static String EMAIL;

	public static void main(String[] args) throws Exception {
		JavaUtils jLib = new JavaUtils();
		ExcelUtils eLib = new ExcelUtils();
		FileUtils fLib = new FileUtils();
		WebDriverUtility wLib = new WebDriverUtility();
	
		String URL = fLib.readDataFromPropertyFile("url");
		 String EMAIL = fLib.readDataFromPropertyFile("email");
		String PASSWORD =fLib.readDataFromPropertyFile("password");
		
	      // launching the Browser
	       WebDriver driver=new ChromeDriver();
	       driver.get(URL);
	      
	       //maximizing Browser
	   wLib.maximizeWindow(driver);
	       
	       //implicit wait
	       wLib.waitForPageLoad(driver, 10);
	       //login to admin page
	       
	       driver.findElement(By.id("email")).sendKeys(EMAIL);
	       driver.findElement(By.id("password")).sendKeys(PASSWORD);
	       driver.findElement(By.id("btnSubmit")).click();
	       
	       //entering student details
	       
	       driver.findElement(By.linkText("Student")).click();	
	       
	       //search All student 
	       
	       driver.findElement(By.xpath("//a[.='  All Student']")).click();
	       WebElement element = driver.findElement(By.id("grade"));
	        Select select = new Select(element);
	        
	        select.selectByVisibleText("QSpiders_Premium");
	        
	  driver.findElement(By.xpath("//button[.='Submit']")).click();

	}

}
