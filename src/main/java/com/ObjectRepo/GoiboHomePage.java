package com.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoiboHomePage {
@FindBy(xpath="(//p[@class='sc-12foipm-20 bhnHeQ'])[1]")
 private WebElement from;

@FindBy(xpath="(//p[@class='sc-12foipm-20 bhnHeQ'])[2]")
private WebElement To;

@FindBy(xpath="//span[text()='Departure']")
private WebElement Departuredate;

@FindBy(xpath="//div[@aria-label='Wed Jan 24 2024']")
private WebElement date;


@FindBy(xpath="//span[text()='Done']")
private WebElement donebtn;

@FindBy(xpath="//span[text()='SEARCH FLIGHTS']")
private WebElement searchflight;


}
