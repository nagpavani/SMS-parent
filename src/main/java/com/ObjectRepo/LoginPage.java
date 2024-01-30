package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Declaration
	
	 @FindBy(id="email")
	 private WebElement email;
	 
	 @FindBy(id="password")
	 private WebElement password;
	 
	 @FindBy(id="btnSubmit")
	 private WebElement submit;
	 
	//Initialization

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	 
	

	//utilization
	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return submit;
	}
	 
	//Business library
	
	public void loginpage(String EMAIL,String PASSWORD) {
		email.sendKeys(EMAIL);
		password.sendKeys(PASSWORD);
		submit.click();
		
	}
	
	

}
