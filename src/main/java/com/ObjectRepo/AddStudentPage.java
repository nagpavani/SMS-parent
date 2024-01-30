package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericUtilities.WebDriverUtility;

public class AddStudentPage extends WebDriverUtility {
	
	@FindBy(id ="gender")
	private WebElement gender;
	
	@FindBy(id="fileToUpload")
	private WebElement photo;
	
	
	@FindBy(id ="g_gender")
	private WebElement P_gender;
	
	@FindBy(xpath ="//button[.='Next']")
	private WebElement next;
	
	@FindBy(id="btnSubmit")
	private WebElement submit;
	

	public void getSubmit() {
		submit.click();
	}

	public void getNext() {
		next.click();
	}

	public AddStudentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getPhoto() {
		return photo;
	}
	public WebElement getP_gender() {
		return P_gender;
	}

	public void gender(WebDriver driver,String Gender ) {
		WebDriverUtility wb = new WebDriverUtility();
		wb.selectdropdown(Gender, gender);
	}
	public void parentgender(WebDriver driver,String Gender ) {
		WebDriverUtility wb1 = new WebDriverUtility();
		wb1.selectdropdown(Gender, P_gender);
	}

	
}
