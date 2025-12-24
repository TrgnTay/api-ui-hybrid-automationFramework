package ui.tests;

import org.testng.annotations.Test;

import ui.base.BaseTest;
import ui.pages.InventoryPage;
import ui.pages.LoginPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
public class LoginTest extends BaseTest {
	
	// TC-UI-AUTH-001
	//Login with valid credentials
	
	
	@Test(groups = {"ui","smoke"})
	
	public void shouldLoginWithValidCredentials() {
		
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.enterUsername("standard_user")
		.enterPassword("secret_sauce")
		.clickLogin();
		
		InventoryPage inventoryPage = new InventoryPage(driver);
		
		assertThat(inventoryPage.isInventoryDisplayed(), is(true));
	}
	
	
	

}
