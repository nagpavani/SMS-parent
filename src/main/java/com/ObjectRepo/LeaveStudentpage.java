package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeaveStudentpage {
	@FindBy(xpath ="//a[.=' Leave Student']")
	private WebElement leavestudent;

	public LeaveStudentpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public void getLeavestudent() {
	leavestudent.click();
	}
	

	
	
}
