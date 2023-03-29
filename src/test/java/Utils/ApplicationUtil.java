package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import appxpaths.AppXpathsConstants;
import driverutil.Driver;

public class ApplicationUtil {

	public static boolean openApplication(WebDriver driver,String url,String title)
	{
		Driver.maximizeWindow(driver);
		
        Driver.waitForElementToAppearByXpath(driver, AppXpathsConstants.username, 60, "Login is not confirmed");
       
	
	}
	
	
	
}
