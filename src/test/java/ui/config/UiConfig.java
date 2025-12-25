package ui.config;

import ui.driver.BrowserType;
import utils.ConfigReader;

public class UiConfig {

    private UiConfig() {
        // prevent instantiation
    }

    public static BrowserType getBrowser() {
        // CLI override: -Dbrowser=firefox
        String cliBrowser = System.getProperty("ui_browser");

        String browser =
                (cliBrowser != null)
                        ? cliBrowser
                        : ConfigReader.get("ui_browser");

        return BrowserType.valueOf(browser.toUpperCase());
    }

    public static boolean isHeadless() {

        // 1Always force headless in Jenkins
        if (System.getenv("JENKINS_HOME") != null) {
            return true;
        }

        // CLI override (local / CI)
        String cliValue = System.getProperty("headless");
        if (cliValue != null) {
            return Boolean.parseBoolean(cliValue);
        }

        // Config fallback (local only)
        return Boolean.parseBoolean(ConfigReader.get("headless"));
    }


    public static String getBaseUrl() {
        return ConfigReader.get("ui_baseUrl");
    }
}
