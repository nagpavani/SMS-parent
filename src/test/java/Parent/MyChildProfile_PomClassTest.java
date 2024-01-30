package Parent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ObjectRepo.DashBoardPage;
import com.ObjectRepo.LoginPage;
import com.genericUtilities.BaseClass;
import com.genericUtilities.FileUtils;
import com.genericUtilities.WebDriverUtility;
@Listeners(com.genericUtilities.ListenerImpClass.class)
public class MyChildProfile_PomClassTest extends BaseClass {
	@Test
	public  void myChildProfile() throws Exception {
		FileUtils fLib = new FileUtils();
		WebDriverUtility wLib = new WebDriverUtility();
	
		
		 String EMAIL1 = fLib.readDataFromPropertyFile("email1");
		String PASSWORD1 =fLib.readDataFromPropertyFile("password1");
		
		
		String expected ="Student 1";
	
		 //login to parent  page
		
		LoginPage lp = new LoginPage(driver);
	      lp.loginpage(EMAIL1, PASSWORD1);
	      //checking whether child belong to parent are not
	      DashBoardPage dp = new DashBoardPage(driver);
	      dp.getProfile();
	     dp.getSonprofile();
	     
	      String ele=driver .findElement(By.id("full_name")).getText();
	      
	      Assert.assertEquals(expected, ele);
	      System.out.println("child name was correct");
	      
	   /*  if(ele.equals("Student 1")) {
	    	  System.out.println("child name was correct");
	      }
	      else
	    	   {
	    		  System.err.println("child name was incorrect");
	      }*/
	     DashBoardPage db = new DashBoardPage(driver);
	       db.logout();
	          
	       	}
	}



