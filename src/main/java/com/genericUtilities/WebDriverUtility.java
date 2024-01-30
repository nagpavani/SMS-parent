package com.genericUtilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class WebDriverUtility {
	 /**
	  * This method is for maximization of window
	  * @param driver
	  */
	
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	 /**
	  * This method is for minimization of window
	  * @param driver
	  */
	
	public void minimizeWindow(WebDriver driver) {
		driver.manage().window().minimize();
	}
	/**
	 * This method is for implicit wait
	 * @param driver
	 * @param seconds
	 */
	public void waitForPageLoad(WebDriver driver,int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	/**
	 * This method is used to create object Explicitly wait 
	 * @param driver
	 * @param seconds
	 * @return
	 */
	public WebDriverWait waitDriverWaitObj(WebDriver driver,int sec) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(sec));
		return wait;
	}
	/**
	 * This method to know alert popup is present
	 * @param driver
	 * @param seconds
	 */
	public void explicitWait(WebDriver driver,int sec) {
		
		
		waitDriverWaitObj(driver, sec).until(ExpectedConditions.alertIsPresent());
	}
	/**
	 * This method to know elements clickable or not 
	 * @param driver
	 * @param seconds
	 * @param element
	 */
	public void explicitWait(WebDriver driver,int sec,WebElement element) {
		waitDriverWaitObj(driver, sec).until(ExpectedConditions.elementToBeClickable(element));
	}

	
	
	//Dropdown methods
	/**
	 * This method is for select class object
	 * @param element
	 * @return
	 */
	public Select selectObject(WebElement element) {
		Select select = new Select(element);
		return select;
	}
	/**
	 *  This method is for select value from dropdown
	 * @param driver
	 * @param 
	 * @return 
	 */
	public void selectdropdown(WebElement element,String data) {
		 selectObject(element).selectByValue(data);
		
		
	}
	/**
	 * This method is for select visible text from dropdown
	 * @param data
	 * @param element
	 */
	public void selectdropdown(String data,WebElement element) {
		selectObject(element).selectByVisibleText(data);
	}
	/**
	 * This method is for select index from dropdown
	 * @param element
	 * @param data
	 */
	public void selectdropdown(WebElement element,int data) {
		selectObject(element).selectByIndex(data);
	}
	//deselect methods
	/**
	 * This method is for de-selecting index value from dropdown
	 * @param element
	 * @param data
	 */
	public void deselectdropdown(WebElement element,int data) {
		selectObject(element).deselectByIndex(data);
		
	}
	/**
	 *  This method is for de-selecting visible text from dropdown
	 * @param element
	 * @param data
	 */
	public void deselectdropdown(WebElement element,String data) {
		selectObject(element).deselectByVisibleText(data);
	}
	/**
	 *  This method is for de-selecting Value from dropdown
	 * @param element
	 * @param data
	 */
	public void deselectdropdown(String data,WebElement element) {
		selectObject(element).deselectByValue(data);
	}
	
	//Actions class
	/**
	 * This method is for creating objects for Actions class
	 * @param driver
	 * @return
	 */
	public Actions actionsClassObject(WebDriver driver) {
		Actions act = new Actions(driver);
		return act;
	}
	/**
	 * This method is for performing scrolling Actions 
	 * @param driver
	 * @param element
	 */
	
	
	public void MouseActions(WebDriver driver,WebElement element) {
		
		actionsClassObject(driver).scrollToElement(element).perform();
	}
	/**
	 * This method is for performing mouse-over to particular element 
	 * @param driver
	 * @param element
	 */
	public void MouseActionst(WebDriver driver,WebElement element) {
		actionsClassObject(driver).moveToElement(element).perform();
	}
	/**
	 * This method is for performing  click on particular element
	 * @param driver
	 */
	public void MouseActionsClickOnElement(WebDriver driver,WebElement element) {
		actionsClassObject(driver).click(element).perform();
	}
	/**
	 * This method is for performing  Rightclick on particular element
	 * @param driver
	 * @param element
	 */
	public void MouseActionsRightClick(WebDriver driver,WebElement element) {
		actionsClassObject(driver).contextClick(element).perform();
	}
	/**
	 * This method is for performing  Drag and drop one element to another element particular element
	 * @param driver
	 * @param element1
	 * @param element
	 */
	public void MouseActions(WebDriver driver,WebElement element1,WebElement element) {
		actionsClassObject(driver).dragAndDrop(element1,element).perform();
	}
	/**
	 *  This method is To move element in particular axis
	 * @param driver
	 * @param element
	 * @param x
	 * @param y
	 */
	public void MouseActions(WebDriver driver,WebElement element,int x,int y) {
		actionsClassObject(driver).moveToElement(element,x,y).perform();
	}
	//Robot class
	
	/**
	 * @throws AWTException 
	 * 
	 */
	public void robotEnter() throws AWTException  {
		Robot r = new Robot();
     r. keyPress(KeyEvent.VK_ENTER);
 r.keyRelease(KeyEvent.VK_ENTER);
		
		}
	/**
	 * This Method is for copy and paste particular element and click enter
	 * @throws Exception
	 */
	public void robotCopyPaste() throws Exception  {
		Robot r = new Robot(); 
		
      r.keyPress(KeyEvent.VK_CONTROL);
      r.keyPress(KeyEvent.VK_A);
      
      r.keyRelease(KeyEvent.VK_CONTROL);
      r.keyRelease(KeyEvent.VK_A);
      
      r.keyPress(KeyEvent.VK_CONTROL);
      r.keyPress(KeyEvent.VK_C);
      
     
      r.keyRelease(KeyEvent.VK_CONTROL);
      r.keyRelease(KeyEvent.VK_C);
      
      r.keyPress(KeyEvent.VK_TAB);
      r.keyPress(KeyEvent.VK_TAB);
      
      
      r.keyPress(KeyEvent.VK_CONTROL);
      r.keyPress(KeyEvent.VK_V);
      
     
      r.keyRelease(KeyEvent.VK_CONTROL);
      r.keyRelease(KeyEvent.VK_V);
      
      r.keyPress(KeyEvent.VK_ENTER);
      r.keyRelease(KeyEvent.VK_ENTER);
      
		
		
		}
	
	//Alert popup
	/**
	 * This method to accept alret popup
	 * @param driver
	 */
	
	public void alertPopUpAccept(WebDriver driver) {
		
		driver.switchTo().alert().accept();
		 
	}
	/**
	 * This method to reject alret popup
	 * @param driver
	 */
