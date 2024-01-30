package practicesTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {

	@Test
	public void title() {
		String expected ="Online Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!\r\n";
				
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	String title	= driver.getTitle();
	SoftAssert sa = new SoftAssert();
	sa.assertEquals(title, expected, "assert passed");
	sa.assertAll();
	//Assert.assertEquals(title, expected);
	System.out.println(title);
	

}
}
