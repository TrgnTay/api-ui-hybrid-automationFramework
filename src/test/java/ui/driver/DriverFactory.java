package ui.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ui.config.UiConfig;

import java.time.Duration;

public final class DriverFactory {

    private DriverFactory() {}

    public static WebDriver createDriver() {

        BrowserType browser =
                BrowserType.valueOf(UiConfig.getBrowser());

        WebDriver driver;

        switch (browser) {
            case FIREFOX:
                driver = new FirefoxDriver();
                break;

            case EDGE:
                driver = new EdgeDriver();
                break;

            case CHROME:
            default:
                driver = new ChromeDriver();
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        driver.manage().window().maximize();

        return driver;
    }
}
