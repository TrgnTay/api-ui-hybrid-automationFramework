package ui.pages;

import org.openqa.selenium.By;
import ui.base.BasePage;

public class InventoryPage extends BasePage {

    private final By inventory = By.id("inventory_container");

    public boolean isLoaded() {
        return isDisplayed(inventory);
    }
}
