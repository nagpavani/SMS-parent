package practicesTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

public class AnnotationsTest {
	@BeforeSuite
	public void dataBaseConnection() {
		System.out.println("connected");
		
	}
	@BeforeClass
	public void lunachingBrowser() {
		System.out.println("browser lunached");
	}
	@BeforeMethod
	public void loginToApplication() {
		System.out.println("login");
	}
	@Test
	public void testScript() {
		System.out.println("script");
		
	}
	

 @AfterMethod
 
 public void e() {
	 System.out.println("logout");
 }
 @AfterClass
 public void c() {
	 System.out.println("close browser");
	 }
 @AfterSuite
 public void as() {
	 System.out.println("disconnect Db");
 }
 
 
	
}
