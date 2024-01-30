package Teacher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ObjectRepo.DashBoardPage;
import com.ObjectRepo.LoginPage;
import com.ObjectRepo.TeacherMyStudent;
import com.genericUtilities.BaseClass;
import com.genericUtilities.FileUtils;
import com.genericUtilities.WebDriverUtility;
@Listeners(com.genericUtilities.ListenerImpClass.class)
public class MyStudent_PomPageTest extends BaseClass {
	@Test(groups="integration")
	public  void myStudent() throws Exception {
		FileUtils fLib = new FileUtils();
		WebDriverUtility wLib = new WebDriverUtility();
	
		
		 String EMAIL2 = fLib.readDataFromPropertyFile("email2");
		String PASSWORD2 =fLib.readDataFromPropertyFile("password2");
		
           
           //login to teacher  page
           LoginPage lp = new LoginPage(driver);
 	      lp.loginpage(EMAIL2, PASSWORD2);
 	     
 	      //checking for my student
 	     TeacherMyStudent tms = new TeacherMyStudent(driver);
 	     tms.getStudent();
 	     tms.grade("QSpiders");
 	     tms.getSubmit();
 	     
 	    DashBoardPage db = new DashBoardPage(driver);
	       db.logout();
	          
           
}


}
