package practicesTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderTest {
	
	@DataProvider
	public Object[][] data() {
	
	Object [][]obj=new Object[2][2];
	obj[0][0]="Bangolore";
	obj[0][1]="hyd";
	
	obj[1][0]="hyd";
	obj[1][1]="chhennai";
	
	return obj;
	
	}
	
	@Test(dataProvider="data")
	public void test(String state, String capital)
	{
		System.out.println(state+" --> "+capital);
	}
	
}
