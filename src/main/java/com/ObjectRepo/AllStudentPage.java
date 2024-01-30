package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.genericUtilities.WebDriverUtility;

public class AllStudentPage extends WebDriverUtility {
	@FindBy(id ="grade")
	private WebElement grade;

	@FindBy(xpath ="//button[.='Submit']")
	private WebElement submit;

	public AllStudentPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
		
	}

	public WebElement getGrade() {
		return grade;
	}

	public void getSubmit() {
		submit.click();
	}
	
	public void grade(String element) {
		WebDriverUtility wb = new WebDriverUtility();
		wb.selectdropdown( element, grade);
		submit.click();

	}
	
			
}
