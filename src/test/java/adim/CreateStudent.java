package adim;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.genericUtilities.ExcelUtils;
import com.genericUtilities.FileUtils;
import com.genericUtilities.JavaUtils;
import com.genericUtilities.WebDriverUtility;

public class CreateStudent {

	public static void main(String[] args) throws Exception {
		JavaUtils jLib = new JavaUtils();
		ExcelUtils eLib = new ExcelUtils();
		FileUtils fLib = new FileUtils();
		WebDriverUtility wLib = new WebDriverUtility();
		
		/*
		 * FileInputStream fis =new
		 * FileInputStream(".\\src\\test\\resources\\adminlogin.properties"); Properties
		 * pobj =new Properties(); pobj.load(fis); pobj.setProperty("url",
		 * " http://rmgtestingserver/domain/Student_Management_System/view/login.php");
		 * pobj.setProperty("email","admin@gmail.com");
		 * pobj.setProperty("password","12345");
		 */
		/*
		 * FileOutputStream fs = new
		 * FileOutputStream(".\\src\\test\\resources\\adminlogin.properties");
		 * 
		 * pobj.store(fs, "admin login");
		 */
     
    String URL = fLib.readDataFromPropertyFile("url");
    String EMAIL = fLib.readDataFromPropertyFile("email");
     String PASSWORD = fLib.readDataFromPropertyFile("password");
     
  //Fetching Data from excel
     //eLib.writeDataIntoExcel("admin", 0, 1, "'"+jLib.getRandomNo());
     
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
       
       //ADD student details
       
       driver.findElement(By.linkText( "Add Student")).click();	
       
       HashMap<String,String> map = eLib.hashMapData("Sheet1", 0);
		/*
		 * for(int i=0; i<=sh;i++) {
		 * 
		 * String key = eLib.readDataFromExcel("admin", i, 0); String value =
		 * eLib.readDataFromExcel("admin", i, 1); map.put(key,value);
		 * 
		 * 
		 * }
		 */
       for(Entry<String, String> set : map.entrySet()) 
       {
    	   driver.findElement(By.name(set.getKey())).sendKeys(set.getValue());
    	   
       }
       
      /* for(int i=0;i<=sh; i++) {
    	   
    	   String att = eLib.readDataFromExcel("admin", i, 0);
    	   
    	   String value  = eLib.readDataFromExcel("admin", i, 1);
    	   driver.findElement(By.id(att)).sendKeys(value);
    	   
    	   
       }*/
       
    	   
      WebElement element = driver.findElement(By.id("gender"));
        wLib.selectdropdown(element, "Female");
        
        
        
        driver.findElement(By.id("fileToUpload")).sendKeys("C:\\Users\\User\\Pictures\\Screenshots\\Screenshot (4).png");
        
     WebElement element1 =  driver.findElement(By.id("g_gender"));
     
     wLib.selectdropdown(element1, "Female");
      
     
     driver.findElement(By.id("g_fileToUpload")).sendKeys("C:\\Users\\User\\Pictures\\Screenshots\\Screenshot (5).png");
     Thread.sleep(5000);
     driver.findElement(By.id("btnSubmit")).click();
     
      
	}

	
}
