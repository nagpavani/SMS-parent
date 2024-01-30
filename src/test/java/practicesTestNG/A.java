package practicesTestNG;

import org.testng.annotations.Test;

import com.genericUtilities.BaseClass;

public class A  extends BaseClass{
	@Test
	public void m1() {
		System.out.println("script-1");
	}
	@Test
	public void m2() {
		System.out.println("script-2");
	}
	@Test
	public void m3() {
		System.out.println("script-3");
	}

}
