package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IrtcHomePage {

	@FindBy(linkText=" BUSES ")
	private WebElement slcbuses;

	public IrtcHomePage(WebDriver driver) {
		PageFactory.initElements( driver,this);
		
	}

	public void getSlcbuses() {
		slcbuses.click();
	}
	
	
	
}
