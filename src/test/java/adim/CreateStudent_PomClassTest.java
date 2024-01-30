package adim;

import java.util.HashMap;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ObjectRepo.AddStudentPage;
import com.ObjectRepo.AdminDashBoardPage;
import com.ObjectRepo.LoginPage;
import com.genericUtilities.BaseClass;
import com.genericUtilities.ExcelUtils;
import com.genericUtilities.FileUtils;
import com.genericUtilities.JavaUtils;
import com.genericUtilities.WebDriverUtility;
@Listeners(com.genericUtilities.ListenerImpClass.class)
public class CreateStudent_PomClassTest extends BaseClass {
@Test(retryAnalyzer = com.genericUtilities.RetryImpClass.class)
	public  void createStudent() throws Exception {
		JavaUtils jLib = new JavaUtils();
		ExcelUtils eLib = new ExcelUtils();
		
	    String EMAIL = fLib.readDataFromPropertyFile("email");
	     String PASSWORD = fLib.readDataFromPropertyFile("password"); 
	     
	       //login to admin page
	     LoginPage lp = new LoginPage(driver);
	     lp.loginpage(EMAIL, PASSWORD);
	       
	       //entering student details
	     AdminDashBoardPage apg = new AdminDashBoardPage(driver);
	     apg.getStudent();
	     
  //ADD student details
	     apg.getAddStudent();
	       
	       HashMap<String,String> map = eLib.hashMapData("Sheet1", 0);
			
	       for(Entry<String, String> set : map.entrySet()) 
	       {
	    	   driver.findElement(By.name(set.getKey())).sendKeys(set.getValue());
	    	   
	       }
	       AddStudentPage asp = new AddStudentPage(driver);
	       asp.gender(driver,"Female");
	      
	    driver.findElement(By.id("fileToUpload")).sendKeys("C:\\Users\\User\\Pictures\\Screenshots\\Screenshot (4).png");
	        
	        asp.parentgender(driver,"Female" );
	    
 driver.findElement(By.id("g_fileToUpload")).sendKeys("C:\\Users\\User\\Pictures\\Screenshots\\Screenshot (5).png");
	     asp.getSubmit();
	    asp.getNext();
	     
	}
}