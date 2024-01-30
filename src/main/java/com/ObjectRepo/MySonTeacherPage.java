package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MySonTeacherPage {
	@FindBy(xpath="//input[@type='search']")
	private WebElement search;

	public MySonTeacherPage(WebDriver driver) {
	PageFactory.initElements( driver,this);
		
	}

	public WebElement getSearch() {
		return search;
	}
	public void searchSonTeacher() {
		search.click();
	}

}
