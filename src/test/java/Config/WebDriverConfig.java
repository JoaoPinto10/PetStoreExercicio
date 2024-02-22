package Config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverConfig {
	
	public static WebDriver driver;
	
	public static WebDriver StartBrowser(String browser) {
		{
			switch (browser.toLowerCase()) {
			case "chrome":
				// Configuring the path for ChromeDriver (Linux)
				//String chromeDriverPath = "drivers/chromedriver.exe";
				// Setting the property for the ChromeDriver path
				//System.setProperty("webdriver.chrome.driver", chromeDriverPath);
				WebDriverManager.chromedriver().setup();
				// Initializing the WebDriver for Chrome
				driver = new ChromeDriver();
				break;
			case "firefox":
				// Configuring the path for GeckoDriver (Linux)
				//String geckoDriverPath = "drivers/geckodriver.exe";
				// Setting the property for the GeckoDriver path
				//System.setProperty("webdriver.gecko.driver", geckoDriverPath);
				WebDriverManager.firefoxdriver().setup();
				// Initializing the WebDriver for Firefox
				driver = new FirefoxDriver();
				break;
			default:
				throw new IllegalArgumentException("Unsupported browser: " + browser);
			}

		}
		
		
		return driver;
	}
	
	public static void closeBrowser(WebDriver driver) {
	      if(driver != null) {
	          driver.quit();
	      }
	  }
	
}