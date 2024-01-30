package Parent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ObjectRepo.DashBoardPage;
import com.ObjectRepo.LoginPage;
import com.ObjectRepo.MyProfilePage;
import com.genericUtilities.BaseClass;
import com.genericUtilities.FileUtils;
import com.genericUtilities.WebDriverUtility;
@Listeners(com.genericUtilities.ListenerImpClass.class)
public class EditMyProfile_PomClassTest extends BaseClass {
	@Test
	public  void editMyProfile() throws Exception {
		FileUtils fLib = new FileUtils();
		WebDriverUtility wLib = new WebDriverUtility();
	
		
		 String EMAIL1 = fLib.readDataFromPropertyFile("email1");
		String PASSWORD1 =fLib.readDataFromPropertyFile("password1");
		

	       
	       //login to parent  page
		 LoginPage lp = new LoginPage(driver);
	      lp.loginpage(EMAIL1, PASSWORD1);
	      
	      
	       //click on profile
	      DashBoardPage dp = new DashBoardPage(driver);
	      dp.getProfile();
	     
	     dp.getMyprofile();
	     
	       //editing profile
	     MyProfilePage mpg = new  MyProfilePage(driver);
	     mpg.edit();
	     
	       mpg.update(driver, "india");
	      
	       DashBoardPage db = new DashBoardPage(driver);
	       db.logout();
	          

	}

}
