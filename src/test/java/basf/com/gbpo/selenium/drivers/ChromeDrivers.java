package basf.com.gbpo.selenium.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDrivers {
	public class GFG_Chrome {
		   
	    public void main(String args[])
	    {
	        System.setProperty(
	            "webdriver.chrome.driver",
	            "/GBPOAppTest/src/test/java/Drivers/chromedriver.exe");
	        // Instantiate a ChromeDriver class.
	        WebDriver driver = new ChromeDriver();
	 
	        // Maximize the browser
	        driver.manage().window().maximize();
	        
	        driver.get("http://gmail.com");
}
}
}