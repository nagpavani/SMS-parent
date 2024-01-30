package Parent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.genericUtilities.FileUtils;
import com.genericUtilities.WebDriverUtility;

public class EditMyProfile {

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
	       driver.findElement(By.xpath("//a[.=' My Profile']")).click();
	       driver.findElement(By.id("btnEdit")).click();
	      WebElement element= driver.findElement(By.id("gender2"));
	      wLib.selectdropdown("Female",element);
	      driver.findElement(By.id("btnUpdate")).click();
	      String gender = driver.findElement(By.id("gender")).getText();
	      if(gender.equals("Female")) {
	    	  System.out.println("yes select gender is true");
	      }
	      

	}

}
