package com.ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage {
	
	@FindBy(id="btnEdit")
	private WebElement edit; 
	
	@FindBy(id="btnUpdate")
	private WebElement update;

	public MyProfilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}

	public WebElement getEdit() {
		return edit;
	}

	public WebElement getUpdate() {
		return update;
	}

	//Business Library
	
	public void edit() {
		edit.click();
	}
	public void update(WebDriver driver,String address) {
		driver.findElement( By.xpath("//input[@id='address1']")).sendKeys(address);
		update.click();
	}
	
	
	
	

}
