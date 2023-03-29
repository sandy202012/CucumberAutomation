package basf.com.gbpo.selenium.drivers;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import DriverUtil.Driver;
import io.cucumber.core.logging.Logger;

public class ChromeDriver {

	public WebDriver driver;
	public static String highlight;
	private OptionsManager optionsManager;
	private Properties prop;
   public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();
	
	public static final Logger log = Logger.getLogger(String.valueOf(ChromeDriver.class));
	public WebDriver initDriver(Properties prop) {
//		if(prop.getProperty("browser") == null) {
//			String browserName = System.getProperty("browser");
//		}
		String browserName = prop.getProperty("browser");
		String browserVersion = prop.getProperty("browserversion");
		log.info("browser name : " + browserName + " and browserversion: " + browserVersion);

		highlight = prop.getProperty("highlight");

		System.out.println("browser name is : " + browserName);
		optionsManager = new OptionsManager(prop);
		if (browserName.equalsIgnoreCase("chrome")) {

			if (Boolean.parseBoolean(prop.getProperty("remote"))) {
				log.info("running test on remote");
				init_remoteDriver("chrome", browserVersion);
			} else {
				log.info("running test on local");
				WebDriverManager.chromedriver().setup();
				tlDriver.set(new ChromeDriver(optionsManager.getChromeOptions()));
			}

		}

		else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();

			if (Boolean.parseBoolean(prop.getProperty("remote"))) {
				init_remoteDriver("firefox", browserVersion);
			} else {
				WebDriverManager.firefoxdriver().setup();
				tlDriver.set(new FirefoxDriver(optionsManager.getFirefoxOptions()));
			}

		} else if (browserName.equalsIgnoreCase("safari")) {
			tlDriver.set(new SafariDriver());
		}

		else {
			System.out.println("please pass the right browserName : " + browserName);
		}

		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();

		getDriver().get(prop.getProperty("url"));

		return getDriver();

	}
		
}
}