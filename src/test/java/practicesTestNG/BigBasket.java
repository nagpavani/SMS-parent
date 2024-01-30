package practicesTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BigBasket {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bigbasket.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration .ofSeconds(10));
				
				 
	}

}
