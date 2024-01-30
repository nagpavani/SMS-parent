package Parent;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.genericUtilities.FileUtils;
import com.genericUtilities.WebDriverUtility;

public class MyChildProfile {

	public static void main(String[] args) throws Exception {
		FileUtils fLib = new FileUtils();
		WebDriverUtility wLib = new WebDriverUtility();
	
		String URL1 = fLib.readDataFromPropertyFile("url1");
		 String EMAIL1 = fLib.readDataFromPropertyFile("email1");
		String PASSWORD1 =fLib.readDataFromPropertyFile("password1");
		
		
		 
		 
		 
		WebDriver driver = new ChromeDriver();
		
		driver.get(URL1);
		
		//maximizing Browser
		wLib.maximizeWindow(driver);
	       
	       //implicit wait
		wLib.waitForPageLoad(driver, 10);
	       
	       //login to admin page
	       
	       driver.findElement(By.id("email")).sendKeys(EMAIL1);
	       driver.findElement(By.id("password")).sendKeys(PASSWORD1);
	       driver.findElement(By.id("btnSubmit")).click();
	       
	       driver.findElement(By.linkText("Profile")).click();
	       driver.findElement(By.linkText( "My Son's Profiler")).click();
	      String ele=driver .findElement(By.id("full_name")).getText();
	      
	     if(ele.equals("Student 1")) {
	    	  System.out.println("child name was correct");
	      }
	      else
	    	   {
	    		  System.err.println("child name was incorrect");
	      }
	       
	       	}
	}


