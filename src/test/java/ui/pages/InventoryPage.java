package ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ui.base.BasePage;

public class InventoryPage extends BasePage {
	
	private final By inventoryContainer = By.id("inventory_container");
	
	public InventoryPage(WebDriver driver) {
		
		super(driver);
		
		
	}
	
public boolean isInventoryDisplayed() {
	
	return isDisplayed(inventoryContainer);
	
	
	
	
}
	
	
	
}
