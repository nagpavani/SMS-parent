package practicesTestNG;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import com.ObjectRepo.IrtcHomePage;


public class Irtc {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()=' BUSES ']")).click();
		
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		
		for (String cid : child) {
			if(!parent.equals(cid)) {
				driver.switchTo().window(cid);
			}
			
		}
		driver.findElement(By.xpath("//input[@id='departFrom']")).sendKeys("Ben");
		driver.findElement(By.xpath("//div[.='Bengaluru']")).click();
		
		driver.findElement(By.xpath("//input[@id='goingTo']")).sendKeys("hyd");
		driver.findElement(By.xpath("//div[.='Hyderabad']")).click();
		driver.findElement(By.xpath("//input[@id='departDate']")).click();
		
driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[5]/td[@data-handler='selectDay']/a[@class='ui-state-default' and text()='29']")).click();
driver.findElement(By.xpath("//i[@class='fas fa-search ml-1']")).click();
driver.findElement(By.xpath("//h4[.='Departure Time']/following-sibling::ul//label[.='After 6 pm']")).click();
//driver.findElement(By.xpath("//div[@class='col-md-9 col-lg-10']//div[@class='search-result-card'][18]//div[@class=\"SearchCard SearchCard07']/button")).click();
driver.findElement(By.xpath("//label[text()='Yolo Bus']/parent::div/following-sibling::div/label[text()='18:00']/parent::div/following-sibling::div/button")).click();
driver.findElement(By.xpath("//span[@title='Seat No. : SL3 | Fare : INR 2203.95']")).click();
	}
	
	

	
}


