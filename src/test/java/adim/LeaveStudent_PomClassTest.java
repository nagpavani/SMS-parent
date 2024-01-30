package adim;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ObjectRepo.AdminDashBoardPage;
import com.ObjectRepo.DashBoardPage;
import com.ObjectRepo.LeaveStudentpage;
import com.ObjectRepo.LoginPage;
import com.genericUtilities.BaseClass;
import com.genericUtilities.FileUtils;
import com.genericUtilities.WebDriverUtility;
@Listeners(com.genericUtilities.ListenerImpClass.class)
public class LeaveStudent_PomClassTest extends BaseClass {
	@Test
	public void leaveStudent() throws Exception {
		
	
		
		 String EMAIL = fLib.readDataFromPropertyFile("email");
		String PASSWORD =fLib.readDataFromPropertyFile("password");	       
	      
		//login to admin page
	       LoginPage lp =new LoginPage( driver);
	       lp.loginpage(EMAIL, PASSWORD);
	       
	       AdminDashBoardPage ap = new AdminDashBoardPage(driver);
	       ap.getStudent();
	       //checking for leaveStudent
	       LeaveStudentpage lsp = new LeaveStudentpage(driver);
	       lsp.getLeavestudent();
	       
	       DashBoardPage dp = new DashBoardPage(driver);
	       dp.getSearch("pavani");
	       
	       DashBoardPage db = new DashBoardPage(driver);
	       db.logout();
	       System.out.println("logout");
	      
	}
}
