package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminDashBoardPage {

	@FindBy(xpath="//span[.='Student']")
	private WebElement Student;
	
	@FindBy(xpath="//a[.=' Add Student']")
	private WebElement addStudent;
	
	
	@FindBy(xpath="//a[.=' All Student']")
	private WebElement AllStudent;
	

	public AdminDashBoardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}



	public void getStudent() {
		Student.click();
	}



	public void getAddStudent() {
		 addStudent.click();
	}



	public void getAllStudent() {
		 AllStudent.click();
	}
	
}
