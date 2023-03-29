package basf.com.gbpo.selenium.drivers;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;


import io.cucumber.core.logging.Logger;
import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDriver {

	private static final WebDriver driver;
	
	
    static void setupClass() {
    	System.setProperty("webdriver.chrome.driver", "/src/test/java/drivers/chromedriver");
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver = new ChromeDriver();
    	
    }

   

    

  
    void test() {
        // Exercise
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
        String title = driver.getTitle();

        
    }

}
	
		
}
