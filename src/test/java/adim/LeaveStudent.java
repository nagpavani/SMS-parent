package adim;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.genericUtilities.FileUtils;
import com.genericUtilities.WebDriverUtility;

public class LeaveStudent {
	public static void main(String[] args) throws Exception {
		FileUtils fLib = new FileUtils();
		WebDriverUtility wLib = new WebDriverUtility();
	
		String URL = fLib.readDataFromPropertyFile("url");
		 String EMAIL = fLib.readDataFromPropertyFile("email");
		String PASSWORD =fLib.readDataFromPropertyFile("password");
		
	      // launching the Browser
	       WebDriver driver=new ChromeDriver();
	       driver.get(URL);
	      
	       //maximizing Browser
	       driver.manage().window().maximize();
	       
	       //implicit wait
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
	       //login to admin page
	       
	       driver.findElement(By.id("email")).sendKeys(EMAIL);
	       driver.findElement(By.id("password")).sendKeys(PASSWORD);
	       driver.findElement(By.id("btnSubmit")).click();
	       
	       driver.findElement(By.linkText("Student")).click();
	       driver.findElement(By.xpath("//a[.=' Leave Student']")).click();
	       driver.findElement(By.xpath("//input[@type='search']")).sendKeys("pavani");
	       
	 
	       
	       
		
	}

}
