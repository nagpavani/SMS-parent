package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericUtilities.WebDriverUtility;

public class MySonsExamPage extends WebDriverUtility {
	
	@FindBy(id ="exam")
	private WebElement exam;
	
	@FindBy(id="btnSubmit")
    private WebElement submit;
	public MySonsExamPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}

	public WebElement getExam() {
		return exam;
	}
	
	public WebElement getSubmit() {
		return submit;
	}

	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}

	public void sonsexam(WebDriver driver, String EXAM) {
		WebDriverUtility wb = new WebDriverUtility();
		wb.selectdropdown(EXAM, exam);
		submit.click();
		
	}
	 
	
	
	
	
	
	

}
