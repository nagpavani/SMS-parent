package practicesTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dp_test {
	
	@Test(enabled=false)
	public void test()
	{
		System.out.println("print 3");
	}

	@Test(groups="smoke")
	public void test1() {
		System.out.println("print 4");
	}
}
