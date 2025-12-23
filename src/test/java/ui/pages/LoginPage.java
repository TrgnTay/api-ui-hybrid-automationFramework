package ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ui.base.BasePage;

public class LoginPage extends BasePage{
	
	private final By usernameInput = By.id("user-name");
	private final By passwordInput = By.id("password");
	private final By loginButton = By.id("login-button");
	private final By errorMessage = By.cssSelector("h3[data-test='error']");
	
	public LoginPage(WebDriver driver) {
		
		super(driver);
		
		
	}
	
	public LoginPage enterUsername(String username) {
		
		type(usernameInput, username);
		return this; // return current page object	
		
	}
		
		public LoginPage enterPassword(String password) {
			
			type(passwordInput, password);
			return this;
			
		}
		
		public void clickLogin() {
			
			click(loginButton);		
			
		}
		
		public String getErrorMessage() {
			
			return getText(errorMessage);
			
			
			
		}
		
		
		
	}


