package ui.cucumber.steps;

import io.cucumber.java.en.*;
import ui.pages.InventoryPage;
import ui.pages.LoginPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class LoginSteps {
	
	private final LoginPage loginPage = new LoginPage();
    private final InventoryPage inventoryPage = new InventoryPage();

    @Given("I am on the SauceDemo login page")
    public void i_am_on_the_sauce_demo_login_page() {
        // Navigation handled in Cucumber Hooks
        // This step exists to make the scenario readable
    }

    @When("I login with username {string} and password {string}")
    public void i_login_with_username_and_password(String username, String password) {
        loginPage
                .enterUsername(username)
                .enterPassword(password)
                .submit();
    }

    @Then("the inventory page should be displayed")
    public void the_inventory_page_should_be_displayed() {
        assertThat(inventoryPage.isLoaded(), is(true));
    }

    @Then("a login error message should be shown")
    public void a_login_error_message_should_be_shown() {
        assertThat(loginPage.getError().isEmpty(), is(false));
    }

}
