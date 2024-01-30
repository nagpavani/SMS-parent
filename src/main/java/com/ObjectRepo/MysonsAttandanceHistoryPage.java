package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericUtilities.WebDriverUtility;

public class MysonsAttandanceHistoryPage extends WebDriverUtility {
	@FindBy(name="year")
private WebElement year; 
	@FindBy(name="month")
	private WebElement month ; 
	@FindBy(id="btnSubmit")
 private WebElement submit;	
	public MysonsAttandanceHistoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getMonth() {
		return month;
	}
	
	public WebElement getSubmit() {
		return submit;
	}

	//business library
	public void sonsAttandaceHistory(WebDriver driver,String YEAR,String MONTH) {
		WebDriverUtility wb =new WebDriverUtility();
		wb.selectdropdown(YEAR,year);
		wb.selectdropdown(MONTH, month);
		submit.click();
		
		
	}

}
