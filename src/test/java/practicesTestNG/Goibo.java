package practicesTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibo {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[@class='sc-gsFSXq bGTcbn']")).click();
  WebElement ele1	=driver.findElement(By.xpath("(//p[.='Enter city or airport'])[1]"));
  ele1.click();
 
		
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Bengaluru");
	 driver.findElement(By.xpath("//span[contains(.,'Bengaluru, India')]"))
	.click();
	Thread.sleep(3000);
	
	 
//	WebElement ele2=	driver.findElement(By.xpath("//span[text()='To']/following-sibling::p"));
//			ele2.click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hyd");
		driver.findElement(By.xpath("(//div[@class='sc-12foipm-43 jTMHVp'])[1]")).click();
		
//		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='January 2024']/ancestor::div[@class='DayPicker-Caption']/following-sibling::div[@class='DayPicker-Body']//p[@class='fsw__date'and text()='27']")).click();
		driver.findElement(By.xpath("//span[text()='Done']")).click();
		driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']")).click();
		
		
		
		
		
	}

}
