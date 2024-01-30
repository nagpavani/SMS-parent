package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericUtilities.WebDriverUtility;

public class MySonsExamTimeTablePage extends WebDriverUtility {
	@FindBy(id="exam")
 private WebElement exam;
	@FindBy(xpath="//button[.='Submit']")
	private WebElement submit;
	

	public MySonsExamTimeTablePage(WebDriver driver) {
		PageFactory.initElements( driver,this);
		
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getExam() {
		return exam;
	}
	 
	public void sonsExamTimeTablePage(WebDriver driver,String EXAM) {
		WebDriverUtility wb = new WebDriverUtility();
		wb.selectdropdown(EXAM, exam);
		submit.click();
				
		
	}
	
	
	

}
