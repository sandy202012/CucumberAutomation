package driverutil;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {

	
	public static String getDriversPath()
	{
		String userDirectory = System.getProperty("user.dir");
		return userDirectory + "/drivers";
		
	}
	
	public static void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	public static boolean waitForElementToAppearByXpath(WebDriver driver, String xpath, Duration timeOutInSeconds, String timeOutMessage) 
	 {
	 	boolean waitUntil = false;
	     try {
	    	 
	       WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
	        waitUntil =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).isDisplayed();
	        
	     } catch (Exception e) {
	       
	     }
	     
	      
	     
	     return waitUntil;
	   }

}
