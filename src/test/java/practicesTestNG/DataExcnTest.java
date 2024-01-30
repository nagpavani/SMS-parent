package practicesTestNG;

import org.testng.annotations.Test;

public class DataExcnTest {
	
	@Test(dataProviderClass = DataproviderTest.class, dataProvider ="data")
	public void executeDp(String source,String destination) {
		System.out.println(source+"----->"+destination);
	}

}
