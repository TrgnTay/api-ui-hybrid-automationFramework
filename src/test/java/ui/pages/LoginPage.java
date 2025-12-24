package ui.pages;

import org.openqa.selenium.By;
import ui.base.BasePage;

public class LoginPage extends BasePage {

    private final By username = By.id("user-name");
    private final By password = By.id("password");
    private final By loginBtn = By.id("login-button");
    private final By error = By.cssSelector("[data-test='error']");

    public LoginPage enterUsername(String value) {
        type(username, value);
        return this;
    }

    public LoginPage enterPassword(String value) {
        type(password, value);
        return this;
    }

    public void submit() {
        click(loginBtn);
    }

    public String getError() {
        return getText(error);
    }
}