public void alertPopUpReject(WebDriver driver) {
		
		driver.switchTo().alert().dismiss();
}
/**
 * This method to get text from alret popup
 * @param driver
 */
	
public void alerttext(WebDriver driver) {
	
	driver.switchTo().alert().getText();
	 
}

//handle frame
/**
 * This method to swith from one frame to another frame with its index number
 * @param driver
 * @param x
 */
public void switchFrame(WebDriver driver,int x) {
	driver.switchTo().frame(x);
	
}
/**
 * This method to switch back to parent frame from existing frame
 * @param driver
 */
public void switchParent(WebDriver driver) {
	driver.switchTo().defaultContent();
	
}
 //Screen shot
/** 
 * This method to take screen shot 
 * @param driver
 * @param screenShotName
 * @return 
 * @throws IOException
 */
public static String screenShot(WebDriver driver,String screenShotName) throws IOException {
	JavaUtils ju=new JavaUtils();
	 TakesScreenshot ts = (TakesScreenshot) driver;
	 
File src = ts.getScreenshotAs(OutputType.FILE);
String path ="./screenshot/"+screenShotName+ju.getSystemDateInFormat()+".jpg";

File dest = new File(path);
FileUtils.copyFile(src, dest);
return path;
	
}


//scrollBar
/**
 * This method to Scroll in x and y axis of particular page
 * @param driver
 */
public void javaScript(WebDriver driver ) {
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,500)","");
}
//Window handling
public void windowHandling(WebDriver driver) {
     String parentId = driver.getWindowHandle();
	  Set<String> childId = driver .getWindowHandles();
	  for(String id:childId)
	if(!parentId .equals(id)) {
		driver.switchTo().window(id);
		}

	
}

	
	
	}

