package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericUtilities.WebDriverUtility;

public class TeacherMyStudent extends WebDriverUtility {
	@FindBy(xpath="//span[text()='My Student']")
	private WebElement mystudent;
	
	@FindBy(id ="grade")
	private WebElement grade;
	
	@FindBy(xpath ="//button[.='Submit']")
	private WebElement submit;

	public TeacherMyStudent(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public void getStudent() {
		mystudent.click();;
	}

	public WebElement getGrade() {
		return grade;
	}

	public void getSubmit() {
		 submit.click();
	}
	
	public void grade(String element) {
		WebDriverUtility wb = new WebDriverUtility();
		wb.selectdropdown(element, grade);
		
		
		
	
	}

	

}
