package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	
	
//Declaration
	@FindBy(xpath="//span[.='Profile']")
	private WebElement profile;
	
	@FindBy(linkText =" My Profile")
	private WebElement myprofile;
	
	@FindBy(xpath ="//a[text()=' My Son's Profiler']")
	private WebElement sonprofile;
	
	@FindBy(xpath="//span[.='Teacher']")
	private WebElement teacher;
	
	@FindBy(linkText =" My Son's Teacher")
	private WebElement sonteacher;
	
	@FindBy(linkText =" All Teacher")
	private WebElement allteacher;
	
	@FindBy(xpath="//span[.='Subject']")
	private WebElement subject;
	
	@FindBy(linkText=" My Son's Subject")
	private WebElement sonSubject;
	
	@FindBy(linkText=" All Subject")
	private WebElement allSubject;
	
	@FindBy(xpath="//span[.='Timetable']")
	private WebElement timetable;
	
	@FindBy(linkText=" My Son's Timetable")
	private WebElement sontimetable;
	
	@FindBy(linkText="All Timetable")
	private WebElement alltimble ;
	
	@FindBy(xpath="//span[.='Attendance")
	private WebElement attendance ;
	
	@FindBy(linkText=" My Son's Attendance")
	private WebElement sonsAttendance ;
	
	@FindBy(linkText=" My Son's Attendance History")
	private WebElement sonsAttendanceHistory  ;
	
	@FindBy(xpath="//span[.='My Son's Payments']")
	private WebElement  mysonsPayment;
	
	@FindBy(xpath="//span[.='Exam']")
	private WebElement exam ;
	
	
	@FindBy(linkText=" My Son's Exam Marks")
	private WebElement sonsExamMark ;
	
	@FindBy(linkText=" My Son's  Exam Marks History")
	private WebElement sonsExamMarkHistory  ;
	
	@FindBy(linkText="My Son's Exam Timetable")
	private WebElement sonsExamTimetable ;
	
	@FindBy(xpath="//input[@type='search']")
	private WebElement search;
	
	@FindBy(xpath="//img[@class='user-image']")
	private WebElement logoutimage;
	
	@FindBy(linkText="Sign out")
	private WebElement signout;

	
	
	
//initialization

	public DashBoardPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		}

	public WebElement getSearch() {
		return search;
	}


	public WebElement getLogoutimage() {
		return logoutimage;
	}


	public WebElement getSignout() {
		return signout;
	}
	public void getProfile() {
		 profile.click();
	}


	public void getMyprofile() {
	myprofile.click();
	}


	public void getSonprofile() {
		sonprofile.click();
	}


	public void getTeacher() {
		teacher.click();
	}


	public void getSonteacher() {
		 sonteacher.click();
	}


	public void getAllteacher() {
		allteacher.click();
	}


	public void getSubject() {
		subject.click();
	}


	public void getSonSubject() {
		 sonSubject.click();
	}


	public void getAllSubject() {
		 allSubject.click();
	}


	public void getTimetable() {
		timetable.click();
	}


	public void getSontimetable() {
		 sontimetable.click();
	}


	public void getAlltimble() {
		 alltimble.click();
	}


	public void getAttendance() {
		attendance.click();
	}


	public void getSonsAttendance() {
		sonsAttendance.click();
	}


	public void getSonsAttendanceHistory() {
		sonsAttendanceHistory.click();;
	}


	public void getMysonsPayment() {
		 mysonsPayment.click();;
	}


	public void getExam() {
		 exam.click();
	}


	public void getSonsExamMark() {
		sonsExamMark.click();
	}


	public void getSonsExamMarkHistory() {
		sonsExamMarkHistory.click();
	}


	public void getSonsExamTimetable() {
		sonsExamTimetable.click();
	}
	
	public void getSearch(String element) {
		 search.sendKeys(element);
	}
	
	//Business library [utilization]
	
	public void logout() {
		logoutimage.click();
		signout.click();
		
		
}
}
