package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericUtilities.WebDriverUtility;

public class MySonsExamMarkHistoryPage extends WebDriverUtility {
	
	@FindBy(id="year")
	private WebElement year;
	
	@FindBy(id="exam")
	private WebElement exam;
	
	@FindBy(id="btnSubmit")
	private WebElement submit;


	public MySonsExamMarkHistoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getExam() {
		return exam;
	}
	
public WebElement getSubmit() {
		return submit;
	}

public void sonsExamMarkHistory(WebDriver driver,String YEAR,String EXAM) {
	WebDriverUtility wb = new WebDriverUtility();
	wb.selectdropdown(YEAR, exam);
	wb.selectdropdown(EXAM, exam);
	submit.click();
	
}
	

}
