package practicesTestNG;

import org.testng.annotations.Test;

public class DemoTest {

	
	@Test(priority=2,groups="regression")
	public void demoTest()
	{
		System.out.println("print1");
	}
	@Test(priority=1,groups={"smoke","regression"})
	public void demoTest1() {
		System.out.println("print 2");
	}
}
