package ui.cucumber.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import ui.config.UiConfig;
import ui.driver.DriverFactory;
import ui.driver.DriverManager;

public class UiHooks {

    @Before("@ui")
    public void setUp() {
        DriverManager.setDriver(DriverFactory.createDriver());
        DriverManager.getDriver().get(UiConfig.getBaseUrl());
    }

    @After
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
