package ui.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import ui.config.UiConfig;
import utils.ConfigReader;

public class DriverFactory {
	
	
	
	
	
	
	
	public static WebDriver createDriver() {
		
		
		
		
		
	    return createDriver(UiConfig.getBrowser());
	}
	

    public static WebDriver createDriver(BrowserType browserType) {
    	
 
    	
    	
    	

        switch (browserType) {

            case CHROME -> {
                ChromeOptions options = new ChromeOptions();
                if (UiConfig.isHeadless()) {
                    options.addArguments("--headless=new");
                    options.addArguments("--disable-gpu");
                    options.addArguments("--no-sandbox");
                    options.addArguments("--disable-dev-shm-usage");
                    options.addArguments("--window-size=1920,1080");
                }
                return new org.openqa.selenium.chrome.ChromeDriver(options);
            }

            case FIREFOX -> {
                FirefoxOptions options = new FirefoxOptions();
                if (UiConfig.isHeadless()) {
                    options.addArguments("--headless");
                }
                return new org.openqa.selenium.firefox.FirefoxDriver(options);
            }

            case EDGE -> {
            	System.setProperty(
            	        "webdriver.edge.driver",
            	        "D:\\QA Softwares\\edgedriver_win64\\msedgedriver.exe"
            	    );
            	 EdgeOptions options = new EdgeOptions();

            	    if (UiConfig.isHeadless()) {
            	    	options.addArguments("--headless=new");
            	        options.addArguments("--disable-gpu");
            	        options.addArguments("--no-sandbox");
            	        options.addArguments("--disable-dev-shm-usage");
            	        options.addArguments("--window-size=1920,1080");
            	    }

            	    return new org.openqa.selenium.edge.EdgeDriver(options);

            }
            default -> throw new IllegalArgumentException("Unsupported browser: " + browserType);
        }
        
        
        
        
        
        
    }
}

