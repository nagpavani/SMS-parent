package com.genericUtilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryImpClass implements IRetryAnalyzer {
 int count =0;
 int Retry=3;
	@Override
	public boolean retry(ITestResult result) {
		if(count<=Retry) {
			count++;
			return true;
		}
		
		return false;
	}
	

}
