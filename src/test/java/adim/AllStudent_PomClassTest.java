package adim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.ObjectRepo.AdminDashBoardPage;
import com.ObjectRepo.AllStudentPage;
import com.ObjectRepo.DashBoardPage;
import com.ObjectRepo.LoginPage;
import com.genericUtilities.BaseClass;
import com.genericUtilities.ExcelUtils;
import com.genericUtilities.FileUtils;
import com.genericUtilities.JavaUtils;
import com.genericUtilities.WebDriverUtility;


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
public class AllStudent_PomClassTest extends BaseClass {
	private static String EMAIL;
@Test
	public  void allStudents() throws Exception {
		JavaUtils jLib = new JavaUtils();
		ExcelUtils eLib = new ExcelUtils();
		
		
		 String EMAIL = fLib.readDataFromPropertyFile("email");
		String PASSWORD =fLib.readDataFromPropertyFile("password");
		
	      
       LoginPage lp =new LoginPage( driver);
       lp.loginpage(EMAIL, PASSWORD);
       
       
       //entering student details
       
       AdminDashBoardPage ap = new AdminDashBoardPage(driver);
       ap.getStudent();
       	
       
       //search All student 
       
     ap.getAllStudent();
     AllStudentPage as = new AllStudentPage(driver);
     as.grade("QSpiders_Premium");
     //logout
     DashBoardPage db = new DashBoardPage(driver);
     db.logout();
     
     
	}

}
