package ui.config;

public final class UiConfig {

    private UiConfig() {}

    public static String getBaseUrl() {
        return System.getProperty("ui.base.url", "https://www.saucedemo.com/");
    }

    public static String getBrowser() {
        return System.getProperty("browser", "chrome").toUpperCase();
    }
}
